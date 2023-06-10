import java.util.Scanner;

public class CircleCalculations {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Digite o raio do círculo: ");
        int radius = input.nextInt();

        // calcular e imprimir o diâmetro
        int diameter = 2 * radius;
        System.out.printf("O diâmetro do círculo é: %d%n", diameter);


        // calcular e imprimir a circuferência
        double circumference = 2 * Math.PI * radius;
        System.out.printf("A circunferência do círculi é: %.2f%n", circumference);


        // calcular e imprimir a área
        double area = Math.PI * radius * radius;
        System.out.printf("A área do círculo é: %.2f%n", area);


        input.close();
    }
}
