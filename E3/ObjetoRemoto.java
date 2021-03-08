package E3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {

    private static final long serialVersionUID = 1L;

    public ObjetoRemoto() throws RemoteException {
        super();
    }

    @Override
    public double calcularPoligonoIrregular(ArrayList<Double> array) throws RemoteException {
        double area = 0;
        System.out.println("Calculando área del poligono irregular");
        for( int i = 0; i < array.size() ; i=i+2){
            double aux = ( (array.get(i) + array.get(i+1))/2 );
            area += aux;
        }
        return area;
    }
   
    @Override
    public double calcularCirculo(double radio) throws RemoteException {
        
        double area = 0.00;
        System.out.println("Area del Circulo...")
        area = 3.1416 * Math.pow(radio,2);
        
        return area;
    }


    @Override
    public double calcularPoligonoRegular( double numLado, double lado, double apotema)
            throws RemoteException {
                double area= 0.0;
                double perimetro =0.0;
                System.out.println("Calculando el Area del Poligono regular...");
                
                    perimetro = numLado * lado;
                    area = perimetro * apotema/2;

        return area;
    }

    
}
