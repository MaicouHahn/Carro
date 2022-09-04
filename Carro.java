package Heranca;


/*   Classe Pai */

public class Carro {
    
    private String nome;
    private boolean ligado;
    private boolean destruido;
    private boolean armamento;
    private int blindagem;


    public Carro(String nome){
        
        this.nome=nome;
        this.ligado=false;
        this.destruido=false;
        this.armamento=false;
        this.blindagem=0;
        }


    public String getNome(){
        return this.nome;
    }
    public Boolean getLigado(){
        return this.ligado;
    }
    public Boolean getDestruido(){
        return this.destruido;
    }
    public Boolean getArmamento(){
        return this.armamento;
    }
    public int getBlindagem(){
        return this.blindagem;
    }
    public void setBlindagem(int blindagem){
        this.blindagem=blindagem;
    }
    public void setArmamento(boolean armamento){
        this.armamento=armamento;
    }
    public void setLigado(boolean ligado){
        this.ligado=ligado;
    }
    public void setDestruido(boolean destruido){
        this.destruido=destruido;
    }
    public void sofrerDano(int dano){

        this.blindagem = this.blindagem - dano;

        if(blindagem <= 0 ){
            this.ligado=false;
            this.blindagem=0;
            this.destruido=true;
        }
    }
    public void info(){
        System.out.printf("---------------------------------------------------------\n");
        System.out.printf("Nome...............:%s%n",this.nome);
        System.out.printf("Ligado.............:%s%n",this.ligado ? " Sim " : " Não ");
        System.out.printf("Destruido..........:%s%n",this.destruido ? " Sim " : " Não");
        System.out.printf("Blindagem..........:%d%n",this.blindagem);
        System.out.printf("Armamento..........:%s%n",this.armamento ? " Sim " : " Não ");
    }
}
