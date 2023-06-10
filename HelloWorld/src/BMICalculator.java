import java.util.Scanner;


public class BMICalculator {
    

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);


        System.out.println("Digite o seu peso em quilogramas: ");
        double peso = input.nextDouble();

        System.out.println("Digite a sua altura em metros: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);


        System.out.printf("Seu IMC é %.2f%n", imc);


        System.out.println("Valores de IMC:");
        System.out.println("Abaixo do peso: menos do que 18.5");
        System.out.println("Normal: entre 18.5  24.9");
        System.out.println("Sobrepeso: entre 25 e 29.9");
        System.out.println("Obeso: 30 ou maior");


        input.close();
    }
}
