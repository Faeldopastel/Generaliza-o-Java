public class Reptil extends Animal{

    private int ovos;
    private String classificacao;

    public void setOvos(int ovos) {
        this.ovos = ovos;
    }

    public int getOvos() {
        return ovos;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Quantidade de Ovos = [");
        builder.append(ovos);
        builder.append("]");
        builder.append("Classificação = [");
        builder.append(classificacao);
        builder.append("]");
        builder.append(super.toString());
        

        return builder.toString();
    }
    
}
