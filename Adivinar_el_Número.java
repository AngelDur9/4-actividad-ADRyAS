import java.util.Random;
import java.util.Scanner;

public class Adivinar_el_Número {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        Random RandomGenerator = new Random();
        int NumeroAleatorio = RandomGenerator.nextInt(100) + 1;
        int Intento = 0;
        int Numero;

        System.out.println("Adivina el número entre 1 y 100:");

        do {
            System.out.print("Ingresa tu suposición: ");
            Numero = T.nextInt();
            Intento++;

            if (Numero > NumeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else if (Numero < NumeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            }
        } while (Numero != NumeroAleatorio);

        System.out.println("¡Felicidades! Adivinaste el número en " + Intento + " intentos.");
        
    }
}
