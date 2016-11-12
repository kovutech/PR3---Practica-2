package practica2;

public class Ordenar2Vector implements OrdenarVector {

    public String nombreMetodo() {
        return "Selección lineal";
    }

    public void ordena(int[] vec, DatosEstadisticos de) {
        double tiempo = System.currentTimeMillis();
        int n = vec.length;
        int[] vecaux = new int[n];
        int p1, l1, p2, l2, pla;
        int mll = 1;
        
        int ncomparaciones = 0;
        int nmovimientos = 0;
        
        while (mll < n) {                                   ncomparaciones++;

            p1 = 1;
            l1 = p1 + mll;
            p2 = l1;
            l2 = p2 + mll;
            pla = 1;
            while (pla <= n) {                              ncomparaciones++;
                
                if (l1 > n) {                               ncomparaciones++;
                    l1 = n + 1;
                }
                if (l2 > n) {                               ncomparaciones++;
                    l2 = n + 1;
                }

                while ((p1 < l1) && (p2 < l2)) {            ncomparaciones+=2;
                    if (vec[p1 - 1] < vec[p2 - 1]) {        ncomparaciones++;
                        vecaux[pla] = vec[p1 - 1];          nmovimientos++;
                        p1 = p1 + 1;
                    } else {
                        vecaux[pla - 1] = vec[p2 - 1];      nmovimientos++;
                        p2 = p2 + 1;
                    }
                    pla = pla + 1;
                }
                while (p1 < l1) {                           ncomparaciones++;
                    vecaux[pla - 1] = vec[p1 - 1];          nmovimientos++;
                    p1 = p1 + 1;
                    pla = pla + 1;
                }
                while (p2 < l2) {                           ncomparaciones++;
                    vecaux[pla - 1] = vec[p2 - 1];          nmovimientos++;
                    p2 = p2 + 1;
                    pla = pla + 1;
                }
                p1 = p2;
                l1 = p2 + mll;
                p2 = l1;
                l2 = p2 + mll;
            }
            mll = 2 * mll;

            for (int i = 0; i < n; i++) {                   ncomparaciones++;
                vec[i] = vecaux[i];
            }
        }
        de.estableceTiempo((System.currentTimeMillis() - tiempo) / 1000);
        
        System.out.println("Número de comparaciones realizadas: " + ncomparaciones);
        System.out.println("Número de movimientos realizados: " + nmovimientos);
    }
}
