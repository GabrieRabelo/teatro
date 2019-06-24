
/**
 * Write a description of class Poltrona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poltrona
{
    private String identificacao;
    private int setor;
    private boolean ocupada;
    
    public Poltrona(String identificacao, int setor){
        this.identificacao = identificacao;
        this.setor = setor;
        ocupada = false;
    }
    
    public String getIdentificacao(){ return identificacao; }
    public int getSetor(){ return setor;}
    public boolean estaOcupada(){ return ocupada;}
    public void reserva(){
        ocupada = true;
    }
    public void libera(){
        ocupada = false;
    }
    public String toString(){
        if(ocupada) return setor +"O";
        return setor+"L";
    }
}