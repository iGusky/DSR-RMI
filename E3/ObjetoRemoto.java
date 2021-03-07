package E3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {


    @Override
    public double calcularPoligonoIrregular(ArrayList<Double> array) throws RemoteException {
        double area = 0;
        for( int i = 0; i < array.size() ; i=i+2){
            double aux = ( (array.get(i) + array.get(i+1))/2 );
            area += aux;
        }
        return area;
    }

    @Override
    public double calcularPoligonoRegular(double lado, double perimetro, double apotema) throws RemoteException {

    private static final long serialVersionUID = 1L;

    public ObjetoRemoto() throws RemoteException {
        super();
    }




    @Override
    public double calcularRadioCirculo(double radio) throws RemoteException {
        // TODO Auto-generated method stub
        return 0;
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
