import java.util.Scanner;

public class cuadrados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero, i;
        double resultado; 
        System.out.println("Dame un Numero: ");
        numero=teclado.nextInt();
        do {
            System.out.println("los cuadrados de 1 hasta "+numero+" son");
            for (i=1;i<=numero;i++){
                resultado=Math.pow(i,2);
                System.out.println("el cuadrado de "+i+" es "+resultado);
            }
            System.out.println("Dame un Numero: ");
        numero=teclado.nextInt();
        } while (numero!=0);
    }
}
