package Classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Produto {

    private long ID;
    private String Nome;
    private int Quantidade;
    private double ValorBase;
    private String TipoProduto;
    private ArrayList<String> Tipos = new ArrayList();
    private HashMap<String, Double> PrecoTipos = new HashMap();

    public Produto(String Nome, double ValorBase, String TipoProduto, String TamanhoOuEmbalagem, long ID){
        this.Nome = Nome;
        this.ValorBase = ValorBase;
        this.TipoProduto = TipoProduto;
        this.Tipos.add(TamanhoOuEmbalagem);
        this.PrecoTipos.put(TamanhoOuEmbalagem, ValorBase);
        this.ID = ID;
    }
    
    public Produto(){ }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTipoProduto() {
        return TipoProduto;
    }

    public void setTipoProduto(String TipoProduto) {
        this.TipoProduto = TipoProduto;
    }
    
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

    public double GetValorVendaUnitario(String tipo) {
        double retorno = 0;
        retorno = (this.getPrecoTipos().get(tipo) * 1.90);
        return retorno;
    }

    public double GetValorVenda(String tipo) {
        double retorno = 0;
        retorno = (this.getPrecoTipos().get(tipo) * 1.90) * this.getQuantidade();
        return retorno;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public HashMap<String, Double> getPrecoTipos() {
        return PrecoTipos;
    }
    
    public String[] RetornaFormatoTabela(String tipo) {
        String[] retorno = new String[4];
        retorno[0] = this.getNome();
        retorno[1] = "" + this.getPrecoTipos().get(tipo);
        retorno[2] = "" + this.getQuantidade();
        retorno[3] = "" + this.GetValorVenda(tipo);
        return retorno;
    }
    
    public void adicionaTipo(String tipo){
        Tipos.add(tipo);
    }
    
    public void addPrecoTipo(String tipo, double preco) {
        PrecoTipos.put(tipo, preco);
    }
}
