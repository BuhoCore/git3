package uia.com.inventarios;

import java.io.IOException;

public class ApartadoMaterial extends NivelInventario {

    String condiciones="BuenasCondiciones";

    public ApartadoMaterial(){

    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
    public ApartadoMaterial(String condiciones) {
        this.condiciones = condiciones;
    }

    public String toString() {
        return condiciones;
    }

}
