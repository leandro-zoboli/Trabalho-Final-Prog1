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

    public Pedido(Cliente cliente, double ValorTotal) {
        this.cliente = cliente;
        this.ValorTotal = ValorTotal;
    }

    public Pedido(long PedidoID) {
        this.PedidoID = PedidoID;
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

    public double GetValorTotalPedido(Produto p, String embalagemOuTamanho) {
        ValorTotal += p.getPrecoTipos().get(embalagemOuTamanho) * 1.9;
        return getValorTotal();
    }

    public String[] RetornaFormatoTabela(Produto p, String embalagemOuTamanho) {
        String[] retorno = new String[4];
        retorno[0] = this.getPedidoID() + "";
        retorno[1] = this.cliente.getNome();
        retorno[2] = this.cliente.getTelefone();
        retorno[3] = this.GetValorTotalPedido(p, embalagemOuTamanho) + "";
        return retorno;
    }
}
