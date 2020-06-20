public class Pet {
    public Pet(){}
    public Pet(int energyMax, int hungryMax, int cleanMax){
        this.energyMax = energyMax;
        this.energy = energyMax;
        this.hungryMax = hungryMax;
        this.hungry = hungryMax;
        this.cleanMax = cleanMax;
        this.clean = cleanMax;
        this.diamonds = 0;
        this.alive = true;
    }
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, clean;
    private int diamonds;
    int age;
    boolean alive;

    //métodos
    public void play(){
        if(alive){
            //-2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade.
            setEnergy(-2);
            setHungry(-1);
            setClean(-3);
            this.diamonds = diamonds + 1;
            this.age = age + 1;
        }else
            System.err.println("fail: pet esta morto");
        
    }

    public void eat(){
        if(alive){
            //-1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade
            setEnergy(-1); 

            if((hungry+4) >= hungryMax) this.hungry = hungryMax;
            else setHungry(4);
            
            setClean(-2);
            this.diamonds = diamonds + 0;
            this.age = age + 1;
        }else
            System.err.println("fail: pet esta morto");
    }

    public void sleep(){
        if(alive){
            //energia até o máximo e idade aumenta do número de turnos que o pet dormiu.
            //Para dormir, precisa ter perdido pelo menos 5 unidades de energia
            if((energyMax - energy) >= 5){
                this.age = age + (energyMax - energy);
                this.energy = energyMax;
            }else
                System.out.println("fail: nao está com sono.");
        }else
            System.err.println("fail: pet esta morto");

    }

    public void clean(){
        if(alive){
            //-3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.
            setEnergy(-3);
            setHungry(-1);
            this.clean = cleanMax;
            this.diamonds = diamonds + 0;
            this.age = age + 2;
        }else
            System.err.println("fail: pet esta morto");
    }

    //set
    public void setEnergy(int e) {
        this.energy += e;
        if( energy <= 0 ){
            this.energy = 0;
            alive = false;
            System.out.println("fail: pet morreu de fraqueza");
        }
    }

    public void setHungry(int h) {
        this.hungry += h;
        if( hungry <= 0 ){
            this.hungry = 0;
            alive = false;
            System.out.println("fail: pet morreu de fome");
        }
    }

    public void setClean(int c) {
        this.clean += c;
        if( clean <= 0 ){
            this.clean = 0;
            alive = false;
            System.out.println("fail: pet morreu de sujeira");
        }
    }
    
    //get
    public int getEnergy() {
        return energy;
    }
    public int getEnergyMax() {
        return energyMax;
    }
    public int getHungry() {
        return hungry;
    }
    public int getHungryMax() {
        return hungryMax;
    }
    public int getClean() {
        return clean;
    }
    public int getCleanMax() {
        return cleanMax;
    }

    public String toString(){
        return "E:"+getEnergy()+"/"+getEnergyMax()+
        ", S:"+getHungry()+"/"+getHungryMax()+
        ", L:"+getClean()+"/"+getCleanMax()+
        ", D:"+this.diamonds+", I:"+this.age;
    }


}