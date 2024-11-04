public class ContaMain {

    public static void main(String[] args) {

        ContaEspecial conta_esp = new ContaEspecial();
        ContaSimples conta_Sim = new ContaSimples();


        conta_Sim.setSaldo(1500);
        conta_Sim.setAgencia(0001);
        conta_Sim.setBanco("NuBank");
        conta_Sim.setNumeroConta(10028);
        conta_Sim.setSaldoPoupanca(1500);

        System.out.println(conta_Sim.saque(200));
        System.out.println(conta_Sim.deposito(100));
        System.out.println(conta_Sim.depositoPoupanca(10));
        System.out.println(conta_Sim.saquePoupanca(100));

        System.out.println();



        conta_esp.setSaldo(1500);
        conta_esp.setAgencia(108);
        conta_esp.setBanco("Sicoob");
        conta_esp.setNumeroConta(1057);
        conta_esp.setDiasSemJuros(10);
        conta_esp.setLimite(1800);
        

        System.out.println(conta_esp.saque(1000));
        System.out.println(conta_esp.deposito(10000));

        System.out.println(conta_esp);
        
    }
    
}
