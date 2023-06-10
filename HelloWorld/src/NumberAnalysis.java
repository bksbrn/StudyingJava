import java.util.Scanner;


public class NumberAnalysis {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);


        int positives = 0;
        int negatives = 0;
        int zeros = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int num = input.nextInt();


            if (num >0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }


        System.out.printf("Positivos: %d%nNegativos: %d%nZeros: %d%n", positives, negatives, zeros);


        input.close();
    }
}
