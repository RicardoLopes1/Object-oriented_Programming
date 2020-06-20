import java.util.Vector;

public class Contato {
    public Contato(){
        this.nome = "vazio=>";
        this.status = nome;
        fone = new Telefone();
        listaFone = new Vector<>();
    }
    private String nome, status;
    Telefone fone;
    Vector<Telefone> listaFone;
    char[] arrayCh;
    /*
    Iterator iter1 = nomes.iterator();
        while(iter1.hasNext())
            System.out.print("["+iter1.next()+"]");
    */ 

    public void init(String n){
        this.nome = n+"=>"; 
        this.status = nome;
        listaFone.clear();
    }

    public boolean add(String n, String d){
        if( !fone.validate(d) ){
            System.out.println("fail: fone invalido");
            return false;
        }
        this.status = nome; 
        Telefone t = new Telefone(n, d);
        listaFone.add(t);
        for( int i=0 ; i<listaFone.size() ; i++ ){
            this.status = status+"["+i+":"+listaFone.get(i).toString()+"]";
        }
        return true;
    }

    public boolean remove(int n){
        try{
            listaFone.remove(n);
            this.status = nome;
            for( int i=0 ; i<listaFone.size() ; i++ ){
                this.status = status+"["+i+":"+listaFone.get(i).toString()+"]";
            }
            return true; 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Contato inexitente");
        }
        return false;
    }

    public boolean update(String[] wordsUp){
        init(wordsUp[1]);
        listaFone.clear();
        int k=0;
        int i=2;
        while(i<wordsUp.length){
            int j = 0;
            while( wordsUp[i].charAt(j) != ':'){
                j++;
            }
            
            if( fone.validate(wordsUp[i].substring(j+1)) ){
                String n, d;
                n = wordsUp[i].substring(0, j);
                d = wordsUp[i].substring(j+1);
                Telefone t = new Telefone(n, d);
                listaFone.add(t);
                this.status = status+"["+k+":"+listaFone.get(k).toString()+"]";
                k++;
            }
            i++;
        }
        return true;
    }

    public String toString(){
        return status;
    }

}