/* A 

(public class Exercise1b {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) { // Erro era ( x < 10 )
            if (x > 3) { // Erro era ( x > 3)
                System.out.print("big X"); 
            }
        }
    }
    
}
*/

/* B

public class Exercise1b {
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x -1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
 */

 public class Exercise1b {
    public static void main(String[] args) {
        int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x > 3) {
            System.out.println("small x");
        }
    }
    }
 }