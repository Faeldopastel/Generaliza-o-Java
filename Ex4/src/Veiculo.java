public class Veiculo {

    private boolean motor;

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tem motor? = [");
        builder.append(motor);
        builder.append("]\n");


        return builder.toString();
    }


}