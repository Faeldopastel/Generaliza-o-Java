public class Professor extends Pessoa{

    private String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("disciplina = [");
        builder.append(disciplina);
        builder.append("]\n");
        builder.append(super.toString());



        return builder.toString();
    }
    
}
