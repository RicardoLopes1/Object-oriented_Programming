import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String line, opc;
        String sline[];
        Cinema c = new Cinema();
        int n;
        

        while( true ){
            line = ler.nextLine();
            sline = line.split(" ");
            opc = sline[0];
            
            switch( opc ){
                case "show":
                    System.out.println(c.toString());
                    break;

                case "init":
                    n = Integer.parseInt(sline[1]);
                    c.init(n);
                    break;

                case "reservar":
                    n = Integer.parseInt(sline[3]);
                    c.reservar(sline[1], sline[2], n);
                    break;

                case "cancelar":
                    c.cancelar(sline[1]);
                    break;

                case "end":
                    break;
                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("init, show, reservar, cancelar e end");
                    System.out.println("Leia a descrição do problema para mais informações.");  
            }
            if(opc.equals("end")) break;
        }
        System.out.println("#__end__");
        ler.close();
    }
}