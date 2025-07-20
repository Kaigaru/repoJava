import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        int choice;
        Scanner scanner = new Scanner(System.in);
        /*
        //substring
        String email = "kaigaku@gmail.com";
        String username = email.substring(0,email.indexOf("@"));
        System.out.println(username);
        System.out.println(email.substring(email.indexOf("@")+1));
         //ternary operator
        String evenOrOdd = (number%2 == 0)? "EVEN" : "ODD"
         */

        System.out.print("Menu:\n" +
                "1.🛒 Shopping Cart\n" +
                "2.📈 Interest Calculator\n" +
                "3.📄 Weight Conversion Program\n" +
                "4.🎈 Temperature Converter\n" +
                "option:");

        choice = scanner.nextInt();
        switch(choice){
            //Shopping cart program
            case 1:
                scanner.nextLine();
                System.out.print("What item would you like to buy?: ");
                String item = scanner.nextLine();
                System.out.print("What is the price for each?: ");
                double price = scanner.nextDouble();
                System.out.print("How many would you like: ");
                int amount = scanner.nextInt();

                double total;
                //formula
                total = price*amount;

                System.out.printf("\nYou have bought %d %s/s",amount, item);
                System.out.println("\nYour total is $" + total);
                break;
            case 2:
                //Interest Calculator
                int timesCompounded, numYear;
                double finalAmount, amountP, rate;
                System.out.print("Enter the principal amount: ");
                amountP = scanner.nextDouble();
                System.out.print("Enter the interest rate (in %): ");
                rate = scanner.nextDouble()/100;
                System.out.print("Enter the # of times compounded per year: ");
                timesCompounded = scanner.nextInt();
                System.out.print("Enter the # of years: ");
                numYear = scanner.nextInt();

                //formula
                finalAmount = amountP*(Math.pow((1+rate/timesCompounded),timesCompounded*numYear));
                System.out.printf("The amount after %d years is %.2f",numYear,finalAmount);
                break;

            case 3:
                //Weight Conversion Program
                int option;
                double input, output;
                System.out.println("Weight Conversion Program\n" +
                        "1:Convert lbs to kgs\n" +
                        "2:Convert kgs to lbs");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();
                System.out.println("\n");
                if(option == 1){
                    System.out.print("Enter the weight in lbs: ");
                    input = scanner.nextDouble();
                    output = input * 0.453592;
                    System.out.printf("The new weight in kgs: %.2f\n", output);
                }
                else if(option == 2){
                    System.out.print("Enter the weight in kgs: ");
                    input = scanner.nextDouble();
                    output = input * 2.20462 ;
                    System.out.printf("The new weight in lbs: %.2f\n", output);
                }
                else{
                    System.out.println("no such option");}
                break;

            case 4:
                double temperature, newTemp;
                String tChoice;
                System.out.print("Enter the temperature: ");
                temperature = scanner.nextDouble();
                System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
                tChoice = scanner.next().toUpperCase();
                newTemp = (tChoice.equals("C")) ? (temperature - 32)*5/9 : (temperature*9/5) + 32;
                System.out.printf("%.2f%s",newTemp,tChoice);

                break;


            default:
                System.out.println("NO such option!!!");

        }


        scanner.close();
    }
}