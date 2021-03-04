package E1;

import java.rmi.Naming;

public class Servidor {
    public Servidor(){
        try {
            System.setProperty(
                "java.rmi.server.codebase",
                "192.168.1.70");
            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//192.168.1.70/ObjetoRemoto", objetoRemoto);
            System.out.println("Server inciado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Servidor();
    }
}
