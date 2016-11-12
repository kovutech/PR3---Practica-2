package practica2;

public class MediaDatosEstadisticos {

    DatosEstadisticos datosMedia;
    int tamaño;

    public MediaDatosEstadisticos(DatosEstadisticos datos_media, int tamaño) {
        this.datosMedia = datos_media;
        this.tamaño = tamaño;
    }

    public void anadeDatosEstadisticos(DatosEstadisticos d) {
        tamaño++;
        d.estableceTiempo(datosMedia.dameTiempo() + d.dameTiempo());
        d.estableceComparaciones(datosMedia.dameComparaciones() + d.dameComparaciones());
        d.estableceMovimientos(datosMedia.dameMovimientos() + d.dameMovimientos());
    }

    public double dameMediaTiempos() {
        return datosMedia.dameTiempo() / tamaño;
    }

    public double dameMediaComparaciones() {
        return (double)datosMedia.dameComparaciones() / (double)tamaño;
    }

    public double dameMediaMovimientos() {
        return (double)datosMedia.dameMovimientos() / (double)tamaño;
    }
}
