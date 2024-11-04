public class PessoaJuridica extends Pessoa{

    private  String CNPJ;
    private String tipo_empresa;

    public void setTipo_empresa(String tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }public String getTipo_empresa() {
        return tipo_empresa;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("CNPJ = ");
        builder.append(CNPJ);
        builder.append("tipo de empresa = ");
        builder.append(tipo_empresa);
        builder.append(super.toString());

        return builder.toString();
    
    }
}
