public class Aluno extends Pessoa{

    private int matricula;


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("Nome = [");
        builder.append(matricula);
        builder.append("]\n");

        builder.append(super.toString());


        return builder.toString();
    }


    
}
