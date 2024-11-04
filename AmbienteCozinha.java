public class AmbienteCozinha extends Ambiente{

    private boolean microondas;

    public void setMicroondas(boolean microondas) {
        this.microondas = microondas;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Microondas = ");
        builder.append(microondas);
        builder.append(super.toString());

        return builder.toString();

    }
    
}
