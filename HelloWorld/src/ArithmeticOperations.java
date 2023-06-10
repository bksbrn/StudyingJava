import java.util.Scanner;

public class ArithmeticOperations {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;

        System.out.printf("A soma é: %d%n", sum);
        System.out.printf("O produto é: %d%n", product);
        System.out.printf("A diferença é: %d%n", difference);
        System.out.printf("O quociente é: %d%n", quotient);

        input.close();
    }
}
