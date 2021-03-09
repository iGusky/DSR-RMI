package E3;

import java.rmi.*;
import java.util.ArrayList;

public interface InterfaceRemota extends Remote {
   public double calcularPoligonoIrregular(double area) throws RemoteException;
   public double calcularPoligonoRegular(double numLado, double lado, double apotema) throws RemoteException;
   public double calcularCirculo(double radio) throws RemoteException;

}