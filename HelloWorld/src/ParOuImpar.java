import java.util.Scanner;

public class ParOuImpar {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);


        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é impar.");
        }


        input.close();
    }
}
