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

    public String getNombreAvion(){
        return nombreAvion;
    }
    public void setNombreAvion(String nombreAvion){
        this.nombreAvion = nombreAvion;
    }

    public int getAsientosAvion(){
        return asientosAvion;
    }
    public void setAsientosAvion(int asientosAvion){
        this.asientosAvion = asientosAvion;
    }
}
