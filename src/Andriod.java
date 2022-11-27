public class Andriod extends Mobile{
    //Constructor to set properties/characteristics of object
    public Andriod(String man, String m, String o, int c) {
        super(man, m, o, c);
    }
    //Method to get access Model property of Object
//    public String getModel(){
//        return "This is Android Mobile- " + getModel();
//    }
    public void forAndriod (String m){
        System.out.println("This is Android Mobile- " + getModel());
    }
}
