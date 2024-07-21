import java.util.Scanner;

public class Vocal_no_vocal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            
            char letra;

            System.out.println("Dame una letra: ");
            letra=teclado.next().charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Es vocal.");   
            } else {
            System.out.println("No es vocal");
            }
        }
    }
}
