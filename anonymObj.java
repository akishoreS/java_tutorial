class A{

    public A(){
        
        System.out.println("Object Created");
        
    }
    public void show(){
        
        System.out.println("in A Show"); 

    }

}

public class anonymObj {
     public static void main(String a[]){
        int marks;
        marks=99;

        A obj = new A();
        obj.show();
     }
}
 