package Heranca;

/*CarroCombate agora HERDA todos as caracteristicas da classe PAI Carro */

public class CarroCombate extends Carro {

    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private int qtdeArmamento;

    public CarroCombate(String nome,int blindagem){//CLASSE FILHO HERDANDO ATRIBTOS DA CLASSE PAI
        super(nome);//chama o construtor da classe pai que no caso é a string nome, essa condiçao é nescessaria toda vez que herdar a classe PAI
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtdeArmamento=100;
    }

    public void setQTdeArmamento(int qtdeArmamento){
        
        this.qtdeArmamento = this.qtdeArmamento + qtdeArmamento;

        if(this.qtdeArmamento > MAX_ARMAMENTO){

            this.qtdeArmamento = MAX_ARMAMENTO;
        }
        if(this.qtdeArmamento < MIN_ARMAMENTO){

            this.qtdeArmamento = MIN_ARMAMENTO;
        }
    }
    
    public int getQtdeArmamento(){
        return this.qtdeArmamento;
    }

    public void atirar(){
        if(this.qtdeArmamento > MIN_ARMAMENTO ){
            setQTdeArmamento(-1);
        }
        else{
            System.out.println("Sem muniçao");
        }
    }

    public void info(){
        
        super.info();
        System.out.printf("Qtde armamento.....:%d%n",this.qtdeArmamento);
        
    }

}
