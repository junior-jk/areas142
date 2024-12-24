import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.AreaCalcular;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalcularTest {

    // Teste de unidade para calcular a área de um quadrado
    @Test
    public void testCalcularAreaQuadrado() {
        double resultado = AreaCalcular.calcularAreaQuadrado(4);
        assertEquals(16.0, resultado, 0.0001, "A área do quadrado deveria ser 16.0");
    }

    // Teste de unidade para calcular a área de um círculo
    @Test
    public void testCalcularAreaCirculo() {
        double resultado = AreaCalcular.calcularAreaCirculo(3);
        assertEquals(28.2743, resultado, 0.0001, "A área do círculo deveria ser aproximadamente 28.27");
    }

    // Teste de unidade para calcular a área de um triângulo
    @Test
    public void testCalcularAreaTriangulo() {
        double resultado = AreaCalcular.calcularAreaTriangulo(6, 4);
        assertEquals(12.0, resultado, 0.0001, "A área do triângulo deveria ser 12.0");
    }

    @Test
    public void testCalcularAreaRetangulo() {
        double resultado = AreaCalcular.calcularAreaRetangulo(6, 8);
        assertEquals(48.0, resultado, 0.0001, "A área do retangulo deve ser 48.0");
    }

    // Teste data-driven para o cálculo da área do retângulo
    @ParameterizedTest
    @CsvSource(value = {
            "5,3,15.0",
            "7,4,28.0",
            "6,6,36.0"
    }, delimiter = ',')
    public void testCalcularAreaRetanguloDataDriven(double largura, double altura, double areaEsperada) {
        double resultado = AreaCalcular.calcularAreaRetangulo(largura, altura);
        assertEquals(areaEsperada, resultado, "A área do retângulo deveria ser " + areaEsperada);
    }

    // Teste data-driven para o cálculo da área do triângulo a partir de um arquivo
    // CSV
    @ParameterizedTest
    @CsvFileSource(resources = "csv/triangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void testCalcularAreaTrianguloCsv(double base, double altura, double areaEsperada) {
        double resultado = AreaCalcular.calcularAreaTriangulo(base, altura);
        assertEquals(areaEsperada, resultado, "A área do triângulo deveria ser " + areaEsperada);
    }
}
