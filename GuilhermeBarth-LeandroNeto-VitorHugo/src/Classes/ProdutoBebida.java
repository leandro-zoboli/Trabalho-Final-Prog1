package Classes;

import java.util.ArrayList;

public class ProdutoBebida extends Produto {

    private float Volume;
    private ArrayList<String> Embalagem = new ArrayList();

    public ProdutoBebida(String Nome, double ValorBase, float Volume, String Embalagem, long ID) {
        super(Nome, ValorBase, "Bebida", Embalagem, ID);
        this.Volume = Volume;
        this.Embalagem.add(Embalagem);
    }

    public ArrayList<String> getEmbalagem() {
        return Embalagem;
    }

    public void addEmbalagem(String Embalagem) {
        boolean existe = false;
        for (String e : this.Embalagem) {
            if (e.equals(Embalagem)) {
                existe = true;
            }
        }
        if (!existe) {
            this.Embalagem.add(Embalagem);
            super.adicionaTipo(Embalagem);
        }
    }
    
    public float getVolume() {
        return Volume;
    }

    public void setVolume(float Volume) {
        this.Volume = Volume;
    }

}
