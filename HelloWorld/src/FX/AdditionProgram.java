package FX;

import javax.swing.JOptionPane;

public class AdditionProgram 
{
    public static void main(String[] args) {
        // obtém a entrada do usuário a partir de caixas de diálogo de entrada
        String firstNumber = JOptionPane.showInputDialog("Insira o primeiro número inteiro:");
        String secondNumber = JOptionPane.showInputDialog("Insiro o segundo número inteiro:");

        // converta as entradas de string para valores int
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);


        int sum = number1 + number2; // soma os números

        // exibe o resultado em uma caixa de diálogo de mensagem
        JOptionPane.showMessageDialog(null, "A soma é " + sum, "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
    }
    
}
