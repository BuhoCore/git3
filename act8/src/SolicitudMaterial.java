import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class SolicitudMaterial {
    static  ArrayList<SolicitudMaterial> MaterialDisponible = new ArrayList<SolicitudMaterial>();
    String solicitante,itesmColeccion_Item,idSolicitante,id,fecha,estatus;


    public SolicitudMaterial() {
    }

    public SolicitudMaterial(String solicitante, String idSolicitante, String id, String fecha, String estatus, String itesmColeccion_Item) {
        this.solicitante = solicitante;
        this.idSolicitante = idSolicitante;
        this.id = id;
        this.fecha = fecha;
        this.estatus = estatus;
        this.itesmColeccion_Item = itesmColeccion_Item;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(String idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getItesmColeccion_Item() {
        return itesmColeccion_Item;
    }

    public void setItesmColeccion_Item(String itesmColeccion_Item) {
        this.itesmColeccion_Item = itesmColeccion_Item;
    }
}
