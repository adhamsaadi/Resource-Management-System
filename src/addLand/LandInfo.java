package addLand;

public class LandInfo {
    private int landid = 0;
    private String landname;
    private String landtype;
    
    public LandInfo(int landid, String landname, String landtype) {
        setLandId(landid);
        setLandName(landname);
        setLandType(landtype);
     
    }
    
    public boolean setLandId(int landid) {
       if (landid > 0)
         this.landid = landid;
       else {
         this.landid = landid *-1;
        throw new IllegalArgumentException("Land ID must be in positive Integers.");
       }
       return true;
    }  
    
    public void setLandName(String landname) {
        this.landname = landname;
    }

    public void setLandType(String landtype) {
        this.landtype = landtype;
    }
    
    public int getLandId() {
        return landid;
    }

    public String getLandName() {
        return landname;
    }

    public String getLandType() {
        return landtype;
    }
    
}
