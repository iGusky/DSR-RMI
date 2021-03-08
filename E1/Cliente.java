package E1;

import java.rmi.Naming;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cliente {
  public Cliente() {

        double capital = 0.0;
        double interes = 0.0;
        double plazo = 0.0;
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> plazos = new HashMap<Integer, Integer>();
        plazos.put(1, 3);
        plazos.put(2, 5);
        plazos.put(3, 7);

        try {
            InterfaceRemota objetoRemoto = ( InterfaceRemota ) Naming.lookup("//192.168.1.70/ObjetoRemoto");
            System.out.print("Ingrese su capital (min. $10,000): $");
            capital = input.nextDouble(); 

            System.out.print("Ingrese el interes (6% - 9%): ");
            interes = input.nextDouble();

            System.out.print("Ingrese el plazo en años (3, 5 y 7): ");
            plazo = input.nextDouble();

            if ( !entradasValidas( capital, interes, plazo ) )
               { throw new Exception("Introduzac datos válidos");}    

            DecimalFormat df = new DecimalFormat("#.##");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Calculo: " + i);
                System.out.println("Plazo: " + plazos.get(i) + " años");
                System.out.println("Capital: " + capital);
                System.out.println("Interés: " + interes);
                System.out.println("Cuota mensual " +
                    df.format( objetoRemoto.cuotaMensual(capital, interes, plazos.get(i))) + " pesos." );
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean entradasValidas ( double capital, double interes, double plazo ){
        if( capital < 10000 || (interes < 6 && interes > 9) || (plazo != 3 && plazo != 5 && plazo != 7)  ){
            return false;}
        return true;
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
