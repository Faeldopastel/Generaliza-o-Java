public class Torre extends Peca {

    public boolean Mover(int linha, int coluna){
        if(linha < 0 || coluna < 0){
            return false;
        } else{
            return true;
        }
    }
    
}
