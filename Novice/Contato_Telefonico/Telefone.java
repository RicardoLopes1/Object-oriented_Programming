public class Telefone {
    public Telefone(String n, String f){
        this.nome = n;
        this.fone = f;
    }
    public Telefone(){}
    private String nome, fone;
    

    //Métodos
    public String getNome() {
        return nome;
    }
    public String getFone() {
        return fone;
    }

    public boolean validate(String s){
        for( int j=0 ; j<s.length() ; j++ ){
            if( !Character.isDigit(s.charAt(j)) && s.charAt(j) != '.' ){
                if( s.charAt(j) != '(' && s.charAt(j) != ')'){
                    return false;
                }
            }
        }
        return true;
    }

    public String toString(){
        return nome+":"+fone;
    }
}