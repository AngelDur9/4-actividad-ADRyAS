import java.util.Scanner;
public class Contar_a {
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);

        String palabra;
        int contador=0;
        System.out.print("Ingresa una palabra: ");
        palabra=dato.nextLine();
        for (int i=0; i<palabra.length(); i++){
            if(palabra.charAt(i)=='a'){
                contador++;
            }
    }
    System.out.println("La cantidad de letras a en la palabra es de "+ contador+ " letras");
}
}