package Classes;

import java.util.ArrayList;

public class Produto {

    private String Nome;
    private int Quantidade;
    private double ValorBase;
    
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

    
    public String[] RetornaFormatoTabela(){
        String[] retorno = new String[4];
        retorno[0] = this.getNome();
        retorno[1] = "" + this.GetValorVendaUnitario();
        retorno[2] = "" + this.getQuantidade();
        retorno[3] = "" + this.GetValorVenda();
        return retorno;
    }

}
