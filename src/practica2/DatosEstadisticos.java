package practica2;

public class DatosEstadisticos {

    private double tiempo;
    private int comparaciones;
    private int movimientos;

    public DatosEstadisticos() {
        tiempo = 0.0;
        comparaciones = 0;
        movimientos = 0;
    }

    public void añadeComparacion() {
        comparaciones += 1;
    }

    public void añadeMovimientos() {
        movimientos += 1;
    }

    public void estableceComparaciones(int n) {
        comparaciones = n;
    }

    public void estableceMovimientos(int n) {
        movimientos = n;
    }

    public int dameComparaciones() {
        return comparaciones;
    }

    public int dameMovimientos() {
        return movimientos;
    }

    public void añadeTiempo(double time) {
        tiempo += time;
    }

    public void estableceTiempo(double time) {
        tiempo = time;
    }

    public double dameTiempo() {
        return tiempo;
    }
}
