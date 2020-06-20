import java.util.*;

public class Carro{
    public Carro(){
        this.pass = 0;
        this.passMax = 2;
        this.gas = 0;
        this.gasMax = 10;
        this.km = 0;
    }
    private int pass;
    private int passMax;
    private int gas;
    private int gasMax;
    private int km;

    public void in(){
        if( pass < passMax ){
            this.pass = pass + 1;
        }else
            System.out.println("fail: limite de pessoas atingido");
        
    }

    public void out(){
        if( pass > 0 ){
            this.pass = pass - 1;
        }else
            System.out.println("fail: nao ha ninguem no carro");
    }

    public void fuel(int n){
        if( (gas + n) < gasMax ){
            this.gas = gas + n;
        }else
            this.gas = 10;
    }

    public void drive(int d){
        if( pass != 0 ){
            if((gas - d/10) >= 0){
                this.km += d;
                this.gas = (gas - d/10);
            }else
                System.out.println("fail: gasolina insuficiente");
        }else
            System.out.println("fail: nao ha ninguem no carro");
    }

    public String toString(){
        return "pass: " +pass+", gas: " +gas+ ", km: "+km;
    }
}