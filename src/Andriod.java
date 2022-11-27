public class Andriod extends Mobile{
    //Constructor to set properties/characteristics of object
    public Andriod(String man, String m, String o, int c) {
        super(man, m, o, c);
    }

    public void forAndriod (String m){

        System.out.println("This is Android Mobile- " + getModel());
    }
}
