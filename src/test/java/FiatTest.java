import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FiatTest {

    @Test
    void deveRetornarCustoDeProducaoMontadoraFiatParaVeiculoCategoriaHatch() {
        CategoriaVeiculo categoriaVeiculo = new Hatch();
        Montadora fiat = new Fiat(70000.0f);
        fiat.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(70000.0f, fiat.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraFiatParaVeiculoCategoriaSedan() {
        CategoriaVeiculo categoriaVeiculo = new Sedan();
        Montadora fiat = new Fiat(90000.0f);
        fiat.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(94500.0f, fiat.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraFiatParaVeiculoCategoriaSUV() {
        CategoriaVeiculo categoriaVeiculo = new SUV();
        Montadora fiat = new Fiat(160000.0f);
        fiat.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(176000.0f, fiat.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraFiatParaVeiculoCategoriaPicape() {
        CategoriaVeiculo categoriaVeiculo = new Picape();
        Montadora fiat = new Fiat(200000.0f);
        fiat.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(240000.0f, fiat.calcularCustoProducao(), 0.02f);
    }
}
