import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        String opcion;
        System.out.println("Quieres realizar una operación SI o No");
        opcion=a.nextLine().toLowerCase();
        while (opcion.equals("si")) {  
            
            Scanner teclado = new Scanner(System.in);
            int num1, num2, resultado;
            String operador;
           

            System.out.println("Que operacion te interesa hacer");
            System.out.println("Suma, Resta, Multiplicacion, Divición");
            operador=teclado.nextLine().toLowerCase();
            switch (operador) {
                case "suma":
                    System.out.print("Dame el primer numero: ");
                    num1=teclado.nextInt();
                    System.out.print("Dame el segundo numero: ");
                    num2=teclado.nextInt();
                    resultado=num1+num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case "resta":
                System.out.print("Dame el primer numero: ");
                    num1=teclado.nextInt();
                    System.out.print("Dame el segundo numero: ");
                    num2=teclado.nextInt();
                    resultado=num1-num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case "multiplicacion":
                System.out.print("Dame el primer numero: ");
                    num1=teclado.nextInt();
                    System.out.print("Dame el segundo numero: ");
                    num2=teclado.nextInt();
                    resultado=num1*num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case "divicion":
                System.out.print("Dame el primer numero: ");
                    num1=teclado.nextInt();
                    System.out.print("Dame el segundo numero: ");
                    num2=teclado.nextInt();
                    resultado=num1/num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                    default:
                    System.out.println("No se tiene el operador");
            }

            System.out.println("Quieres realizar otra operación SI o No");
            opcion=a.nextLine().toLowerCase();
            
        }
        System.out.println("Terminaste de usar la calculadora");
    }
}
