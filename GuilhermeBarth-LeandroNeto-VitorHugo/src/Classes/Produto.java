package Classes;

import java.util.ArrayList;

public class Produto {

    private String Nome;
    private double ValorBase;
    private int Quantidade;
    public ArrayList<ProdutoBebida> listaDeBebidas = new ArrayList();
    
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

}
