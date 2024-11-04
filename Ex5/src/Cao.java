public class Cao extends Mamifero {

    private String raca;
    

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString(){
     
        StringBuilder builder = new StringBuilder();
        builder.append("Raça = [");
        builder.append(raca);
        builder.append("]");

        builder.append(super.toString());
        

        return builder.toString();
    }
}
    
