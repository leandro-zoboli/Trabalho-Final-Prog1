
package Classes;
import java.util.ArrayList;

public class Cliente {
    private String Nome;
    private String Telefone;
    private String Endereco;
    public ArrayList<Pedido> Pedidos = new ArrayList<>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public ArrayList<Pedido> getPedidos() {
        return Pedidos;
    }

    public void setPedidos(ArrayList<Pedido> Pedidos) {
        this.Pedidos = Pedidos;
    }
    
    
}
