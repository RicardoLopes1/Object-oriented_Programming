import java.util.ArrayList;

public class Topic {
    public Topic(){
        listap = new ArrayList<>();
        cadeiras = new ArrayList<>();
    }
    ArrayList<Pass> listap;
    ArrayList<String> cadeiras;
    private int total, preference; 
    
    //Métodos
    public void init(int t, int pref){
        this.total = t;
        this.preference = pref;
        int j=0;
        cadeiras.clear();
        listap.clear();
        for(  ; j<pref ; j++ )
            cadeiras.add("@");

        for( ; j<t ; j++ )
            cadeiras.add("=");
    }

    public boolean in(String i, int n){
        for( int j=0 ; j<listap.size() ; j++){
            if( listap.get(j).getId().equals(i) ){
                System.out.println("fail: pass ja esta na topic");
                return false;
            }
        }
        
        String s;
        if( n >= 60 ){
            for( int k=0 ; k<cadeiras.size() ; k++ ){
                if( cadeiras.get(k).equals("@") || cadeiras.get(k).equals("=") ){
                    Pass p = new Pass(i, n);
                    listap.add(p);
                    s = cadeiras.get(k) + p.toString();
                    cadeiras.set(k, s);
                    return true;
                }
            }
        }else{
            int kmod;
            for( int k=preference ; k<total+preference ; k++ ){
                kmod = k%total;
                if( cadeiras.get(kmod).equals("@") || cadeiras.get(kmod).equals("=") ){
                    Pass p = new Pass(i, n);
                    listap.add(p);
                    s = cadeiras.get(kmod) + p.toString();
                    cadeiras.set(kmod, s);
                    return true;
                }
            }
        } 

        System.out.println("fail: topic lotada");
        return false;
    }

    public boolean out(String i){
        for( int j=0 ; j<listap.size() ; j++ ){
            if( listap.get(j).getId().equals(i) ){
                String identify = listap.get(j).toString();
                listap.remove(j);
                String piece;
                for( int k=0 ; k<cadeiras.size() ; k++ ){
                    piece = cadeiras.get(k).substring(1);
                    if( piece.equals(identify) ){
                        String special = cadeiras.get(k).substring(0, 1);
                        cadeiras.set(k, special);
                        return true;
                    }
                }
            }
        }
        System.out.println("fail: pass nao esta na topic");
        return false;
    }

    public String toString(){
        return cadeiras.toString();
    }
}