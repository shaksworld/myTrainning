public class Mobile {
    //the class field
    private String manufactural;
    private String model;
    private String operatingSystem;
    private int cost;

    //the class constructor
    Mobile(String man, String m, String o, int c){
        this.manufactural = man;
        this.model = m;
        this.operatingSystem = o;
        this.cost = c;
    }

    //Method to get access Model property of Object
    public String getModel(){
        return this.model;
    }
    public String getManufactural(){
        return this.manufactural;
    }
    public String getOperatingSystem(){
        return this.operatingSystem;
    }
    public int getCost(){
        return this.cost;
    }


}
