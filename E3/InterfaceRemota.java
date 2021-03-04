package E3;

import java.rmi.*;
import java.util.ArrayList;

public interface InterfaceRemota extends Remote {
   public double calcularPoligonoIrregular(ArrayList<Double> array) throws RemoteException;
   public double calcularPoligonoRegular(double lado, double perimetro, double apotema) throws RemoteException;
   public double calcularRadioCirculo(double radio) throws RemoteException;

}