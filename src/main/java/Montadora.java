public abstract class Montadora {

    protected CategoriaVeiculo categoriaVeiculo;
    protected float custoBaseDeProcucao;

    public Montadora(float custoBaseDeProcucao) {
        this.custoBaseDeProcucao = custoBaseDeProcucao;
    }

    public void setCategoriaVeiculo(CategoriaVeiculo categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public void setCustoBaseDeProcucao(float custoBaseDeProcucao) {
        this.custoBaseDeProcucao = custoBaseDeProcucao;
    }

    public abstract float calcularCustoProducao();
}
