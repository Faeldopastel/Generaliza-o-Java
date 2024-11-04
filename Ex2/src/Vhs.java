public class Vhs extends Midia {

    private String titulo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Titulo = [");
        builder.append(titulo);
        builder.append("]");
        builder.append(super.toString());

        return builder.toString();
    }
    
}
