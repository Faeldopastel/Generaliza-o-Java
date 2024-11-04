public class Lagarto extends Reptil{

    private boolean solta_rabo;

    public void setSolta_rabo(boolean solta_rabo) {
        this.solta_rabo = solta_rabo;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Solta o rabo? = [");
        builder.append(solta_rabo);
        builder.append("]");
        
        builder.append(super.toString());
        

        return builder.toString();
    }
    
}
