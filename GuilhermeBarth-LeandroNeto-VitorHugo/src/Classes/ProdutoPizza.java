package Classes;

import java.util.ArrayList;

public class ProdutoPizza extends Produto {

    private ArrayList<Igrediente> igredientes = new ArrayList<>();
    private String Nome;

    private enum Tamanho {
        pequena, media, grande;
    }

    public ArrayList<Igrediente> getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(ArrayList<Igrediente> igredientes) {
        this.igredientes = igredientes;
    }

    public double getValorTotal() {
        try {
            float retorno = 0;
            for (Igrediente i : igredientes) {
                retorno += i.GetCustoItem();
            }
            return retorno;
        }catch (Exception e){
            throw new IllegalArgumentException("Ocorreu um erro ao calcular o valor total da pizza " + Nome + ". Erro: " + e.getMessage());
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

}
