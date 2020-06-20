import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String line, opc;
        String sline[];
        int e, s, l;
        Pet p = new Pet();

        while( true ){
            line = ler.nextLine();
            sline = line.split(" ");
            opc = sline[0];

            switch( opc ){
                case "init":
                    e = Integer.parseInt(sline[1]);
                    s = Integer.parseInt(sline[2]);
                    l = Integer.parseInt(sline[3]);
                    p = new Pet(e, s, l);
                    break;

                case "show":
                    System.out.println(p.toString());
                    break;

                case "play":
                    p.play();
                    break;
                
                case "eat":
                    p.eat();
                    break;

                case "sleep":
                    p.sleep();
                    break;

                case "clean":
                    p.clean();
                    break;

                case "end":
                    break;
            
                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("init, show, play, eat, sleep, clean e end");
                    System.out.println("Leia a descrição do problema para mais informações.");
            }
            if(opc.equals("end")) break;
        }
        System.out.println("#__end__");
        ler.close();
        
    }
}