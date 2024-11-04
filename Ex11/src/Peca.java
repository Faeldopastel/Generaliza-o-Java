public class Peca{

    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;
    
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getColuna() {
        return coluna;
    }
    
    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getLinha() {
        return linha;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }

    public int getMovimentos() {
        return movimentos;
    }


    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Linha = [");
        builder.append(linha);
        builder.append("]\n");
        
        builder.append("cor = [");
        builder.append(cor);
        builder.append("]\n");

        builder.append("coluna = [");
        builder.append(coluna);
        builder.append("]\n");

        builder.append("Movimento = [");
        builder.append(movimentos);
        builder.append("]\n");



        return builder.toString();
    }

    



}