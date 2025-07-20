import java.util.Scanner;
  public class Task08{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Give me an ID:");
        int ID = x.nextInt();
        int a = ID/1000000;
        int b = ID/100000;
        int r = b%10;
        if(r==1)
        {
            System.out.println("Student Joined BRAC in Spring " + a );
        }
        else if(r==2)
        {
            System.out.println("Student Joined BRAC in Fall " + a);
        }
        else if(r==3)
        {
            System.out.println("Student Joined BRAC in Summer " + a);
        }
        else
        {
            System.out.println("Invalid");
        }
        x.close();
    }
}
