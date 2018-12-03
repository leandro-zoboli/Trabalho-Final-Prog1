
package Classes;

public class ProdutoBebida extends Produto {

    private float Volume;
    private String Embalagem;

    public ProdutoBebida(String Nome, double ValorBase, float Volume, String Embalagem) {
        super(Nome, ValorBase);
        this.Volume = Volume;
        this.Embalagem = Embalagem;
    }
    
    public String getEmbalagem() {
        return Embalagem;
    }

    public void setEmbalagem(String Embalagem) {
        this.Embalagem = Embalagem;
    }
    private enum Embalagem {
        lata, garrafaDeVidro, garrafaPlastica, caixa, outros;
    }

    public float getVolume() {
        return Volume;
    }

    public void setVolume(float Volume) {
        this.Volume = Volume;
    }

}
