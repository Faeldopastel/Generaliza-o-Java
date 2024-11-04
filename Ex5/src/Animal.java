public class Animal{

    private boolean olhos;
    private String alimentacao;
    

    public void setOlhos(boolean olhos) {
        this.olhos = olhos;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tem olhos = [");
        builder.append(olhos);
        builder.append("]");
        builder.append("Alimentação = [");
        builder.append(alimentacao);
        builder.append("]");
        

        return builder.toString();
    }
}