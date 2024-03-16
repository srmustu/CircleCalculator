import java.util.Scanner;
public class AreaOfSliceOfCirclesCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String message1,message2,message3,message4;
        double r,calculator,pi,a;

        message1 = "Welcome to circle slice calculator :)";
        message2 = "Enter the lenght of the radius of the circle : ";
        message3 = "Slice area of your circle : ";
        message4 = "The angle of the circle segment whose area you want to measure : ";

        System.out.print(message1 + "\n" + message2);
        r = input.nextDouble();
        System.out.print(message4);
        a = input.nextDouble();


        pi = 3.14;
        calculator = ((pi*(r*r))*a)/360;

        System.out.println(message3 + calculator);
    }
}
