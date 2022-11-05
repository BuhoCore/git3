import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class gestorSalidaInventario {
    public static ArrayList<SolicitudMaterial> inventario = new ArrayList<SolicitudMaterial>();


    public static void AñadirMaterial(){

        String solicitante;
        String idSolicitante;
        String id;
        String fecha;
        String estatus;
        String itesmColeccion_Item;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Solicitante");
        solicitante = teclado.nextLine();
        System.out.println("id de Solicitante");
        idSolicitante = teclado.nextLine();
        System.out.println("id");
        id = teclado.nextLine();
        System.out.println("fecha");
        fecha = teclado.nextLine();
        System.out.println("estatus");
        estatus = teclado.nextLine();
        System.out.println("itesmColeccion_Item");
        itesmColeccion_Item = teclado.nextLine();

        SolicitudMaterial agregar = new SolicitudMaterial( solicitante,  idSolicitante,  id,  fecha,  estatus,  itesmColeccion_Item);
        inventario.add(agregar);
        System.out.println("Se Agregaron con Excito");
        Menu.seleccion();
    }

    public static void listar(){
        if (inventario.size()==0){
            System.out.println("\n Solicitud Material se encuentra vacias \n");
        }
        else {
            System.out.println("\ntienes las Solicitudes Material \n ");
            for (SolicitudMaterial p:inventario){
                System.out.println("Solicitante: "+p.getSolicitante()+"\n IdSolicitante: "+p.getIdSolicitante()+"\n  ID: "+p.getId()+"\n  Fecha: "+p.getFecha()+"\n Estatus: "+p.getEstatus()+"\n ItesmColeccion_Item: "+p.getItesmColeccion_Item());

            }
            System.out.println("\n");
        }
        Menu.seleccion();
    }

}
