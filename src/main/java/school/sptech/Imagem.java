package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas() {
        Double todasAreas = 0.0;
        for (Figura figura : figuras) {
            todasAreas += figura.calcularArea();
        }
        return todasAreas;
    }
    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasComAreaAcimaDe20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20.0) {
                figurasComAreaAcimaDe20.add(figura);
            }
        }
            return figurasComAreaAcimaDe20;

    }
    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }

        }
        return quadrados;
    }

}
