
package Classes;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<ProdutoBebida> Bebidas = new ArrayList();
    private ArrayList<ProdutoPizza> Pizzas = new ArrayList<>();
    private Cliente cliente = new Cliente();
    private float ValorTotal;
    private long PedidoID;

    public ArrayList<ProdutoBebida> getBebidas() {
        return Bebidas;
    }

    public void setBebidas(ArrayList<ProdutoBebida> Bebidas) {
        this.Bebidas = Bebidas;
    }

    public ArrayList<ProdutoPizza> getPizzas() {
        return Pizzas;
    }

    public void setPizzas(ArrayList<ProdutoPizza> Pizzas) {
        this.Pizzas = Pizzas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public long getPedidoID() {
        return PedidoID;
    }

    public void setPedidoID(long PedidoID) {
        this.PedidoID = PedidoID;
    }
    
    
}
