package E3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public Cliente() throws MalformedURLException, RemoteException, NotBoundException {
        int id;
        double radio, numLado, lado, apotema;
        Scanner entradaEscaner = new Scanner(System.in);
        InterfaceRemota objetoRemoto = (InterfaceRemota) Naming.lookup("//25.77.243.46/ObjetoRemoto");
        // Registry reg=LocateRegistry.getRegistry("25.77.243.46",1099);
        // LocateRegistry.createRegistry(1099);
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

                   
                    // ArrayList<Double> medidas = new ArrayList<>();
                    double medidas [] = new double[50];
                    int index = 0;
                    for (int i = 0; i < numLado; i++) {
                        System.out.print("Ingrese tamaño del lado "+i+": ");
                        medidas[index] = ( entradaEscaner.nextDouble() );
                        index++;
                        System.out.print("Ingrese altura del lado "+i+": ");
                        medidas[index] = ( entradaEscaner.nextDouble() );
                        index++;
                        System.out.println("-----------------------");
                    }
                    double aux = 0,area = 0;
                    for( int i = 0; i < medidas.length ; i=i+2){
                        aux = ( (medidas[i] + medidas[i+1]) );
                        area = area + aux;
                    }

                    System.out.println("El área del poligono irregular es: "+ objetoRemoto.calcularPoligonoIrregular(area));
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws RemoteException,MalformedURLException,NotBoundException {
        new Cliente();
    }

}
