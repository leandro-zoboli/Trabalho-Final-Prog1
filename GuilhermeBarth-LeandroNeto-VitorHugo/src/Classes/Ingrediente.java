package Classes;

public class Ingrediente {

    private String Nome;
    private double ValorUnitario;
    private double Quantidade;
//;;yufytf
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getCustoUnitario() {
        return ValorUnitario;
    }

    public void setCustoUnitario(double CustoUnitario) {
        this.ValorUnitario = CustoUnitario;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double Quantidade) {
        this.Quantidade = Quantidade;
    }

    public double GetCustoItem() {
        try {
            double retorno = 0;
            retorno = this.ValorUnitario * this.Quantidade;
            return retorno;
        } catch(Exception e){
            throw new IllegalArgumentException("Ocorreu um erro ao calcular o custo do item. Erro: " + e.getMessage());
        }
    }
    
    public String[] RetornaModeloTabela(){
        String[] retorno = new String[4];
        retorno[0] = this.getNome();
        retorno[1] = this.getQuantidade() + " kg";
        retorno[2] = "R$ " + this.getCustoUnitario();
        retorno[3] = "R$ " + this.GetCustoItem();
        return retorno;
    }
}
