package addPlant;

import DataConnection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlantHandling {
    private static ArrayList<PlantInfo> pi = new ArrayList();
    public static boolean Load() 
     {
         if(!pi.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from plantinfo;");
                       
        try{
            while(resultSet.next()){
            pi.add(new PlantInfo(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(), 
                     resultSet.getObject(3).toString()));
            }
            System.out.println("loaded with size of " + pi.size());
        }catch(SQLException e){
        }
        return true;
        
         }
     public static int PlantID()
     {
         if (!pi.isEmpty())
             return pi.get(pi.size()-1).getPlantId()+1;
         else
             return 1;
     
     }
     
     public static void Save(PlantInfo pi1) throws SQLException 
     {       
        try {
             
         unique(pi1);
        PreparedStatement ps=  ConnectionClass.getPreStatement("insert into plantinfo(plantid, plantname, plantclass)" +
                 "values ( ?,?,? )");
         ps.setInt(1, pi1.getPlantId());
         ps.setString(2, pi1.getPlantName());
         ps.setString(3, pi1.getPlantClass());


         ps.execute();
         }catch(IllegalArgumentException e){
           
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
     public static void unique(PlantInfo pi1)
     {
         for (int i = 0; i < pi.size(); i ++)
         {
             if (pi1.getPlantId() == pi.get(i).getPlantId())
                  throw new IllegalArgumentException("Record against this ID '"+pi1.getPlantId()+"' is already exist ");    
         }
     }
     
    public static void arrayDispose()
    {
        pi.clear();
    }
    
    public static PlantInfo searchByID(int id)
    {
        try
        {
            Load();       
            for(int i=0; i<pi.size(); i++)
                if(pi.get(i).getPlantId()==id)
                    return pi.get(i);
            
        }catch(Exception e){
        }
        return null;        
    }
    
    public static ArrayList<PlantInfo> search(String search) 
    {
        Load();
        ArrayList<PlantInfo> send = new ArrayList();
        
        for (int i = 0; i < pi.size(); i++)
        {
            if (String.valueOf(pi.get(i).getPlantId()).toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
            else if (pi.get(i).getPlantName().toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
            else if (String.valueOf(pi.get(i).getPlantClass()).toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
        }
        arrayDispose();
        return send;
        
    }
   public static ArrayList<PlantInfo> getArray()
   {
       return pi;
   }
   
   public static void UpdateRecord(PlantInfo pi1)
   {
       try {
       
       Load();
       
       PreparedStatement ps=  ConnectionClass.getPreStatement("Update plantinfo SET plantname = ?, plantclass = ? where id = " + pi1.getPlantId());
         
         ps.setString(1, pi1.getPlantName());
         ps.setString(2, pi1.getPlantClass());

         ps.execute();
         
         for(int i=0; i<pi.size(); i++)
             if(pi.get(i).getPlantId() == pi1.getPlantId())
             {
                 pi.set(i, pi1);
                 break;
             }
         
         }catch(SQLException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

         
   }

    
}
