public class PessoaMain {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Rafael");
        p.setEndereço("Bom sucesso");

        System.out.println(p);

        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Rafael");
        pf.setEndereço("Bom sucesso");
        pf.setCpf("000.000.000-00");
        pf.setEstado_civil("Solteiro");
        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica();

        pj.setNome("Rafael");
        pj.setEndereço("Bom sucesso");
        pj.setCNPJ("000.000.000/0001-98");
        pj.setTipo_empresa("MEI");
        System.out.println(pj);

        
    }
    
}
