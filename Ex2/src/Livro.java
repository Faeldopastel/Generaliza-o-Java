public class Livro extends Item{

    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Nome do autor =[");
        builder.append(autor);
        builder.append("]");
        builder.append(super.toString());

        return builder.toString();
    }

}