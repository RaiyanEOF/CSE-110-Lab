public class Task07{
    public static void main(String[] args){
        int Minutes = 3456789;
        int Days = Minutes/(24*60);
        int Year = Days/365;
        int Days_Remain = Days%365;
        System.out.println(" This is the result: " + Year + "Years " + Days_Remain + "Days" );
    }
}
