package E3;
 import java.rmi.Naming;


public class Servidor{
    public Servidor(){
        try{
            System.setProperty("java.rmi.server.codebase",  "");
            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//", objetoRemoto);
            System.out.println("Iniciando servidor...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        new Servidor();
    }

}