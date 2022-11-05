import java.util.ArrayList;

public class FormaSolicitudMaterial {


public void MostrasrFormasConCopia(){


    ArrayList<SolicitudMaterial> inventario_Copia = new ArrayList<>(gestorSalidaInventario.inventario);
    for (SolicitudMaterial c:inventario_Copia){
        System.out.println("Copia_Solicitante: " + c.getSolicitante() + "\n Copia_IdSolicitante: " + c.getIdSolicitante() + "\n  Copia_ID: " + c.getId()+"\n  Copia_Fecha: " + c.getFecha()+"\n Copia_Estatus: " + c.getEstatus() + "\n Copia_ItesmColeccion_Item: " + c.getItesmColeccion_Item());



        }
    Menu.seleccion();
    }
}

