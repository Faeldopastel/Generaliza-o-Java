public class Cd  extends Midia{
    

    private int faixas;
    private String artista;
    private String album;

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Qtd faixas = [");
        builder.append(faixas);
        builder.append("]");
        builder.append("Artista = [");
        builder.append(artista);
        builder.append("]");
        builder.append("Album = [");
        builder.append(album);
        builder.append("]");
        builder.append(super.toString());

        return builder.toString();
    }

    
}
