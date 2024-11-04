public class Caminhao extends Veiculo{

    private int eixos;

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Eixos = [");
        builder.append(eixos);
        builder.append("]\n");
        builder.append(super.toString());


        return builder.toString();
    }

    
}
