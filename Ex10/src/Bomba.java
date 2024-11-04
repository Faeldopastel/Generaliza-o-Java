public class Bomba {

    private double TotalLitros;
    private float valorLitro;

    public void setTotalLitros(double totalLitros) {
        TotalLitros = totalLitros;
    }

    public double getTotalLitros() {
        return TotalLitros;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public float getValorLitro() {
        return valorLitro;
    }


    public boolean AbastecerPorLitro(int litros){
        if(litros < 0){
            
            return false;
        } else{
            setTotalLitros( getTotalLitros() - litros);
            return true;
        }
    }

    public boolean AbastecerPorValor(double valor){
        if(valor < 0){
            return false;
        } else{
            valor /= getValorLitro();
            setTotalLitros(getTotalLitros() - valor);
            return true;
        }
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Total litro = [");
        builder.append(TotalLitros);
        builder.append("]\n");

        return builder.toString();
    }

}
