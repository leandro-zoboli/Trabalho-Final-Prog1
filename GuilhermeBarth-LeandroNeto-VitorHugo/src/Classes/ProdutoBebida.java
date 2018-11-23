
package Classes;

public class ProdutoBebida extends Produto {

    private float Volume;
    private String Embalagem;
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
