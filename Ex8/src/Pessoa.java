public class Pessoa {

    private String nome;
    private int codigo;
    private String endereco;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Nome = [");
        builder.append(nome);
        builder.append("]\n");
        builder.append("codigo = [");
        builder.append(codigo);
        builder.append("]\n");
        builder.append("endereço = [");
        builder.append(endereco);
        builder.append("]\n");


        return builder.toString();
    }
    
}
