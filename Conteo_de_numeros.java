import java.util.Scanner;
public class Conteo_de_numeros {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar? ");
        int Cantidad = T.nextInt();
        int MayoresQueCero = 0;
        int MenoresQueCero = 0;
        int IgualesACero = 0;
        for (int I = 0; I < Cantidad; I++) {
            System.out.print("Ingresa un número: ");
            int Numero = T.nextInt();
            if (Numero > 0) {
                MayoresQueCero++;
            } else if (Numero < 0) {
                MenoresQueCero++;
            } else {
                IgualesACero++;
            }
        }
        System.out.println("Números mayores que 0: " + MayoresQueCero);
        System.out.println("Números menores que 0: " + MenoresQueCero);
        System.out.println("Números iguales a 0: " + IgualesACero);
    }
}
