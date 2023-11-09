class Adda{
    public int add(int num1, int num2){
        return num1 + num2;//returns addition of number 1 and 2
    }
}
public class object {
    public static void main(String [] args){
        //Create an instance of the Adder class

        Adda myAdder = new Adda();

        //USe the add method to add two numbers
        int result = myAdder.add(5,4);
        System.out.println("Result: " + result);}

}