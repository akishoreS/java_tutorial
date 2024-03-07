public class string {
    public static void main(String a[]){
        // String name = new String("Arya");
        String name = " Arya";

        System.out.println("Hello "+ name);
        System.out.println(name.concat(" Kishore"));

        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        sb.append("Reddy");
        sb.insert(0,"Java ");
        System.out.print(sb);
    }

}
