public class ContaEspecial extends Conta {

    private int diasSemJuros;
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Dias sem juros = [");
        builder.append(diasSemJuros);
        builder.append("]\n");
        builder.append("Limite = [");
        builder.append(limite);
        builder.append("]\n");

        builder.append(super.toString());


        return builder.toString();
    }
    
}
