public abstract class Concessionaria {

    protected CategoriaVeiculo categoriaVeiculo;
    protected String porteConcessionaria;

    public Concessionaria(String porteConcessionaria) {
        this.porteConcessionaria = porteConcessionaria;
    }

    public void setCategoriaVeiculo(CategoriaVeiculo categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public void setPorteConcessionaria(String porteConcessionaria) {
        this.porteConcessionaria = porteConcessionaria;
    }

    public abstract float calcular();
}
