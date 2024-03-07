class student{
    int rollno;
    String name;
    int marks;
}
public class Arrays{
    public static void main(String a[]){
        student s1=new student();
        s1.rollno=1;
        s1.name="Navin";
        s1.marks=88;

        student s2=new student();
        s2.rollno=2;
        s2.name="Arya";
        s2.marks=66;

        student s3=new student();
        s3.rollno=3;
        s3.name="Kishore";
        s3.marks=97;


        student students[]= new student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s2;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name +" : "+ students[i].marks);
        }

        int nums[]=new int[4];
        nums[0]=4;
        nums[1]=5;
        nums[2]=6;
        nums[3]=7;
        for(int n: nums){
            System.out.println(n);
        }
        
    }
}