public class CI {
    double principal;
    double time;
    double rate;
    double result;
public static void main(String[] args) {
    double principal= 500000;
    double time=3;
    double rate=0.18;
    double result=principal*Math.pow(1+rate, time);
    System.out.println(" result " +result);
}
    
}