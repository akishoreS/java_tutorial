public class Switch {
    public static void main(String[] args){
         int n=1;
        //  if(n==1)
        //     System.out.println("Monday");
        // else if(n==2)
        //     System.out.println("Tuesday");
        // else if(n==3)
        //     System.out.println("Wednesday");
        // else
        //     System.out.println("Frinday");

        switch(n){
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                    System.out.println("Wednesday");
                    break;
            case 4:
                    System.out.println("Friday");
                    break;
            default:
                    System.out.println("Enter a valid number");

        }
        // new switch statement
        // String day ="Sunday";

        // switch(day)
        // {
        //     case "Saturday","Sunday"->System.out.println("6am");
            
        //     case "Monday"->System.out.println("8am");

        //     default->System.out.println("7am");
        // }
         String day ="Sunday";
        String result ="";  

        result = switch(day)
        {
            case "Saturday","Sunday"->"6am";
            
            case "Monday"-> "8am";

            default->"7am";
        };

        System.out.println(result);

    }
}

 