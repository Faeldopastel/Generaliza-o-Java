public class NaveEspacial{

    private double vel_max;

    public void setVel_max(double vel_max) {
        this.vel_max = vel_max;
    }

    public double getVel_max() {
        return vel_max;
    }

    @Override

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Velocidade Máxima = [");
        builder.append(vel_max);
        builder.append("]");



        return builder.toString();

    }
}