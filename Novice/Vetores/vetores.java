import java.util.ArrayList;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String line;
        String ui[];
        String cmd;
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<Integer> lfind = new ArrayList<>();
        int j=1, ind;

        while (true){
            line = ler.nextLine();
            ui = line.split(" ");
            cmd = ui[0];

            switch (cmd) {
                case "end":
                    break;

                case "show":
                    System.out.printf("[ ");
                    for (int i = 0; i < lista.size(); i++)
                        System.out.printf("%s ", lista.get(i));

                    System.out.printf(" ]\n");
                    break;

                case "rshow":
                    System.out.printf("[ ");
                    for (int i = lista.size() - 1; i >= 0; i--)
                        System.out.printf("%s ", lista.get(i));

                    System.out.printf(" ]\n");
                    break;

                case "add":
                    for (int i = 1; i < ui.length; i++)
                        lista.add(ui[i]);
                    break;

                case "find":
                    while ( j< ui.length){
                        for (int k=0; k<lista.size(); k++){
                            if (ui[j].equals(lista.get(k))){
                                lfind.add(k);
                                break;
                            }
                        }//end for

                        if (lfind.size() == j-1)
                            lfind.add(-1);
                        j++;

                    }// end while find
                    j=1;
                    System.out.printf("[ ");
                    for (int i = 0; i < lfind.size(); i++)
                        System.out.printf("%d ", lfind.get(i));

                    System.out.printf(" ]\n");
                    lfind.clear();
                    break;

                case "ins":
                    ind = Integer.parseInt(ui[1]);
                    if(ind >= 0){
                        if (ind > lista.size())
                            ind = lista.size();

                        lista.add(ind, ui[2]);
                    }
                    break;

                case "rmi":
                    ind = Integer.parseInt(ui[1]);
                    if(ind >= 0 && ind < lista.size()) {
                        lista.remove(ind);
                    }else
                        System.out.println("fail");
                    break;

                case "rma":
                    ind = 0;
                    while ( ind<lista.size()) {
                        if (ui[1].equals(lista.get(ind))) {
                            lista.remove(ind);
                        } else
                            ind++;
                    }
                    break;

                default:
                    System.out.println("Comando inválido.");
                    System.out.println("Os comando válidos são:");
                    System.out.println("show, rshow, add, find, ins, rmi, rma e end.");
                    System.out.println("Leia a descrição do problema para mais informações.");

            }//end switch

            if(cmd.equals("end"))break;
        }//end while
        System.out.println("#__end__");
        ler.close();
    }//end main
}//end vetores
