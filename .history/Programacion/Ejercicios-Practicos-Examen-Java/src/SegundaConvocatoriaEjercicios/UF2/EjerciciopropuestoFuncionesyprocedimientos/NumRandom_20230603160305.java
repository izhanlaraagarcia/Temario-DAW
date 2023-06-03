package SegundaConvocatoriaEjercicios.UF2.EjerciciopropuestoFuncionesyprocedimientos;

public class NumRandom {
    public static int gRandom(int n){
        if(n < 0){
            throw new IllegalArgumentException("Tiene que ser un numero positivo");
        }
        return new java.util.Random().nextInt(n + 1);
    }

    public static void Random(){
        int n = 100;
        for(int i = 0; i < 100; i++){
        }
        System.out.println("Este es tu numero random: " + gRandom(n));
    }
}