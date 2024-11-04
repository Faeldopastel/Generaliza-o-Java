public class Carro extends Veiculo{

    private int portas;

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Portas = [");
        builder.append(portas);
        builder.append("]\n");
        builder.append(super.toString());


        return builder.toString();
    }

    
}
