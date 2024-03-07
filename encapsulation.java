class Human{
    // private int age=11;
    // private String name="Navin";
    private int age;
    private String name;

   
    public int getAge(){
        return age;
    }
    
    
    // public void setAge(int a){
    //     age=a;
    // }
    
    
    public void setAge(int age){
        this.age=age;//this represents the instance keyword and not the local keyword
    }//this call the instance keyword or the object on which method is called
    
    
    // public void setName(String n){
    //     name=n;
    // }

    public void setName(String name){
        this.name=name;
    }
    
    
    public String getName(){
        return name;
    }
}



public class encapsulation {
     public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(8);
        // obj.age=11;
        // obj.name="Navin";
        obj.setName("Arya");
        System.out.println(obj.getAge()+" : "+ obj.getName());
        // System.out.println(obj.name);
     }
}
