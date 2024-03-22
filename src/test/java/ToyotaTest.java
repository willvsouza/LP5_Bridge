import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToyotaTest {

    @Test
    void deveRetornarCustoDeProducaoMontadoraToyotaParaVeiculoCategoriaHatch() {
        CategoriaVeiculo categoriaVeiculo = new Hatch();
        Montadora toyota = new Toyota(100000.0f);
        toyota.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(100000.0f, toyota.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraToyotaParaVeiculoCategoriaSedan() {
        CategoriaVeiculo categoriaVeiculo = new Sedan();
        Montadora toyota = new Toyota(110000.0f);
        toyota.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(115500.0f, toyota.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraToyotaParaVeiculoCategoriaSUV() {
        CategoriaVeiculo categoriaVeiculo = new SUV();
        Montadora toyota = new Toyota(200000.0f);
        toyota.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(220000.0f, toyota.calcularCustoProducao(), 0.02f);
    }

    @Test
    void deveRetornarCustoDeProducaoMontadoraToyotaParaVeiculoCategoriaPicape() {
        CategoriaVeiculo categoriaVeiculo = new Picape();
        Montadora toyota = new Toyota(260000.0f);
        toyota.setCategoriaVeiculo(categoriaVeiculo);
        assertEquals(312000.0f, toyota.calcularCustoProducao(), 0.02f);
    }
}
