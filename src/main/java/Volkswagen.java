public class Volkswagen extends Montadora {

    public Volkswagen(float custoBaseDeProducao) {
        super(custoBaseDeProducao);
    }

    public float calcularCustoProducao() {
        return this.custoBaseDeProcucao * (1 + this.categoriaVeiculo.TaxaCategoriaVeiculo());
    }
}
