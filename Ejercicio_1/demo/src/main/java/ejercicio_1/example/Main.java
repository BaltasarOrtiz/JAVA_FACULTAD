package ejercicio_1.example;
import  ejercicio_1.example.modelos.ViajeroFrecuente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestor gestor = new Gestor(10);
       /* Menu de opciones */

        int opcion = 0;
        Scanner op = new Scanner(System.in);
        while (opcion != 4 ) {
            System.out.println("1. Agregar viajero");
            System.out.println("2. Mostrar viajero");
            System.out.println("3. Consultar millas");
            System.out.println("4. Acumular Millas");
            System.out.println("5. Canjear Millas");
            System.out.println("6. Mejor viajero");
            System.out.println("10. Salir");
            opcion = op.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de viajero");
                    int numero = op.nextInt();
                    System.out.println("Ingrese el DNI");
                    int dni = op.nextInt();
                    System.out.println("Ingrese las millas");
                    int millas = op.nextInt();
                    System.out.println("Ingrese el nombre");
                    String nombre = op.nextLine();  
                    op.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apellido = op.nextLine();
                    ViajeroFrecuente viajero = new ViajeroFrecuente(numero, dni, millas, nombre, apellido);
                    gestor.agregarViajero(viajero);
                    break;

                case 2:
                    System.out.println("Ingrese el numero de viajero");
                    int numViajero = op.nextInt();
                    gestor.mostrarViajero(numViajero);
                    break;

                case 3:
                    System.out.println("Ingrese el DNI");
                    int dni2 = op.nextInt();
                    gestor.consultarMillas(dni2);
                    break;

                case 4:
                    System.out.println("Ingrese el DNI");
                    int dni3 = op.nextInt();
                    System.out.println("Ingrese las millas a acumular");
                    int millas2 = op.nextInt();
                    gestor.acumularMillas(dni3, millas2);
                    break;

                case 5:
                    System.out.println("Ingrese el DNI");
                    int dni4 = op.nextInt();
                    System.out.println("Ingrese las millas a canjear");
                    int millas3 = op.nextInt();
                    gestor.canjearMillas(dni4, millas3);
                    break;

                case 6:
                    System.out.println("Mejor viajero");
                    gestor.mejorViajero();
                    break;

                case 10:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;  
            }

        }
        op.close();         
    }  
}