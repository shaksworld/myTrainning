public class Mobile {
    //the class field
    private String manufactural;
    private String model;
    private String operatingSystem;
    private int cost;
    private int numbers;

    //the class constructor


    public Mobile(String manufactural, String model, String operatingSystem, int cost) {
        this.manufactural = manufactural;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.cost = cost;
        this.numbers = 20;
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

    public int getNumbers() {
        return numbers;
    }
    //gggggg

}
