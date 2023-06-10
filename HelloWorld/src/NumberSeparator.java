import java.util.Scanner;


public class NumberSeparator {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);


        System.out.println("Digite um número de cinco digítos: ");
        int number = input.nextInt();


        int firstDigit = number / 10000;
        int secondDigit = (number % 10000) / 1000;
        int thirdDigit = (number % 1000) / 100;
        int fourDigit = (number % 100) / 10;
        int fifthDigit = number % 10;


        System.out.printf("%d      %d     %d      %d     %d%n", firstDigit, secondDigit, thirdDigit, fourDigit, fifthDigit);


        input.close();
    }
}
