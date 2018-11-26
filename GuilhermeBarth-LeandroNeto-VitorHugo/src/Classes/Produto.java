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

    public double GetValorVenda() {
        double retorno = 0;
        retorno = ValorBase * 0.90;
        return retorno;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

}
