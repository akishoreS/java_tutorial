
class Calculator{
    int a;

    public int add(int n1,int n2){
        System.out.println("in add");
        int r= n1+n2;
        return r;
    }
}

public class Classes {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;

        Calculator calc= new Calculator();

        // calc.add();
        int result = calc.add(num1,num2);

        System.out.println(result); 
    }
}
