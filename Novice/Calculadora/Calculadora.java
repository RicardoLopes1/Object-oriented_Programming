public class Calculadora {
    public Calculadora(int mb){
        this.maxBattery = mb;
        this.battery = 0;
    }
    public Calculadora(){
        this.battery = 0;
    }
    private int battery;
    private int maxBattery;

    public void charge(int c){
        if ((c+battery) <= maxBattery)
            battery += c;
        else
            battery = maxBattery;
    }

    public void useBattery(){
        if (battery > 0)
            battery -= 1;
    }

    public String sum(int a, int b){
        if (battery > 0){
            a += b;
            return String.valueOf(a);
        }else
            return "fail: bateria insuficiente";

    }

    public String div(int a, int b){
        if (battery > 0){
            if (b != 0){
                a /= b;
                return String.valueOf(a);
            }else
                return "fail: divisão por zero";
        }else
            return "fail: bateria insuficiente";
    }

    public int getBattery() {
        return battery;
    }
}
