class A {
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();//John cena
        System.out.println("in A int");
    }
}//super class

class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }
    public B(int n){
        System.out.println("in B int");
    }

}
//Sub Class
public class thisuper {
    public static void main(String a[]){
        B obj = new B(7);
    }
    
}

