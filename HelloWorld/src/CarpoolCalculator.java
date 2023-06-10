import java.util.Scanner;


public class CarpoolCalculator {
    

    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);


    System.out.println("Informe os seguintes dados;");


    System.out.println("Quilômetros totais dirigidos por dia: ");
    double quilometrosPorDia = input.nextDouble();


    System.out.println("Preço por litro de gasolina: ");
    double precoGasolina = input.nextDouble();


    System.out.println("Quilômetros médios por litro: ");
    double quilometrosPorLitro = input.nextDouble();


    System.out.println("Taxas de estacionamento por dia: ");
    double taxasEstacionamento = input.nextDouble();

    
    System.out.println("Pedágio por dia: ");
    double pedagio = input.nextDouble();

    
    // Cálculo do custo diário de dirigir
    double consumoLitros = quilometrosPorDia / quilometrosPorLitro;
    double custoGasolina = consumoLitros / precoGasolina;
    double custoTotal = custoGasolina + taxasEstacionamento + pedagio;


    System.out.printf("O custo diário de dirigir é de R$ %.2f%n", custoTotal);


    input.close();

    }
}
