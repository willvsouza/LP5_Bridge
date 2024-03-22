public class Toyota extends Montadora {

    public Toyota(float custoBaseDeProducao) {
        super(custoBaseDeProducao);
    }

    public float calcularCustoProducao() {
        return this.custoBaseDeProcucao * (1 + this.categoriaVeiculo.TaxaCategoriaVeiculo());
    }
}
