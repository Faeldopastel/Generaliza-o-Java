public class Apolo11 extends NaveEspacial{

    private String tipoComb;

    public void setTipoComb(String tipoComb) {
        this.tipoComb = tipoComb;
    }

    public String getTipoComb() {
        return tipoComb;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Velocidade Máxima = [");
        builder.append(tipoComb);
        builder.append("]");
        builder.append(super.toString());
        

        return builder.toString();

    }
    
}
