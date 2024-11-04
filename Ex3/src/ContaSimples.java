public class ContaSimples extends Conta{


    private  double saldoPoupanca;

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor){
        if(valor < 0){
            System.out.print("Não é possível depositar\n");
            return false;
        } else{
            System.out.println("Deposito feito");
            valor += getSaldoPoupanca();
            setSaldoPoupanca(valor);
            return true;
        }

    }


    public boolean saquePoupanca(double valor){
        if(valor < 0 || valor > this.saldoPoupanca){
            System.out.println("Não é possível sacar");
            return false;
        } else{
            System.out.println("Saque feito");
            setSaldoPoupanca(getSaldoPoupanca() - valor);
            return true;
        }
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Saldo da poupança = [");
        builder.append(saldoPoupanca);
        builder.append("]\n");

        builder.append(super.toString());


        return builder.toString();
    }
    
}
