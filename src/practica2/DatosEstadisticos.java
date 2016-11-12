package practica2;

public class DatosEstadisticos {

    private double tiempo;
    private long comparaciones;
    private long movimientos;

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

    public void estableceComparaciones(long n) {
        comparaciones = n;
    }

    public void estableceMovimientos(long n) {
        movimientos = n;
    }

    public long dameComparaciones() {
        return comparaciones;
    }

    public long dameMovimientos() {
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
