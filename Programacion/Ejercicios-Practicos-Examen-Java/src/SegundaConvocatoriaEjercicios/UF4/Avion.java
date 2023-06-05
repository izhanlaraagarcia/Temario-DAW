package SegundaConvocatoriaEjercicios.UF4;

/**
 * Clase que representa un avión.
 */
public class Avion {
    String nombreAvion;
    int asientosAvion;
    int autonomiaAvion;
    String revisionAvion;
    String responsableReparacionAvion;

    /**
     * Constructor de la clase Avion.
     * 
     * @param nombreAvion               el nombre del avión
     * @param asientosAvion             el número de asientos disponibles en el avión
     * @param autonomiaAvion            los kilómetros de autonomía del avión
     * @param revisionAvion             la fecha de última revisión del avión
     * @param responsableReparacionAvion el nombre y apellidos del responsable de la reparación del avión
     */
    public Avion(String nombreAvion, int asientosAvion, int autonomiaAvion, String revisionAvion,
            String responsableReparacionAvion) {
        this.nombreAvion = nombreAvion;
        this.asientosAvion = asientosAvion;
        this.autonomiaAvion = autonomiaAvion;
        this.revisionAvion = revisionAvion;
        this.responsableReparacionAvion = responsableReparacionAvion;
    }

    // getters y setters

    /**
     * Obtiene el nombre del avión.
     * 
     * @return el nombre del avión
     */
    public String getNombreAvion() {
        return nombreAvion;
    }

    /**
     * Establece el nombre del avión.
     * 
     * @param nombreAvion el nombre del avión a establecer
     */
    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    /**
     * Obtiene el número de asientos disponibles en el avión.
     * 
     * @return el número de asientos disponibles en el avión
     */
    public int getAsientosAvion() {
        return asientosAvion;
    }

    /**
     * Establece el número de asientos disponibles en el avión.
     * 
     * @param asientosAvion el número de asientos disponibles en el avión a establecer
     */
    public void setAsientosAvion(int asientosAvion) {
        this.asientosAvion = asientosAvion;
    }

    /**
     * Obtiene los kilómetros de autonomía del avión.
     * 
     * @return los kilómetros de autonomía del avión
     */
    public int getAutonomiaAvion() {
        return autonomiaAvion;
    }

    /**
     * Establece los kilómetros de autonomía del avión.
     * 
     * @param autonomiaAvion los kilómetros de autonomía del avión a establecer
     */
    public void setAutonomiaAvion(int autonomiaAvion) {
        this.autonomiaAvion = autonomiaAvion;
    }

    /**
     * Obtiene la fecha de última revisión del avión.
     * 
     * @return la fecha de última revisión del avión
     */
    public String getRevisionAvion() {
        return revisionAvion;
    }

    /**
     * Establece la fecha de última revisión del avión.
     * 
     * @param revisionAvion la fecha de última revisión del avión a establecer
     */
    public void setRevisionAvion(String revisionAvion) {
        this.revisionAvion = revisionAvion;
    }

    /**
     * Obtiene el nombre y apellidos del responsable de la reparación del avión.
     * 
     * @return el nombre y apellidos del responsable de la reparación del avión
     */
    public String getResponsableReparacionAvion() {
        return responsableReparacionAvion;
    }

    /**
     * Establece el nombre y apellidos del responsable de la reparación del avión.
     * 
     * @param responsableReparacionAvion el nombre y apellidos del responsable de la reparación del avión a establecer
     */
    public void setResponsableReparacionAvion(String responsableReparacionAvion) {
        this.responsableReparacionAvion = responsableReparacionAvion;
    }

    /**
     * Devuelve una representación en forma de cadena del avión.
     * 
     * @return una representación en forma de cadena del avión
     */
    @Override
    public String toString() {
        return "Avión: " + nombreAvion + "\n" +
                "Asientos disponibles: " + asientosAvion + "\n" +
                "Autonomía: " + autonomiaAvion + " km\n" +
                "Fecha de última revisión: " + revisionAvion + "\n" +
                "Responsable de la reparación: " + responsableReparacionAvion;
    }
}
