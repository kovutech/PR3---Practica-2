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
        int ncomparaciones = 0;
        int nmovimientos = 0;

        for (int i = 0; i < n; i++) {                       ncomparaciones++;            
            menor = vec[0];
            pos = 0;
            for (int j = 1; j < n; j++) {                   ncomparaciones++;                
                if (menor > vec[j]) {                       ncomparaciones++;
                    menor = vec[j];
                    pos = j;
                }
            }
            vecs[i] = menor;                                nmovimientos++;            
            vec[pos] = Integer.MAX_VALUE;
        }

        //Copiamos el resultado del vector vecs en vec.
        for (int i = 0; i < n; i++) {                       ncomparaciones++;
            vec[i] = vecs[i];
        }
        //Tiempo calculado en segundos.
        de.estableceTiempo((System.currentTimeMillis() - tiempo) / 1000);
                
        System.out.println("Número de comparaciones realizadas: " + ncomparaciones);
        System.out.println("Número de movimientos realizados: " + nmovimientos);
    }
}
