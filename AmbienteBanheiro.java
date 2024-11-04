public class AmbienteBanheiro extends Ambiente {

    private boolean banheira;

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    public boolean GetBanheira(boolean banheira){
        return banheira;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Tem banheira =");
        builder.append(banheira);
        builder.append(super.toString());

        return builder.toString();

    }
    



    
}
