package uia.com.inventarios;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SolicitudMaterialTemporal extends InfoInventarioUIA{


    public void CU(){

        List<InfoInventarioUIA> items = new ArrayList<InfoInventarioUIA>();
        List<InfoInventarioUIA> ubicacionitem  = new ArrayList<InfoInventarioUIA>(items);
        System.out.println("Item info ubicacion " + ubicacionitem);
        /*
        System.out.println("clave: " + catalogo.getOrDefault(1,"Catalogo"));
        */
    }

    public void solicitudCompraTemporal(){

        List<InfoInventarioUIA> ListaSCTitems = new ArrayList<InfoInventarioUIA>();



    }

    public void AlmacenamientoItems(){

    }

}
