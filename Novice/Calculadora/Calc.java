import javax.swing.plaf.multi.MultiSeparatorUI;
import java.util.ArrayList;
import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String line;
        String ui[];
        String cmd, res;
        int a, b;
        Calculadora c = new Calculadora();

        while (true){
            line = ler.nextLine();
            ui = line.split(" ");
            cmd = ui[0];

            switch (cmd){
                case "end":
                    break;
                case "show":
                    System.out.println("Battery = " + c.getBattery());
                    break;

                case "init":
                    c = new Calculadora(Integer.parseInt(ui[1]));
                    break;

                case "charge":
                    c.charge(Integer.parseInt(ui[1]));
                    break;

                case "sum":
                    a = Integer.parseInt(ui[1]);
                    b = Integer.parseInt(ui[2]);
                    res = c.sum(a, b);
                    c.useBattery();
                    System.out.println(res);
                    break;

                case "div":
                    a = Integer.parseInt(ui[1]);
                    b = Integer.parseInt(ui[2]);
                    res = c.div(a, b);
                    c.useBattery();
                    System.out.println(res);
                    break;

                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("init, show, charge, sum, div e end.");
                    System.out.println("Leia a descrição do problema para mais informações.");

            }//end switch
            if (cmd.equals("end"))break;

        }//end while
        System.out.println("#__end__");
        ler.close();

    }//end main
}//end vetores
