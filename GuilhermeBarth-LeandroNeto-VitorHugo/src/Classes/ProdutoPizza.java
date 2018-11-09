
package Classes;

import java.util.ArrayList;

public class ProdutoPizza extends Produto {

    private ArrayList<Igredientes> igredientes = new ArrayList<>();
    private float CustoTotal;
    private String Nome;

    private enum Tamanho {
        pequena, media, grande;
    }

    public ArrayList<Igredientes> getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(ArrayList<Igredientes> igredientes) {
        this.igredientes = igredientes;
    }

    public float getCustoTotal() {
        return CustoTotal;
    }

    public void setCustoTotal(float CustoTotal) {
        this.CustoTotal = CustoTotal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

}
