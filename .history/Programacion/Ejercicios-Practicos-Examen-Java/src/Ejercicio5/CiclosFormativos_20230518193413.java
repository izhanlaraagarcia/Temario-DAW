import java.util.ArrayList;
import java.util.List;

public class CiclosFormativos {
    public int codigo;
    public String nombreCiclo;
    

    public CiclosFormativos(int codigo, String nombreCiclo) {
        this.codigo = codigo;
        this.nombreCiclo = nombreCiclo;
    }

    // Geters y seters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }
}
