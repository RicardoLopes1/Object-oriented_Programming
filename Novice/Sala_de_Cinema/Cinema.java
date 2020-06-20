import java.util.ArrayList;

public class Cinema {
    public Cinema(){
        sala = new ArrayList<>();
        listac = new ArrayList<>();
    }
    private String id, fone;
    ArrayList<String> sala;
    ArrayList<Cliente> listac;

    public void init(int n){
        sala.clear();
        for( int i = 0 ; i<n ; i++ )
            sala.add("-");
    }

    public boolean reservar(String i, String f, int index){
            for( int j=0 ; j<listac.size() ; j++ ){
                if( listac.get(j).getId().equals(i) ){
                    System.out.println("failure: cliente ja esta no cinema");
                    return false;
                }
            }
            if( sala.get(index).equals("-") ){
                Cliente cli = new Cliente(i, f);
                listac.add(cli);
                sala.set(index, cli.toString());
                return true;
            }else{
                System.out.println("failure: cadeira ja esta ocupada");
                return false;
            } 
    }

    public boolean cancelar(String i){
        String leaveCliente = "0";
        for( int k=0 ; k<listac.size() ; k++ ){
            if( listac.get(k).getId().equals(i) ){
                leaveCliente = listac.get(k).toString();
                listac.remove(k);
                break;
            }
        }
        if(leaveCliente.equals("0")){
            System.out.println("failure: cliente nao esta no cinema");
            return false;
        }
        
        for( int j=0 ; j<sala.size() ; j++ ){
            if( sala.get(j).equals(leaveCliente) ){
                sala.set(j, "-");
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return sala.toString();
    }

}