
package Classes;

public class Produto {

    private String Nome;
    private float CustoBase;
    private int Quantidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getCustoUnitario() {
        return CustoBase;
    }

    public void setCustoUnitario(float CustoUnitario) {
        this.CustoBase = CustoUnitario;
    }

    public float getCustoBase() {
        return CustoBase;
    }

    public void setCustoBase(float CustoBase) {
        this.CustoBase = CustoBase;
    }

}
