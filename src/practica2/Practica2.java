package practica2;

public class Practica2 {

    public static void main(String[] args) {
        int tamaño = 25000;
        DatosEstadisticos de = new DatosEstadisticos();
        int[] vec = GeneraCaso.generaVector(tamaño, false);
        //Ordenar1Vector a = new Ordenar1Vector();
        Ordenar2Vector b = new Ordenar2Vector();
        b.ordena(vec, de);
        //a.ordena(vec, de);
        CompruebaCaso.compruebaVector(vec, vec.length);
        //CompruebaCaso.compruebaVector(vec, vec.length);
        //System.out.println(a.nombreMetodo());
        System.out.println(b.nombreMetodo());
        System.out.println("Vector de " + tamaño + " elementos  - " + de.dameTiempo() + " segundos en ordenar.");
    }

}
