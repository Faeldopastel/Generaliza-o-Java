public  class PessoaMain{

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setCodigo(1002);
        aluno.setEndereco("Rua Bernado, Bairro: Jornais");
        aluno.setMatricula(302);
        aluno.setNome("Armando");

        professor.setDisciplina("Filosfia");
        professor.setEndereco("Rua Moisés, Bairro: Mar aberto");
        professor.setCodigo(301);
        professor.setNome("Belford Roxo");

        System.out.println(professor);
        System.out.println(aluno);
        

    }
}