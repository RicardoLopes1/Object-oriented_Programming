public class Cliente {
    public Cliente(String i, String f){
        this.id = i;
        this.fone = f;
    }
    private String id, fone;

    public String getId() {
        return id;
    }
    public String getFone() {
        return fone;
    }
    
    public String toString(){
        return id+":"+fone;
    }
}