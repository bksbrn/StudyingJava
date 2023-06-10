import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite uma temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit");


        input.close();
    }
}