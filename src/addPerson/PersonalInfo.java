package addPerson;

public class PersonalInfo {
    
    private int id = 0;
    private String name;
    private String address;
    private String race;
    private String phone;
    private String dob;
    private String email;
  

    public PersonalInfo(int id, String name, String phone, String race, String dob, String email, String address) {
        setId(id);
        setName(name);
        setAddress(address);
        setRace(race);
        setPhone(phone);
        setDob(dob);
        setEmail(email);
        
        
    }

    public boolean setId(int id) {
       if (id > 0)
         this.id = id;
       else {
         this.id = id *-1;
        throw new IllegalArgumentException("Person ID must be in positive Integers.");
       }
       return true;
    }    

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRace(String race) {
       
        this.race = race;

    }

    public void setPhone(String phone) {
         this.phone = phone;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
      
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRace() {
        return race;
    }

    public String getPhone() {
        return phone;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    } 
    
    
}
