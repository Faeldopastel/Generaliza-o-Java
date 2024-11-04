public class Tartaruga extends Reptil {

    private boolean come_canudo;

    public void setCome_canudo(boolean come_canudo) {
        this.come_canudo = come_canudo;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Grupo = [");
        builder.append(come_canudo);
        builder.append("]");
        builder.append(super.toString());
        

        return builder.toString();
    }
    
}
