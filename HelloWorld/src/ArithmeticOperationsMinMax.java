import java.util.Scanner;

public class ArithmeticOperationsMinMax {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;

        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }


        System.out.printf("Soma é: %d%n", sum);
        System.out.printf("Média é: %d%n", average);
        System.out.printf("Produto é: %d%n", product);
        System.out.printf("Menor que é: %d%n", smallest);
        System.out.printf("Maior que é: %d%n", largest);


        input.close();
    }
}
