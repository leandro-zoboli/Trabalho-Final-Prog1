package Classes;

import java.util.ArrayList;

public class ProdutoPizza extends Produto {
    public ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    String Tamanho = "";

    public ProdutoPizza(String Nome, double ValorBase, String Tamanho){
        super(Nome, ValorBase);
        this.Tamanho = Tamanho;
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
}
