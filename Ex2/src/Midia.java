public class Midia extends Item{

    private String gravadora;
    private float duracao;

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getGravadora() {
        return gravadora;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Gravadora = [");
        builder.append(gravadora);
        builder.append("]");
        builder.append("duraçao = [");
        builder.append(duracao);
        builder.append("]");
        builder.append(super.toString());

        return builder.toString();
    }
    
}
