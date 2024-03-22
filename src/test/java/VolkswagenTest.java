import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolkswagenTest {

    @Test
    void deveRetornarCustoDeProducaoMontadoraVolkswagenParaVeiculoCategoriaHatch() {
        CategoriaVeiculo categoriaVeiculo = new Hatch();
        Montadora volkswagen = new Volkswagen(78000.0f);
        volkswagen.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(78000.0f, volkswagen.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraVolkswagenParaVeiculoCategoriaSedan() {
        CategoriaVeiculo categoriaVeiculo = new Sedan();
        Montadora volkswagen = new Volkswagen(98000.0f);
        volkswagen.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(102900.0f, volkswagen.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraVolkswagenParaVeiculoCategoriaSUV() {
        CategoriaVeiculo categoriaVeiculo = new SUV();
        Montadora volkswagen = new Volkswagen(185000.0f);
        volkswagen.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(203500.0f, volkswagen.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraVolkswagenParaVeiculoCategoriaPicape() {
        CategoriaVeiculo categoriaVeiculo = new Picape();
        Montadora volkswagen = new Volkswagen(230000.0f);
        volkswagen.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(276000.0f, volkswagen.calcularCustoProducao(), 0.02f);
    }
}
