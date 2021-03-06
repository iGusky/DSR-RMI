package E3;

public class Cliente {
    public Cliente() {}
    int id;
double radio, numLado, lado, apotema;
Scanner entradaEscaner = new Scanner(System.in);
InterfaceRemota objetoRemoto = (InterfaceRemota) Naming.lookup("//ip/ObjetoRemoto");


System.out.println("Opcion");
            System.out.println(" 1 Calcular el area de un circulo");
            System.out.println(" 2 Calcular el area de un un poligono regular");
            System.out.println(" 3 Calcular el area de un un poligono irregular");

            id = entradaEscaner.nextInt();
            switch (id) {
                case 1:
                    System.out.println("Ingresa el radio : ");
                    radio = entradaEscaner.nextDouble();
                    System.out.println("El area del circulo es:" + objetoRemoto.calcularRadioCirculo(radio));
                    break;
                case 2:
                    System.out.println("Ingresa el numero de lados: ");
                    numLado = entradaEscaner.nextDouble();
                    System.out.println("Ingresa el lado : ");
                    lado = entradaEscaner.nextDouble();
                    System.out.println("Ingresa el apotema : ");
                    apotema = entradaEscaner.nextDouble();
                    System.out.println("El area del poligono regular es:" + objetoRemoto.calcularPoligonoRegular(numLado, lado, apotema));
                    break;
                case 3:
                    //poligono irregular
            }
    
}
