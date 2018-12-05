package Classes;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Produto {

    private String Nome;
    private int Quantidade;
    private double ValorBase;
    private String TipoProduto;
    private ArrayList<String> Tipos = new ArrayList();

    public Produto(String Nome, double ValorBase, String TipoProduto, String TamanhoOuEmbalagem){
        this.Nome = Nome;
        this.ValorBase = ValorBase;
        this.TipoProduto = TipoProduto;
        this.Tipos.add(TamanhoOuEmbalagem);
    }
    
    public Produto(){ }

    public ArrayList<String> getTipos() {
        return Tipos;
    }

    public void setTipos(ArrayList<String> Tipos) {
        this.Tipos = Tipos;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getValorBase() {
        return ValorBase;
    }

    public void setValorBase(double ValorBase) {
        this.ValorBase = ValorBase;
    }

    public double GetValorVendaUnitario() {
        double retorno = 0;
        retorno = (ValorBase * 1.90);
        return retorno;
    }

    public double GetValorVenda() {
        double retorno = 0;
        retorno = (ValorBase * 1.90) * this.getQuantidade();
        return retorno;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String[] RetornaFormatoTabela() {
        String[] retorno = new String[4];
        retorno[0] = this.getNome();
        retorno[1] = "" + this.GetValorVendaUnitario();
        retorno[2] = "" + this.getQuantidade();
        retorno[3] = "" + this.GetValorVenda();
        return retorno;
    }

}
