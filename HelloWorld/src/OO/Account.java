// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
package OO;

public class Account 
{
    private String name; // váriavel de instância
    private double balance; // variável de instânciaa
    
    // Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance) 
    {
        this.name = name; // atribui name à variável de instância name

        // valida que balance é maior que 0.0; se não for;
        // a vari´avel de instância balance mantém seu valor inicial padrão de 0.0.
        if (balance > 0.0) // se o saldo for válido
            this.balance = balance; // o atribui à variável de instância balance
    }

    // método retorna o saldo da conta
    public double getBalance() 
    {
        return balance;
    }

    // método que define o nome 
    public void setName(String name)
    {
        this.name = name; // armazena o nome
    }
    
    // método para recupera o nome do objeto
    public String getName()
    {
        return name; // retorna valor do nome para o chamador
    }

    // método que adiciona ao saldo
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // se o valor do depósito for válido
        balance += depositAmount; // adiciona ao saldo
    }
} // fim da classe Account
