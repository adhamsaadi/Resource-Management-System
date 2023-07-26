package addLand;

import DataConnection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LandHandling {
    private static ArrayList<LandInfo> li = new ArrayList();
    public static boolean Load() 
     {
         if(!li.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from landinfo;");
                       
        try{
            while(resultSet.next()){
            li.add(new LandInfo(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(), 
                     resultSet.getObject(3).toString()));
            }
            System.out.println("loaded with size of " + li.size());
        }catch(SQLException e){
        }
        return true;
        
         }
     public static int LandID()
     {
         if (!li.isEmpty())
             return li.get(li.size()-1).getLandId()+1;
         else
             return 1;
     
     }
     
     public static void Save(LandInfo li1) throws SQLException 
     {       
        try {
             
         unique(li1);
        PreparedStatement ps=  ConnectionClass.getPreStatement("insert into landinfo(landid, landname, landtype)" +
                 "values ( ?,?,? )");
         ps.setInt(1, li1.getLandId());
         ps.setString(2, li1.getLandName());
         ps.setString(3, li1.getLandType());


         ps.execute();
         }catch(IllegalArgumentException e){
           
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
     public static void unique(LandInfo pi1)
     {
         for (int i = 0; i < li.size(); i ++)
         {
             if (pi1.getLandId() == li.get(i).getLandId())
                  throw new IllegalArgumentException("Record against this ID '"+pi1.getLandId()+"' is already exist ");    
         }
     }
     
    public static void arrayDispose()
    {
        li.clear();
    }
    
    public static LandInfo searchByID(int id)
    {
        try
        {
            Load();       
            for(int i=0; i<li.size(); i++)
                if(li.get(i).getLandId()==id)
                    return li.get(i);
            
        }catch(Exception e){
        }
        return null;        
    }
    
    public static ArrayList<LandInfo> search(String search) 
    {
        Load();
        ArrayList<LandInfo> send = new ArrayList();
        
        for (int i = 0; i < li.size(); i++)
        {
            if (String.valueOf(li.get(i).getLandId()).toUpperCase().contains(search.toUpperCase()))
                send.add(li.get(i));
            else if (li.get(i).getLandName().toUpperCase().contains(search.toUpperCase()))
                send.add(li.get(i));
            else if (String.valueOf(li.get(i).getLandType()).toUpperCase().contains(search.toUpperCase()))
                send.add(li.get(i));
        }
        arrayDispose();
        return send;
        
    }
   public static ArrayList<LandInfo> getArray()
   {
       return li;
   }
   
   public static void UpdateRecord(LandInfo pi1)
   {
       try {
       
       Load();
       
       PreparedStatement ps=  ConnectionClass.getPreStatement("Update landinfo SET landname = ?, landclass = ? where id = " + pi1.getLandId());
         
         ps.setString(1, pi1.getLandName());
         ps.setString(2, pi1.getLandType());

         ps.execute();
         
         for(int i=0; i<li.size(); i++)
             if(li.get(i).getLandId() == pi1.getLandId())
             {
                 li.set(i, pi1);
                 break;
             }
         
         }catch(SQLException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

         
   }

    
}
