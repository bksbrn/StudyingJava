public class Fatorial {
    public static void main(String[] args) {
        int num = 5;
        long factorial =1;
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.println("Fatorial de " + num + " = " + factorial);
    }
}
