public class Task13{
    public static void main(String[] args){
        double Distance = 1564;
        double time = (5*3600)+(56*60)+23;
        double mps = Distance/time;
        double kmhr = mps*3.6;
        double mph = mps*2.23;
        System.out.println(kmhr + "km/h");
        System.out.println(mph + "mile/h");
    }
}
