import java.util.Scanner;

public class FindMaxAndMin {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o número inteiro %d:", i + 1);
            int num = input.nextInt();

            if (num > min) {
                min = num;
            }


            if (num > max) {
                max = num;
            }
        }

        System.out.printf("O menor que é: %d%n", min);
        System.out.printf("O maior que é: %d%n", max);


        input.close();
    }
}
