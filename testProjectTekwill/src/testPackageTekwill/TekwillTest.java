package testPackageTekwill;

import java.util.Scanner;

public class TekwillTest {
    public static void main(String[] args) {


        String name = "Pusca";
        String surname = "Iulia";
        String message;
        message = name + " " + surname;
        System.out.println("My name is: " + message);


        //#3.4
        System.out.println("Please enter the temperature in Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        int valueInF = scan.nextInt();

        int valueInC = (5 * (valueInF - 32)) / 9;

        System.out.println("The temperature in Celsius is: " + valueInC);

        //#4.4
        System.out.println("Please insert the minutes: ");
        Scanner scn = new Scanner(System.in);
        int valMin = scn.nextInt();

        int valueInYears = valMin / 525600;
        int valueInDays = valMin / 1440;

        System.out.println("The number of years is: " + valueInYears + " and " + "the number of days is: " + valueInDays);


        //#4.5
        System.out.println("Please enter two integers: ");

        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            Scanner scann = new Scanner(System.in);
            arr[i] = scann.nextInt();
        }

        int nSum = arr[0] + arr[1];
        int nDiff = arr[0] - arr[1];
        int nProduct = arr[0] * arr[1];
        int nAvg = (arr[0] + arr[1]) / 2;
        int nRemainerOfDev = arr[0] % arr[1];

        System.out.println("The sum is : " + nSum);
        System.out.println("The diff is : " + nDiff);
        System.out.println("The product is : " + nProduct);
        System.out.println("The avg is : " + nAvg);
        System.out.println("The remainer of devision is : " + nRemainerOfDev);
    }

}
