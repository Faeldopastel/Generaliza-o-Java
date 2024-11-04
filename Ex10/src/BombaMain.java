public class BombaMain {

    public static void main(String[] args) {
        
        BombaDiesel diesel = new BombaDiesel();
        BombaEtanol etanol = new BombaEtanol();
        BombaGasolina gasolina = new BombaGasolina();

        diesel.setTotalLitros(150);
        diesel.setValorLitro(5.50f);

        gasolina.setTotalLitros(1000);
        gasolina.setValorLitro(6.00f);

        etanol.setTotalLitros(1000);
        etanol.setValorLitro(4.75f);


        gasolina.AbastecerPorLitro(10);
        gasolina.AbastecerPorValor(23.00);

        etanol.AbastecerPorLitro(20);
        etanol.AbastecerPorValor(50);
        
        diesel.AbastecerPorLitro(20);
        diesel.AbastecerPorValor(50);


        System.out.println(gasolina);
        System.out.println(diesel);
        System.out.println(etanol);


    }
    
}
