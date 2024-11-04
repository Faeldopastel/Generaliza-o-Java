
public class Conta {

    private String banco;
    private int agencia;
    private  int numeroConta;
    private double saldo;

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    public boolean deposito(double valor){

        if(valor < 0){
            System.out.println("Não é possível adicionar valores negativos\n");
            return(false);
        } else{
            System.out.println("Deposito feito");
            setSaldo(getSaldo() + valor);
            return true;
        }

    }

    public boolean saque(double valor){
        if(valor > this.saldo || valor < 0){
            System.out.print("Valor insufiente para saque\n");
            return false;
        } else{
            System.out.println("Saque feito");
            setSaldo(getSaldo() - valor);
            return true;
        }
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Banco = [");
        builder.append(banco);
        builder.append("]\n");
        builder.append("agência = [");
        builder.append(agencia);
        builder.append("]\n");
        builder.append("Número da conta = [");
        builder.append(numeroConta);
        builder.append("]\n");
        builder.append("Saldo = [");
        builder.append(saldo);
        builder.append("]\n");

        return builder.toString();
    }
}
