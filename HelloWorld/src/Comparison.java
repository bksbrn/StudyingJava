// import java.util.Scanner; // programa utiliza a classe Scanner

// public class Comparison {
//     // método main inicia a execução do aplicativo Java
//     public static void main(String[] args) {
        
//         // cria Scanner para obter entrada a partir da linha de comando
//         Scanner input = new Scanner(System.in);

//         int number1; // primeiro número a comparar
//         int number2; // segundo número a comparar

//         System.out.print("Enter first integer: "); // prompt
//         number1 = input.nextInt(); // lê o primeiro número
        
//         System.out.print("Enter second integer: "); // prompt
//         number2 = input.nextInt(); // lê o segundo número

//         if (number1 == number2)
//         System.out.printf("%d == %d%n", number1, number2);

//         if (number1 != number2)
//         System.out.printf("%d != %d%n", number1, number2);

//         if (number1 > number2)
//         System.out.printf("%d > %d%n", number1, number2);

//         if (number1 < number2)
//         System.out.printf("%d < %d%n", number1, number2);

//         if (number1 <= number2)
//         System.out.printf("%d <= %d%n", number1, number2);

//         if (number1 >= number2)
//         System.out.printf("%d >= %d%n", number1, number2);
//     }



import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison {
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        
        // cria Scanner para obter entrada a partir da linha de comando
        Scanner input = new Scanner(System.in);

        int x; // primeiro número a comparar
        int y; // segundo número a comparar
        int z;
        int result;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter trird integer: ");
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("Product is %d%n", result);

        input.close();
    }
}