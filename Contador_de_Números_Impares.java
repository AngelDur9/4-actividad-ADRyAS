import java.util.Scanner;

public class Contador_de_Números_Impares {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int Numero = T.nextInt();

        int Contador = 1;

        do {
            if (Contador % 2 != 0) {
                System.out.println(Contador);
            }
            Contador++;
        } while (Contador <= Numero);

    }
}
