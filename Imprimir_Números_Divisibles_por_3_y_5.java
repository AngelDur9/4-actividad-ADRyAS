public class Imprimir_Números_Divisibles_por_3_y_5 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 y 100 que son divisibles por 3 y 5:");
        for (int I = 1; I <= 100; I++) {
            if (I % 3 == 0 && I % 5 == 0) {
                System.out.println(I);
            }
        }
    }
}
