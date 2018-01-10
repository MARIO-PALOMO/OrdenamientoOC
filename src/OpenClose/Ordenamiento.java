package OpenClose;

import Modelo.Figura;
import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {

    public static void main(String[] args) {

        List<Figura> lstFigura = new ArrayList<>();
        lstFigura.add(new Figura("HEXAGONO", 6));
        lstFigura.add(new Figura("HEPTAGONO", 7));
        lstFigura.add(new Figura("PENTAGONO", 5));
        lstFigura.add(new Figura("OCTAGONO", 8));
        lstFigura.add(new Figura("TRIANGULO", 3));
        lstFigura.add(new Figura("CUADRADO", 4));

        int[] elementos = new int[lstFigura.size()];
        for (int i = 0; i < lstFigura.size(); i++) {
            elementos[i] = lstFigura.get(i).getLadosFigura();
        }

        visualizarResultado(ordenamientoBurbuja(elementos));
    }

    public static int[] ordenamientoBurbuja(int listaItems[]) {
        final int longitudVector = listaItems.length;
        for (int i = longitudVector - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (listaItems[j] > listaItems[j + 1]) {
                    int temp = listaItems[j];
                    listaItems[j] = listaItems[j + 1];
                    listaItems[j + 1] = temp;
                }
            }
        }
        return listaItems;
    }

    public static void visualizarResultado(int vectorOrdenado[]) {
        for (int i = 0; i < vectorOrdenado.length; i++) {
            System.out.print(vectorOrdenado[i] + " ");
        }
    }
}
