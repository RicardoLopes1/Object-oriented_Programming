import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String line, opc;
        String sline[];
        Topic t = new Topic();
        int a, b;

        while( true ){
            line = ler.nextLine();
            sline = line.split(" ");
            opc = sline[0];

            switch( opc ){
                case "init":
                    a = Integer.parseInt(sline[1]);
                    b = Integer.parseInt(sline[2]);
                    t.init(a, b);
                    break;

                case "show":
                    System.out.println(t.toString());
                    break;

                case "in":
                    a = Integer.parseInt(sline[2]);
                    t.in(sline[1], a);
                    break;

                case "out":
                    t.out(sline[1]);
                    break;

                case "end":
                    break;
            
                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("init, show, in, out e end");
                    System.out.println("Leia a descrição do problema para mais informações.");
            }
            if(opc.equals("end")) break;
        }
        System.out.println("#__end__");
        ler.close();
    }
    
    
}