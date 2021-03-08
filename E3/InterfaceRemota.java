package E3;

import java.rmi.*;
import java.util.ArrayList;

public interface InterfaceRemota extends Remote {
   public double calcularPoligonoIrregular(ArrayList<Double> array) throws RemoteException;
   public double calcularPoligonoRegular(double numLado, double lado, double apotema) throws RemoteException;
   public double calcularCirculo(double radio) throws RemoteException;

}