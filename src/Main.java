import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /** Programa que calcule la conversion de dolares a pesos.*
         */
        final double TASA_DOLAR= 56.25;
        double monto;
        double total;
        String usuario;
        Scanner scanner= new Scanner(System.in);

        System.out.print( "Ingrese su nombre");
        usuario = scanner.nextLine();

        System.out.println("ingrese el monto en dolares que desea convertir a pesos");
        monto= scanner.nextDouble();

        total = TASA_DOLAR * monto;
        System.out.println("Bienvenido");
        System.out.println("La conversion del monto en dolares en pesos es: RD$  " + total );
    }
}