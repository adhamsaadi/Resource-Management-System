package addPlant;

public class PlantInfo {
    private int plantid = 0;
    private String plantname;
    private String plantclass;
    
    public PlantInfo(int plantid, String plantname, String plantclass) {
        setPlantId(plantid);
        setPlantName(plantname);
        setPlantClass(plantclass);
     
    }
    
    public boolean setPlantId(int plantid) {
       if (plantid > 0)
         this.plantid = plantid;
       else {
         this.plantid = plantid *-1;
        throw new IllegalArgumentException("Plant ID must be in positive Integers.");
       }
       return true;
    }  
    
    public void setPlantName(String plantname) {
        this.plantname = plantname;
    }

    public void setPlantClass(String plantclass) {
        this.plantclass = plantclass;
    }
    
    public int getPlantId() {
        return plantid;
    }

    public String getPlantName() {
        return plantname;
    }

    public String getPlantClass() {
        return plantclass;
    }
    
}
