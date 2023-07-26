package addAnimal;

public class AnimalInfo {
    private int animalid = 0;
    private String animalname;
    private String animalclass;
    
    public AnimalInfo(int animalid, String animalname, String animalclass) {
        setAnimalId(animalid);
        setAnimalName(animalname);
        setAnimalClass(animalclass);
     
    }
    
    public boolean setAnimalId(int animalid) {
       if (animalid > 0)
         this.animalid = animalid;
       else {
         this.animalid = animalid *-1;
        throw new IllegalArgumentException("Animal ID must be in positive Integers.");
       }
       return true;
    }  
    
    public void setAnimalName(String animalname) {
        this.animalname = animalname;
    }

    public void setAnimalClass(String animalclass) {
        this.animalclass = animalclass;
    }
    
    public int getAnimalId() {
        return animalid;
    }

    public String getAnimalName() {
        return animalname;
    }

    public String getAnimalClass() {
        return animalclass;
    }
    
}
