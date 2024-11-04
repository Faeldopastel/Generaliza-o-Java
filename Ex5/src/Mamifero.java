public class Mamifero extends Animal{

    private String grupo;
    private boolean diafragma;


    public void setDiafragma(boolean diafragma) {
        this.diafragma = diafragma;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Grupo = [");
        builder.append(grupo);
        builder.append("]");
        builder.append("Tem diafragma? = [");
        builder.append(diafragma);
        builder.append("]");
        builder.append(super.toString());
        

        return builder.toString();
    }
    
}
