class Computer{
    public void  playMusic(){
        System.out.println("Music Playing");
    }
    public String getMeApen(int cost){
        if(cost>=10){
            return"Pen";
        }
        return "Nothing"; 
    }
}


public class methods {
    public static void main(String[] args) {
         Computer obj = new Computer();
         obj.playMusic();
         String str = obj.getMeApen(4);
        System.out.println(str);
    }
}
