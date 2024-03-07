class Calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add( double n1,int n2){
        return n1+n2;
    }
}


public class methodOver {
    public static void main(String[] args) {
        int num1=2;
        int num2=4;
        int num3=8;
        Calculator obj= new Calculator();
        int r1= obj.add( num1,num2,num3);
        System.out.println(r1);
    }
}
