package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos;

public class NumRandom {
    public static int Random(int n){
        if(n < 0){
            throw new IllegalArgumentException("Tiene que ser un numero positivo");
        }
        return new java.util.Random().nextInt(n + 1);
    
    }
}