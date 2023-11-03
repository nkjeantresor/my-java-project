public class si {
    public static int simpleintrest(int a, int b, int c) {
        int res = (a*b*c)/100;
    return res;
    }
    public static void main(String[] args) {
        int principal = 100000;
        int time = 5;
        int rate = 5;
        int SI=simpleintrest(principal, time, rate);
        System.out.println("Mr.bob's simple interest after 5 years is: " + SI);
    }

    
    
}

