// this program will calcuate the simple intrest
public class si {
    public static int simpleintrest(int a, int b, int c) {
        int res = (a*b*c)/100;//  assigning the result to the formula of simple intrest
    return res;// showing the return of the method that is made
    }
    public static void main(String[] args) {
        int principal = 100000;
        int time = 5;
        int rate = 5;
        int SI=simpleintrest(principal, time, rate);
        System.out.println("Mr.bob's simple interest after 5 years is: " + SI);
    }

    
    
}

