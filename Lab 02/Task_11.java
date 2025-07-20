public class Task11{
    public static void main(String[] args){
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt( Math.pow(2, 4.5) + Math.pow(2, 9.5));
        double x = a/c;
        double y = b/c;
        double p = b/c;
        double q = a/c;
        System.out.println("Sin(A) =" + x);
        System.out.println("Cos(A) =" + y);
        System.out.println("Sin(B) =" + p);
        System.out.println("Sin(A) =" + q);
    }
}
