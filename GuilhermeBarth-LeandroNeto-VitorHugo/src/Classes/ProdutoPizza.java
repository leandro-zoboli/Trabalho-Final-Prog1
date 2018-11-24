package Classes;

import java.util.ArrayList;

public class ProdutoPizza extends Produto {

    private ArrayList<Ingrediente> igredientes = new ArrayList<>();

    private enum Tamanho {
        pequena, media, grande;
    }

    public ArrayList<Ingrediente> getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(ArrayList<Ingrediente> igredientes) {
        this.igredientes = igredientes;
    }

    public double getValorTotal() {
        try {
            float retorno = 0;
            for (Ingrediente i : igredientes) {
                retorno += i.GetCustoItem();
            }
            return retorno;
        } catch (Exception e) {
            throw new IllegalArgumentException("Ocorreu um erro ao calcular o valor total da pizza " + this.getNome() + ". Erro: " + e.getMessage());
        }
    }
}
