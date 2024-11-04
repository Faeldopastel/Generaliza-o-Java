public class MilleniumFalcon extends Apolo11{

    private float hiperpropulsor;

    public void setHiperpropulsor(float hiperpropulsor) {
        this.hiperpropulsor = hiperpropulsor;
    }

    public float getHiperpropulsor() {
        return hiperpropulsor;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("HiperPropulsor = [");
        builder.append(hiperpropulsor);
        builder.append("]");
        builder.append(super.toString());
        


        return builder.toString();

    }


    
}
