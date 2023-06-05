package SegundaConvocatoriaEjercicios.UF4;

public class Avion {
    String nombreAvion;
    int asientosAvion;
    int autonomiaAvion;
    String revisionAvion;
    String responsableReparacionAvion;

    public Avion(String nombreAvion, int asientosAvion, int autonomiaAvion, String revisionAvion,
            String responsableReparacionAvion) {
        this.nombreAvion = nombreAvion;
        this.asientosAvion = asientosAvion;
        this.autonomiaAvion = autonomiaAvion;
        this.revisionAvion = revisionAvion;
        this.responsableReparacionAvion = responsableReparacionAvion;
    }

    // gestters y seters

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public int getAsientosAvion() {
        return asientosAvion;
    }

    public void setAsientosAvion(int asientosAvion) {
        this.asientosAvion = asientosAvion;
    }

    public int getAutonomiaAvion() {
        return autonomiaAvion;
    }

    public void setAutonomiaAvion(int autonomiaAvion) {
        this.autonomiaAvion = autonomiaAvion;
    }

    public String getRevisonAvion() {
        return revisionAvion;
    }

    public void setRevisionAvion(String revisionAvion) {
        this.revisionAvion = revisionAvion;
    }

    public String getResponsableReparacionAvion() {
        return responsableReparacionAvion;
    }

    public void setResponsableReparacionAvion(String responsableReparacionAvion) {
        this.responsableReparacionAvion = responsableReparacionAvion;
    }

    @Override
    public String toString() {
        return "Avión: " + nombreAvion + "\n" +
                "Asientos disponibles: " + asientosAvion + "\n" +
                "Autonomía: " + autonomiaAvion + " km\n" +
                "Fecha de última revisión: " + revisionAvion + "\n" +
                "Responsable de la reparación: " + responsableReparacionAvion;
    }

}
