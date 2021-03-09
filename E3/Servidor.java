package E3;
 import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Servidor{
    public Servidor(){
        try{
            System.setProperty("java.rmi.server.codebase",  "25.77.243.46");
            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//25.77.243.46/ObjetoRemoto", objetoRemoto);
            // Registry reg=LocateRegistry.createRegistry(1099);
            // LocateRegistry.createRegistry(1099);
            System.out.println("Iniciando servidor...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        new Servidor();
    }

}