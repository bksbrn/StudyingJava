import java.util.Scanner;

public class CompareIntegers {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger.%n", num1);
        } else if (num1 < num2) {
            System.out.printf("%d is larger.%n", num2);
        } else {
            System.out.printf("These numbers are equal.");
        }


        input.close();
    }
    
}
