public class PecaMain {

    public static void main(String[] args) {
        
        Bispo bispo = new Bispo();
        Peao peao = new Peao();
        Torre torre = new Torre();
        Rainha rainha = new Rainha();
        Rei rei = new Rei();
        Cavalo cavalo = new Cavalo();


        rei.setColuna(5);
        rei.setCor(false);
        rei.setLinha(0);
        rei.setMovimentos(1);
        
        rainha.setColuna(4);
        rainha.setCor(false);
        rainha.setLinha(0);
        rainha.setMovimentos(1);

        cavalo.setColuna(2);
        cavalo.setCor(false);
        cavalo.setLinha(0);
        cavalo.setMovimentos(1);

        bispo.setColuna(3);
        bispo.setCor(false);
        bispo.setLinha(0);
        bispo.setMovimentos(1);

        torre.setColuna(0);
        torre.setCor(false);
        torre.setLinha(0);
        torre.setMovimentos(1);
        torre.Mover(3, 3);

        peao.setColuna(5);
        peao.setCor(false);
        peao.setLinha(1);
        peao.setMovimentos(1);
        peao.Mover(2, 1);

        System.out.println(rei);
        System.out.println(rainha);
        System.out.println(peao);
        System.out.println(cavalo);
        System.out.println(torre);
        System.out.println(bispo);

    }
    
}
