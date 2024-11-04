public class Gato extends Mamifero {
    
    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("cor = [");
        builder.append(cor);
        builder.append("]");

        builder.append(super.toString());
        

        return builder.toString();
    }

}
