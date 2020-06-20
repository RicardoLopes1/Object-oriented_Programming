import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String line, opc;
        String sline[];
        Contato c = new Contato();
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
                    c.init(sline[1]);
                    break;

                case "add":
                    c.add(sline[1], sline[2]);
                    break;

                case "rm":
                    try {
                        n = Integer.parseInt(sline[1]);
                        c.remove(n);
                    } catch (NumberFormatException e) {
                        System.out.println("Digite um número válido");
                    }
                    break;

                case "update":
                    c.update(sline);
                    break;

                case "end":
                    break;
            
                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("show, init, add, rm, update e end");
                    System.out.println("Leia a descrição do problema para mais informações.");
            }
            if(opc.equals("end")) break;
        }
        System.out.println("#__end__");
        ler.close();
    }
    
}