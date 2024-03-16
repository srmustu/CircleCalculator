import java.util.Scanner;
public class CircleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String message1,message2,message3;
        double r,calculator,pi;

        message1 = "Welcome to circle area calculator :)";
        message2 = "Enter the lenght of the radius of the circle : ";
        message3 = "Area of your circle : ";

        System.out.print(message1 + "\n" + message2);
        r = input.nextDouble();

        pi = 3.14;
        calculator = (r*r)*pi;
        System.out.print(message3 + calculator);



    }
}
