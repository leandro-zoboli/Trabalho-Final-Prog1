package Classes;

import java.util.ArrayList;

public class ProdutoPizza extends Produto {
    public ArrayList<Ingrediente> ingredientes = new ArrayList();
    ArrayList <String> Tamanho = new ArrayList();

    public ProdutoPizza(String Nome, double ValorBase, String Tamanho, ArrayList<Ingrediente> ingredientes, long ID){
        super(Nome, ValorBase, "Pizza", Tamanho, ID);
        this.Tamanho.add(Tamanho);
        this.ingredientes = ingredientes;
    }
    
    public ProdutoPizza(){
        
    }
    
    private enum Tamanho {
        pequena, media, grande;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> igredientes) {
        this.ingredientes = igredientes;
    }

    public ArrayList<String> getTamanho() {
        return Tamanho;
    }
    
    
    
    public double getValorTotal() {
        try {
            float retorno = 0;
            for (Ingrediente i : ingredientes) {
                retorno += i.GetCustoItem();
            }
            return retorno;
        } catch (Exception e) {
            throw new IllegalArgumentException("Ocorreu um erro ao calcular o valor total da pizza " + this.getNome() + ". Erro: " + e.getMessage());
        }
    }
    
    public void addTamanho(String tamanho){
        boolean existe = false;
        for (String e : this.Tamanho) {
            if (e.equals(tamanho)) {
                existe = true;
            }
        }
        if (!existe) {
            this.Tamanho.add(tamanho);
            super.adicionaTipo(tamanho);
        }
    }
    
}
