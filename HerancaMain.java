package Heranca;

import java.util.Scanner;

/*
    Herança é quando tenho uma classe FILHO que vai herdar caracteristicas de uma classe PAI
    Tudo que for implementado na classe PAI sera tambem implementado automaticamente na classe FILHO
    ex na classe CARRO
*/



public class HerancaMain {
    
    public static void main(String[]args){
       

       
    Carro c1=new Carro("Gol");  //instancia da classe PAI
    
    c1.info();//metodo para ler informaçao
        
    CarroCombate c2=new CarroCombate("tanque", 250);
    c2.atirar();
    c2.atirar();
    c2.info();
    

    
}

}
