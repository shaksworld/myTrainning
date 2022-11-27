public class Main {
    public static void main(String[] args) {
        Decagon decadev = new Decagon("Sq 13", "Shaks", 12); //initialize
        decadev.toPass("SQ13 " + "Shaks " + 12);
         Car tesla = new Car("horn");
         Car bmw = new Car("steering","tyre", "engine","wheels");
         tesla.drive("steeirng", "tyre", "50 house power", "wheels");
         bmw.honk("honing");
         //declaring object for Iphone
         Iphone iphone = new Iphone("man", "IOS", "o", 3);
         iphone.forPhone("m");

         //declaring object for Andriod
        Andriod andriod = new Andriod("man", "Samsung", "o", 4);
        andriod.forAndriod("m");

        //new project
        Overload overload = new Overload();
        overload.print(10);
        overload.print("Amit");
        overload.print("Hello", 100);
    }
}