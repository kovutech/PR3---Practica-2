package practica2;

public class DatosEstadisticos {

    private double tiempo;

    public DatosEstadisticos() {
        tiempo = 0.0;
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
