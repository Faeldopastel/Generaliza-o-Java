public class AmbienteSala extends Ambiente{

    private boolean tv;

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean GetTV(boolean tv){
        return tv;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("tem tv =");
        builder.append(tv);
        builder.append(super.toString());

        return builder.toString();

    }
    
    
}
