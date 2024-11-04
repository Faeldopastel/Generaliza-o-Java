public class ItemMain {

    public static void main(String[] args) {
        
        Livro livro = new Livro();
        Cd cd = new Cd();
        Vhs vhs = new Vhs();


        livro.setAutor("Romário");
        livro.setCodigo(20);
        livro.setDescricao("Crimes");
        System.out.println("");
        System.out.println(livro);


        cd.setFaixas(10);
        cd.setArtista("Soad");
        cd.setAlbum("Steal this album");
        cd.setCodigo(15);
        cd.setDescricao("O mandelão");
        cd.setDuracao(3.34f);
        cd.setGravadora("Irineu productions");


        System.out.println("");
        System.out.println(cd);


        vhs.setTitulo("Adonaranha");
        vhs.setDescricao("Subiu pela parede");
        vhs.setCodigo(30);
        vhs.setDuracao(10f);
        vhs.setGravadora("Marvel");
        System.out.println("");

        System.out.println(vhs);



    }
    
}
