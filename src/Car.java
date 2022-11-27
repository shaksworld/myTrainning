public class Car {
    private String steering;
    private String tyre;
    private  String engine;
    private String wheels;
    private  String horn;


    public Car(String steering, String tyre, String engine, String wheels){
        this.steering = steering;
        this.tyre = tyre;
        this.engine = engine;
        this.wheels = wheels;
    }
    public Car(String horn){
        this.horn = horn;
    }
    public void drive (String steering, String tyre, String engine, String wheels){
        System.out.println("i'm driving a black tesla");
    }
    public  void  honk (String horn){

        System.out.println("i'm honking");
    }

}
