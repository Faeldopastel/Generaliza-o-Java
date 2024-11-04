public class AnimalMain {

    public static void main(String[] args) {
        
        Cao cao = new Cao();
        Gato gato = new Gato();
        Lagarto lagarto = new Lagarto();
        Tartaruga tartaruga = new Tartaruga();


        cao.setAlimentacao("Carnívoro");
        cao.setDiafragma(true);
        cao.setGrupo("Placentário");
        cao.setOlhos(true);
        cao.setRaca("Pincher");
        
        gato.setAlimentacao("Carnívoro");
        gato.setDiafragma(true);
        gato.setGrupo("Placentário");
        gato.setOlhos(true);
        gato.setCor("Laranha");

        lagarto.setAlimentacao("Herbívoro");
        lagarto.setOvos(1);
        lagarto.setSolta_rabo(true);
        lagarto.setClassificacao("Squamata");
        lagarto.setOlhos(true);

        tartaruga.setAlimentacao("Herbívoro");
        tartaruga.setOvos(20);
        tartaruga.setCome_canudo(true);
        tartaruga.setClassificacao("Testudines");
        tartaruga.setOlhos(true);

        System.out.println(cao);
        System.out.println(gato);
        System.out.println(lagarto);
        System.out.println(tartaruga);

        
    }
    
}
