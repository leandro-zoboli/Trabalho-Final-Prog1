
package Classes;
import Classes.ProdutoBebida;
import Classes.ProdutoPizza;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido {
    public ArrayList<ProdutoBebida> Bebidas = new ArrayList();
    public ArrayList<ProdutoPizza> Pizzas = new ArrayList<>();
    private Cliente cliente;
    private double ValorTotal;
    private long PedidoID;
    
    public Pedido(Cliente cliente, double ValorTotal){
        this.cliente = cliente;
        this.ValorTotal = ValorTotal;
    }
    
    public Pedido(){
        
    }

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

    public double getValorTotal() {
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
    
    public double GetValorTotalPedido(){
        double retorno = 0.0;
        
        for(ProdutoBebida bebida : Bebidas){
            retorno += bebida.GetValorVenda();
        }
        
        for(ProdutoPizza pizza : Pizzas){
            retorno += pizza.GetValorVenda();
        }
        return retorno;
    }
}
