public class AmbienteMain {

    public static void main(String[] args) {
        
        AmbienteBanheiro banheiro = new AmbienteBanheiro();

        banheiro.setArea(10);
        banheiro.setBanheira(true);
        System.out.println(banheiro);

        AmbienteCozinha cozinha = new AmbienteCozinha();

        cozinha.setArea(35);
        cozinha.setMicroondas(false);
        System.out.println(cozinha);

        AmbienteQuarto quarto = new AmbienteQuarto();

        quarto.setArea(87);
        quarto.setCapacidade(5);
        System.out.println(quarto);

        AmbienteSala sala = new AmbienteSala();

        sala.setArea(55);
        sala.setTv(true);

        System.out.println(sala);

    }
    
}
