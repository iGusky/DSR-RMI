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
        // TODO Auto-generated method stub
        return 0;
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
