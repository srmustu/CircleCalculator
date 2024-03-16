import java.util.Scanner;
public class CircleCircumferenceCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String message1,message2,message3;
        double r,calculator,pi;

        message1 = "Welcome to circle circumference calculator :)";
        message2 = "Enter the lenght of the radius of the circle : ";
        message3 = "Circumference of your circle : ";

        System.out.println(message1 + "\n" + message2);
        r = input.nextDouble();

        pi = 3.14;
        calculator = (2*pi)*r;

        System.out.println(message3 + calculator);
    }
}
