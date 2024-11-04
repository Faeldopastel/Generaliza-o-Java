public class Pessoa{

    private String nome;
    private String endereço;

    public void setEndereço(String endereço) {

        if(endereço.isEmpty()){
            getEndereço();
        }else{
            this.endereço = endereço;

        }
    }public String getEndereço() {
        return endereço;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Pessoa {Nome}");
        builder.append(nome);
        builder.append("Endereço ");
        builder.append(endereço);

        return builder.toString();

    }


}
