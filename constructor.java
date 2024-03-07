class Human{
    private int age;
    private String name;

    public Human(){
        age=10;
        name="john";
        System.out.println("in Constructor");
    }//constructor: it will be called automatically whenever an object is created
    
    //Constructor Overloading
    public Human(int a,String n){
        age=a;
        n=name;

    }//Parameterized Constructor
    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}


public class constructor {
    public static void main(String a[]){
        Human obj = new Human();
        Human obj1= new Human(18,"Arya");
        System.out.println(obj1.getAge()+" "+ obj1.getName());
 
    }
}
