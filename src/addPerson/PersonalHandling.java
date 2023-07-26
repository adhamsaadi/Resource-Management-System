package addPerson;

import DataConnection.ConnectionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonalHandling {
    
    private static ArrayList<PersonalInfo> pi = new ArrayList();
    public static boolean Load() 
     {
         if(!pi.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from personalinfo;");
                       
        try{
            while(resultSet.next()){
            pi.add(new PersonalInfo(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(), 
                     resultSet.getObject(3).toString(),resultSet.getObject(4).toString(), resultSet.getObject(5).toString(), resultSet.getObject(6).toString(), 
                    resultSet.getObject(7).toString()));
            }
            System.out.println("loaded with size of " + pi.size());
        }catch(SQLException e){
        }
        return true;
        
         }
     public static int PersonID()
     {
         if (!pi.isEmpty())
             return pi.get(pi.size()-1).getId()+1;
         else
             return 1;
     
     }
     
     public static void Save(PersonalInfo pi1) throws SQLException 
     {       
        try {
             
         unique(pi1);
        PreparedStatement ps=  ConnectionClass.getPreStatement("insert into personalinfo(id, name, phone, race, dob, email, address)" +
                 "values ( ?,?,?,?,?,?,? )");
         ps.setInt(1, pi1.getId());
         ps.setString(2, pi1.getName());
         ps.setString(3, pi1.getPhone());
         ps.setString(4, pi1.getRace());
         ps.setString(5, pi1.getDob());
         ps.setString(6, pi1.getEmail());
         ps.setString(7, pi1.getAddress());

         ps.execute();
         }catch(IllegalArgumentException e){
           
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
     public static void unique(PersonalInfo pi1)
     {
         for (int i = 0; i < pi.size(); i ++)
         {
             if (pi1.getId() == pi.get(i).getId())
                  throw new IllegalArgumentException("Record against this ID '"+pi1.getId()+"' is already exist ");    
         }
     }
     
    public static void arrayDispose()
    {
        pi.clear();
    }
    
    public static PersonalInfo searchByID(int id)
    {
        try
        {
            Load();       
            for(int i=0; i<pi.size(); i++)
                if(pi.get(i).getId()==id)
                    return pi.get(i);
            
        }catch(Exception e){
        }
        return null;        
    }
    
    public static ArrayList<PersonalInfo> search(String search) 
    {
        Load();
        ArrayList<PersonalInfo> send = new ArrayList();
        
        for (int i = 0; i < pi.size(); i++)
        {
            if (String.valueOf(pi.get(i).getId()).toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
            else if (pi.get(i).getName().toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
            else if (String.valueOf(pi.get(i).getPhone()).toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
        }
        arrayDispose();
        return send;
        
    }
   public static ArrayList<PersonalInfo> getArray()
   {
       return pi;
   }
   
   public static void UpdateRecord(PersonalInfo pi1)
   {
       try {
       
       Load();
       
       PreparedStatement ps=  ConnectionClass.getPreStatement("Update personalinfo SET name = ?, phone = ? , race = ?, "
               + "dob = ?, email = ?, address = ? where id = "+pi1.getId());
         
         ps.setString(1, pi1.getName());
         ps.setString(2, pi1.getPhone());
         ps.setString(3, pi1.getRace());
         ps.setString(4, pi1.getDob());
         ps.setString(5, pi1.getEmail());
         ps.setString(6, pi1.getAddress());

         ps.execute();
         
         for(int i=0; i<pi.size(); i++)
             if(pi.get(i).getId() == pi1.getId())
             {
                 pi.set(i, pi1);
                 break;
             }
         
         }catch(SQLException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

         
   }
   
 }
