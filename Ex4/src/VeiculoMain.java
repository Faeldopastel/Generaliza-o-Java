public class VeiculoMain {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();


        carro.setMotor(true);
        carro.setPortas(4);

        moto.setMotor(true);
        moto.setCilindradas(300);

        caminhao.setEixos(4);
        caminhao.setMotor(true);

        System.out.println(carro);
        System.out.println(caminhao);
        System.out.println(moto);






    }
    
}
