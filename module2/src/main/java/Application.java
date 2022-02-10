import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Addition"+ "\n" + "Press 2 for Subtraction " + "\n" + "Press 3 for Multiplication" + "\n" +  "Press 4 for Division" );
        int option = sc.nextInt();

        System.out.println("Enter two numbers: ");

        int value1 = sc.nextInt();
        int value2 = sc.nextInt();

        Implementation cal = new Implementation();
        //logic to implement and call required function
        if (option == 1) cal.addNumber(value1 , value2);
        else if (option == 2) cal.subtractNumber(value1 , value2);
        else if (option == 3) cal.multiplyNumber(value1 , value2);
        else if (option == 4) cal.divideNumber(value1 , value2);
        else System.out.println("Incorrect Option");

        sc.close();
    }
}