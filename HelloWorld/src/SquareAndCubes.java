public class SquareAndCubes {


    public static void main(String[] args) {
        

        System.out.println("Número quadrado cubo");


        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;


            System.out.printf("%d     %d     %d%n", i, square, cube);
        }
    }
    
}
