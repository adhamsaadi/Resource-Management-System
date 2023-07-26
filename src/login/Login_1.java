package login;

public class Login_1 {
     
     private int sn = 1;
     private String login;
     private String password;

    /* Constructor */
    public Login_1( int sn, String login, String password)
    {
        setSn(sn);
        setLogin(login);
        setPassword(password);

        
    }

    

    public void setSn(int sn)
    {
        this.sn = sn;
    }

    public boolean setLogin(String log)
    {
        login = log;
        return true;
    }
    
    public boolean setPassword(String pass)
    {
        password = pass;
        return true;
    }
    
    public String getLogin()
    {
        return login;
    }
    
    public String getPassword()
    {
        return password;
    }

    
    public int getSn()
    {
        return sn ;
    }

    
    
}
