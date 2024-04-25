import com.conversordemonedas.modelos.CambioMoneda;
import com.conversordemonedas.modelos.Conversor;
import com.conversordemonedas.modelos.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        Menu menu = new Menu();
        int opcion = 1;
        try{
            while(opcion!=7){
                menu.mostrarMenu();
                opcion = lectura.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        double monto = lectura.nextDouble();
                        String resultado = conversor.convertir(monto, "USD", "ARS");
                        System.out.println(resultado);
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = lectura.nextDouble();
                        resultado = conversor.convertir(monto, "ARS", "USD");
                        System.out.println(resultado);
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = lectura.nextDouble();
                        resultado = conversor.convertir(monto, "USD", "BRL");
                        System.out.println(resultado);
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = lectura.nextDouble();
                        resultado = conversor.convertir(monto, "BRL", "USD");
                        System.out.println(resultado);
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = lectura.nextDouble();
                        resultado = conversor.convertir(monto, "USD", "COP");
                        System.out.println(resultado);
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = lectura.nextDouble();
                        resultado = conversor.convertir(monto, "COP", "USD");
                        System.out.println(resultado);
                        break;
                    case 7:
                        System.out.println("Saliendo del Programa");
                        break;
                    default:
                        System.out.println("Esa no es una opcion valida, por favor seleccione una opcion valida");
                }
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error"+e.getMessage());
        }



    }
}
