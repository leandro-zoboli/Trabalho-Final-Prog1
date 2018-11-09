
package Classes;

public class ProdutoBebida extends Produto {

    private String Nome;
    private float Volume;

    private enum Embalagem {
        lata, garrafaDeVidro, garrafaPlastica, caixa, outros;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getVolume() {
        return Volume;
    }

    public void setVolume(float Volume) {
        this.Volume = Volume;
    }

}
