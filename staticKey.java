class Mobile{
    String brand;/* instance keyword*/
    int price;
    static String name;  // static keyword

    static{
        name= "Phone";
        System.out.println("in static block");
    } //Static Block:    it will be called only once irrespective of the no. of objects defined

    public void show(){
        System.out.println(brand +": "+ price +": "+name);
    }// instance method


    public static void show1(){
        System.out.println(" in staic method");
    }/*static method: we can use a static varible inside a static method but 
    cannot use non-static variable inside a sttic method directly*/

    public Mobile(){
        brand= "";
        price = 200;
        System.out.println("in constructor");
        // name= "Phone" instead of this declare static method
    }//constructor will be called every time when an object is created 
}


public class staticKey {
    public static void main(String a[]){
    Mobile obj1 = new Mobile();
    obj1.brand ="APple";
    obj1.price = 1500;
    // obj1.name="Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand ="japle";
    obj2.price = 1600;
    // obj2.name="Smartphone";

    Mobile.name ="Phone";
    

    obj1.show();
    obj2.show();
    Mobile.show1();

    }
}
