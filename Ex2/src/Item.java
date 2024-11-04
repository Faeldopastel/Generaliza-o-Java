public class Item {

    private int codigo;
    private String descricao;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Código = [");
        builder.append(codigo);
        builder.append("]");
        builder.append("Descrição = [");
        builder.append(descricao);
        builder.append("]");

        return builder.toString();
    }
    
}
