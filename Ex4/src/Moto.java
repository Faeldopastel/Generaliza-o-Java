
public class Moto extends Veiculo {

    private int cilindradas;

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Cilindradas = [");
        builder.append(cilindradas);
        builder.append("]\n");
        builder.append(super.toString());


        return builder.toString();
    }

    
}
