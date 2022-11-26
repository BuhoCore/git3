package uia.com.inventarios;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GestorRetiroInventario extends ReporteRetiroInventario
    
{
    List<SolicitudRetiroMat> items = new ArrayList<SolicitudRetiroMat>();


    public GestorRetiroInventario(IRetiroInventario inventario)
    {
        super(inventario);
    }

    public GestorRetiroInventario(String nombre)
    {
        super();
        //this.gestorApartado = new GestorApartado();
    }

    public GestorRetiroInventario() {

    }


    public void serializa(SolicitudRetiroMat newSSM, String nom) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(nom), newSSM);
    }




    public List<SolicitudRetiroMat> getItems()
    {
        return this.items;
    }


    public void setItems(List<SolicitudRetiroMat> items) {
        this.items = items;
    }


    public SolicitudRetiroMat agregaSolicitudSalidaMat(String nomArchivo, String solicitante, String categoria) throws IOException {
        String id = nomArchivo+"_"+String.valueOf(this.getItems().size()+1)+".json";
        String existencia = "";
        IRetiroInventario inventario=null;
        SolicitudRetiroMat newSSM = new SolicitudRetiroMat(super.inventario, id, solicitante, categoria);
        return newSSM;
    }

    @Override
    public void print() {

    }

    public void cargaSolicitudRetiroToInventario() {

        for (int i = 0; i < this.sem.getInventario().getItems().size(); i++) {
            for (Map.Entry<String, InfoItem> item : this.sem.getInventario().getItems().entrySet()) {
                InfoItem partida = item.getValue();

                for (Map.Entry<String, InfoItem> subpartida : partida.getItems().entrySet()) {

                    for (Map.Entry<String, InfoItem> categoria : subpartida.getValue().getItems().entrySet()) {
                        categoria.getValue().print();


                    }




                }

                    }


                    }

                }
                ;

    public void serializaNivelInventario(String nombre) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File(nombre), this.inventario);

    }


}
