import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

/**
 * Created by pidho on 12.04.2018.
 */
public class Main {
    public static void main(String []args){
        CompositeTube tubes = new CompositeTube();
        Scanner in = new Scanner(System.in);
        Iterator iter = tubes.CreateIterator();
        System.out.print("Choose operation:\n" +
                "add - add new tube;\n" +
                "remove - remove one of tube;\n" +
                "Iterator: update - call function update();\n" +
                "Iterator: stop - call function stop();\n" +
                "Iterator: reset - call function stop();\n" +
                "exit - end of program;\n" +
                "help - write commands.\n");
        do {
            String choise = in.nextLine();

            if (choise.compareTo("add") == 0) {
                Tube New_tube = new Tube();
                tubes.add(New_tube);
            } else if (choise.compareTo("remove") == 0) {
                System.out.print("Set index: ");
                int index = in.nextInt();
                tubes.remove(index);
            } else if (choise.compareTo("update") == 0) {
                for(int i=0; i<tubes.getCount(); i++){
                    iter.getNext().update();
                }
            }
            else if(choise.compareTo("stop") == 0){
                for(int i=0; i<tubes.getCount(); i++){
                    iter.getNext().stop();
                }
            } else if(choise.compareTo("reset") == 0){
                for(int i=0; i<tubes.getCount(); i++){
                    iter.getNext().reset();
                }
            }else if (choise.compareTo("exit") == 0) {
                break;
            }else if(choise.compareTo("help")==0){
                System.out.print("Choose operation:\n" +
                        "add - add new tube;\n" +
                        "remove - remove one of tube;\n" +
                        "update - call function update();\n" +
                        "exit - end of program;\n" +
                        "help - write commands.\n");
            }
            else {
                System.out.print("Unknown parameter, try again.\n");
                System.out.print("Choose operation:\n");
                continue;
            }
            System.out.print("Choose operation:\n");
        }while(true);
    }
}
