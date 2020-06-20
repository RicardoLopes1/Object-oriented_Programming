public class Pass {
    public Pass(String i, int idad){
        this.id = i;
        this.idade = idad;

    }
    private String id;
    private int idade;

    public String getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String toString(){
        return id+":"+idade;
    }
    
}