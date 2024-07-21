import java.util.Scanner;

public class Generar_una_Secuencia_Aritmética {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.print("Ingresa el primer número de la secuencia: ");
        int PrimerNumero = T.nextInt();

        System.out.print("Ingresa la diferencia entre los números: ");
        int Diferencia = T.nextInt();

        System.out.print("Ingresa el número máximo hasta el cual la secuencia debe continuar: ");
        int NumeroMaximo = T.nextInt();

        int NumeroActual = PrimerNumero;

        do {
            System.out.println(NumeroActual);
            NumeroActual += Diferencia;
        } while (NumeroActual <= NumeroMaximo);

    }
}

