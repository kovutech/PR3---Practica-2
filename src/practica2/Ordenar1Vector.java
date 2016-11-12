package practica2;

public class Ordenar1Vector implements OrdenarVector {

    public String nombreMetodo() {
        return "Selección lineal";
    }

    public void ordena(int[] vec, DatosEstadisticos de) {
        double tiempo = System.currentTimeMillis();
        int n = vec.length;
        int[] vecs = new int[n];
        int menor;
        int pos;
        for (int i = 0; i < n; i++) {
            menor = vec[0];
            pos = 0;
            for (int j = 1; j < n; j++) {
                de.añadeComparacion();
                if (menor > vec[j]) {
                    menor = vec[j];
                    pos = j;
                }
            }
            vecs[i] = menor;
            de.añadeMovimientos();
            vec[pos] = Integer.MAX_VALUE;
        }
        //Copiamos el resultado del vector vecs en vec.
        for (int i = 0; i < n; i++) {
            vec[i] = vecs[i];
            de.añadeMovimientos(); //En duda
        }
        //Tiempo calculado en segundos.
        de.estableceTiempo((System.currentTimeMillis() - tiempo) / 1000);
    }
}
