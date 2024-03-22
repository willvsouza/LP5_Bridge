public class Fiat extends Montadora {

    public Fiat(float custoBaseDeProcucao) {
        super(custoBaseDeProcucao);
    }

    public float calcularCustoProducao() {
        return this.custoBaseDeProcucao * (1 + this.categoriaVeiculo.TaxaCategoriaVeiculo());
    }
}
