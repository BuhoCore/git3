import java.util.Scanner;
public class Menu {


    public static void seleccion() {

        String Menu;
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        do {

            System.out.println("\\\\\\\\\\\\\\BIENVENIDO Al MENU DE USUARIO\\\\\\\\\\\\\\\\\\");
            System.out.println("\\\\\\\\\\\\\\Control de Solicitudes \\\\\\\\\\\\\\\\\\");

            System.out.println("1. Crear Nueva Solicitud Material");
            System.out.println("2. Ver Solicitud Material");
            System.out.println("3. Mostrar Forma Con Copia ");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones :  ");
            opcion = teclado.nextInt();

        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1:
                 gestorSalidaInventario Sm = new gestorSalidaInventario();
                 Sm.AñadirMaterial();
                break;
            case 2:
                gestorSalidaInventario.listar();
                break;
            case 3:
                FormaSolicitudMaterial fc = new FormaSolicitudMaterial();
                fc.MostrasrFormasConCopia();
                break;
            case 4:
                salir = true;
                break;
            default:
                System.out.println("Solo números entre 1 y 4");

                System.out.println("Salir");


        }while (opcion !=5);
    }
}

