package practica2;

public class ComparaMetodos {

    public static void main(String[] args) {
        int tamaño = 25000;
        
        DatosEstadisticos de = new DatosEstadisticos();
        int[] vec = GeneraCaso.generaVector(tamaño, false);
        Ordenar1Vector a = new Ordenar1Vector();
        a.ordena(vec, de);
        MediaDatosEstadisticos dem = new MediaDatosEstadisticos(de, tamaño);
        CompruebaCaso.compruebaVector(vec, vec.length);
        
        System.out.println(a.nombreMetodo());
        System.out.println("Vector de " + tamaño + " elementos  - " + de.dameTiempo() + " segundos en ordenar.");
        System.out.println("Movimientos = " + de.dameMovimientos());
        System.out.println("Media de movimientos = " + dem.dameMediaMovimientos());
        System.out.println("Comparaciones = " + de.dameComparaciones());
        System.out.println("Media de comparaciones = " + dem.dameMediaComparaciones());
        System.out.println("Tiempo = " + de.dameTiempo());
        System.out.println("Media de tiempo = " + dem.dameMediaTiempos());
        
        System.out.println("\n\n");
        
        de = new DatosEstadisticos();
        Ordenar2Vector b = new Ordenar2Vector();
        vec = GeneraCaso.generaVector(tamaño, false);
        b.ordena(vec, de);
        CompruebaCaso.compruebaVector(vec, vec.length);
        System.out.println("Vector de " + tamaño + " elementos  - " + de.dameTiempo() + " segundos en ordenar.");
        System.out.println("Movimientos = " + de.dameMovimientos());
        System.out.println("Media de movimientos = " + dem.dameMediaMovimientos());
        System.out.println("Comparaciones = " + de.dameComparaciones());
        System.out.println("Media de comparaciones = " + dem.dameMediaComparaciones());
        System.out.println("Tiempo = " + de.dameTiempo());
        System.out.println("Media de tiempo = " + dem.dameMediaTiempos());
    }
}
