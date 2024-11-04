public class Ambiente {

    private float area;

    public void setArea(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("area total = ");
        builder.append(area);
        

        return builder.toString();

    }
    
}
