package addAnimal;

import DataConnection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalHandling {
    private static ArrayList<AnimalInfo> ai = new ArrayList();
    public static boolean Load() 
     {
         if(!ai.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from animalinfo;");
                       
        try{
            while(resultSet.next()){
            ai.add(new AnimalInfo(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(), 
                     resultSet.getObject(3).toString()));
            }
            System.out.println("loaded with size of " + ai.size());
        }catch(SQLException e){
        }
        return true;
        
         }
     public static int AnimalID()
     {
         if (!ai.isEmpty())
             return ai.get(ai.size()-1).getAnimalId()+1;
         else
             return 1;
     
     }
     
     public static void Save(AnimalInfo pi1) throws SQLException 
     {       
        try {
             
         unique(pi1);
        PreparedStatement ps=  ConnectionClass.getPreStatement("insert into animalinfo(animalid, animalname, animalclass)" +
                 "values ( ?,?,? )");
         ps.setInt(1, pi1.getAnimalId());
         ps.setString(2, pi1.getAnimalName());
         ps.setString(3, pi1.getAnimalClass());


         ps.execute();
         }catch(IllegalArgumentException e){
           
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
     public static void unique(AnimalInfo pi1)
     {
         for (int i = 0; i < ai.size(); i ++)
         {
             if (pi1.getAnimalId() == ai.get(i).getAnimalId())
                  throw new IllegalArgumentException("Record against this ID '"+pi1.getAnimalId()+"' is already exist ");    
         }
     }
     
    public static void arrayDispose()
    {
        ai.clear();
    }
    
    public static AnimalInfo searchByID(int id)
    {
        try
        {
            Load();       
            for(int i=0; i<ai.size(); i++)
                if(ai.get(i).getAnimalId()==id)
                    return ai.get(i);
            
        }catch(Exception e){
        }
        return null;        
    }
    
    public static ArrayList<AnimalInfo> search(String search) 
    {
        Load();
        ArrayList<AnimalInfo> send = new ArrayList();
        
        for (int i = 0; i < ai.size(); i++)
        {
            if (String.valueOf(ai.get(i).getAnimalId()).toUpperCase().contains(search.toUpperCase()))
                send.add(ai.get(i));
            else if (ai.get(i).getAnimalName().toUpperCase().contains(search.toUpperCase()))
                send.add(ai.get(i));
            else if (String.valueOf(ai.get(i).getAnimalClass()).toUpperCase().contains(search.toUpperCase()))
                send.add(ai.get(i));
        }
        arrayDispose();
        return send;
        
    }
   public static ArrayList<AnimalInfo> getArray()
   {
       return ai;
   }
   
   public static void UpdateRecord(AnimalInfo ai1)
   {
       try {
       
       Load();
       
       PreparedStatement ps=  ConnectionClass.getPreStatement("Update animalinfo SET animalname = ?, animalclass = ? where id = " + ai1.getAnimalId());
         
         ps.setString(1, ai1.getAnimalName());
         ps.setString(2, ai1.getAnimalClass());

         ps.execute();
         
         for(int i=0; i<ai.size(); i++)
             if(ai.get(i).getAnimalId() == ai1.getAnimalId())
             {
                 ai.set(i, ai1);
                 break;
             }
         
         }catch(SQLException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

         
   }

    
}
