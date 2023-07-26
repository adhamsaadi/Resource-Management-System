package login;

import DataConnection.ConnectionClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginHandling {
    
   private static ArrayList<Login_1> loginList = new ArrayList();
    /* Loading the data from database*/   
   public static boolean load()
   {
       if (!loginList.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("SELECT * FROM login;");
        
        if(resultSet == null)
            return false;
        
         try{
            while(resultSet.next()){
                
              loginList.add(new Login_1(Integer.parseInt(resultSet.getObject(1).toString()),resultSet.getObject(2).toString(),
                      resultSet.getObject(3).toString()));
            }
            System.out.println("loaded with size of " + loginList.size());
        }catch(SQLException e){
        }
       return true;
   }
   /* Generating the unique Login ID*/
   public static int LoginID()
   {
         if (!loginList.isEmpty())
             return loginList.get(loginList.size()-1).getSn()+1;
         else
             return 1;
     
    }
   /* Getting Access to the login */  
   public static boolean access(String user, String pass)
   {
       load();
        for(int i=0; i<loginList.size(); i++)
        {
           if(loginList.get(i).getLogin().equals(user) && loginList.get(i).getPassword().equals(pass))
                return true;
        }
        return false;
   }

     
}

