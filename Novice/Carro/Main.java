import java.util.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro c = new Carro();
        String line, opc;
        String lineSlip[];
        int n;
        
        while(true){
            line = ler.nextLine();
            lineSlip = line.split(" ");
            opc = lineSlip[0];

            switch( opc ){
                case "show":
                    System.out.println(c.toString());
                    break;

                case "in":
                    c.in();
                    break;

                case "out":
                    c.out();
                    break;

                case "fuel":
                    n = Integer.parseInt(lineSlip[1]);
                    c.fuel(n);
                    break;

                case "drive":
                    n = Integer.parseInt(lineSlip[1]);
                    c.drive(n);
                    break;

                case "end":
                    break;
            
                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("show, in, out, fuel, drive e exit.");
                    System.out.println("Leia a descrição do problema para mais informações.");
            }
            if(opc.equals("end")) break;
        }
        System.out.println("#__end__");
        ler.close();
    }
}