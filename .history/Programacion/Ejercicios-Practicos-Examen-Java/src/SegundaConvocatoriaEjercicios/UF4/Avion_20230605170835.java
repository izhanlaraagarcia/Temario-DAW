package SegundaConvocatoriaEjercicios.UF4;

public class Avion {
    String nombreAvion;
    int asientosAvion;
    int autonomiaAvion;
    String revisionAvion;
    String responsableReparacionAvion;

    public Avion(String nombreAvion, int asientosAvion, int autonomiaAvion, String revisionAvion, String responsableReparacionAvion){
        this.nombreAvion = nombreAvion;
        this.asientosAvion = asientosAvion;
        this.autonomiaAvion = autonomiaAvion;
        this.revisionAvion = revisionAvion;
        this.responsableReparacionAvion = responsableReparacionAvion;
    }


    // gestters y seters

    public String getNombreAvion(String nombreAvion){
        return nombreAvion;
    }
    public void setNombreAvion(String nombreAvion){
        this.nombreAvion = nombreAvion;
    }

}
