import java.util.Scanner;

public class Calcular_la_Media_de_Números_Positivos {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int Suma = 0;
        int Contador = 0;

        System.out.println("Ingresa números positivos. Para terminar, ingresa un número negativo.");

        while (true) {
            System.out.print("Ingresa un número: ");
            int Numero = T.nextInt();

            if (Numero < 0) {
                break;
            }

            Suma += Numero;
            Contador++;
        }

        if (Contador > 0) {
            double Media = (double) Suma / Contador;
            System.out.println("La media de los números positivos ingresados es: " + Media);
        } else {
            System.out.println("No ingresaste ningún número positivo.");
        }

    }
}
