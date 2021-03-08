package E3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public Cliente() throws MalformedURLException, RemoteException, NotBoundException {
        int id;
        double radio, numLado, lado, apotema;
        Scanner entradaEscaner = new Scanner(System.in);
        InterfaceRemota objetoRemoto = (InterfaceRemota) Naming.lookup("//ip/ObjetoRemoto");


        System.out.println("Opcion");
        System.out.println(" 1 Calcular el area de un circulo");
        System.out.println(" 2 Calcular el area de un un poligono regular");
        System.out.println(" 3 Calcular el area de un un poligono irregular");

        id = entradaEscaner.nextInt();
        try{
            switch (id) {
                case 1:
                    System.out.println("Ingresa el radio : ");
                    radio = entradaEscaner.nextDouble();
                    System.out.println("El area del circulo es:" + objetoRemoto.calcularCirculo(radio));
                    break;
                case 2:
                    System.out.println("Ingresa el número de lados: ");
                    numLado = entradaEscaner.nextDouble();
                    System.out.println("Ingresa el lado : ");
                    lado = entradaEscaner.nextDouble();
                    System.out.println("Ingresa el apotema : ");
                    apotema = entradaEscaner.nextDouble();
                    System.out.println("El area del poligono regular es:" + objetoRemoto.calcularPoligonoRegular(numLado, lado, apotema));
                    break;
                case 3:
                    System.out.println("Ingrese el número de lados: ");
                    numLado = entradaEscaner.nextDouble();
                    ArrayList<Double> medidas = new ArrayList<>();
                    for (int i = 0; i < numLado; i++) {
                        System.out.print("Ingrese tamaño del lado "+i+": ");
                        medidas.add( entradaEscaner.nextDouble() );
                        System.out.print("Ingrese altura del lado "+i+": ");
                        medidas.add( entradaEscaner.nextDouble() );
                        System.out.println("-----------------------");
                    }

                    System.out.println("El área del poligono irregular es: "+ objetoRemoto.calcularPoligonoIrregular(medidas));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
