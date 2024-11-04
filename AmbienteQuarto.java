public class AmbienteQuarto extends Ambiente{

    private int capacidade;

    public void setCapacidade(int capacidade) {
        if(capacidade > 0){
            this.capacidade = capacidade;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Capacidade =");
        builder.append(capacidade);
        builder.append(super.toString());

        return builder.toString();

    }
    
}
