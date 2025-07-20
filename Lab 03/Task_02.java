import java.util.Scanner;
  public class Task02{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Input score:");
        double score = x.nextDouble();
        if ( score>=90 && score <=100)
            System.out.println("A");
        else if ( score>=85 && score <=89)
             System.out.println("-A");
        else if ( score>= 70 && score<=84)
             System.out.println("B");
        else if ( score>=57 && score<=69)
             System.out.println("C");
        else if ( score >=50 && score <=56)
             System.out.println("D");
        else 
             System.out.println("F");
        x.close();
    }
}
