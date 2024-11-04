public class PessoaFisica extends Pessoa {

    private String cpf;
    private String estado_civil;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getEstado_civil() {
        return estado_civil;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("CPF {Nome}");
        builder.append(cpf);
        builder.append("Estado  ");
        builder.append(estado_civil);
        builder.append(super.toString());

        return builder.toString();

    }


    
}
