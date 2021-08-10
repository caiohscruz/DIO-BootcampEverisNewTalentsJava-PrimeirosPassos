import java.io.IOException;
import java.util.Scanner;

public class DomingoManha {

    public static void main (String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
    		/*switch (hora) {
    			case(7): System.out.println("Atraso maximo: " + min); break;
    			case(8): System.out.println("Atraso maximo: " + (min+60)); break;
    			case(9): System.out.println("Atraso maximo: " + (min+120)); break;
    			default: System.out.println("Atraso maximo: 0"); 
    			}*/
            if (min>59){
                System.out.println("Horário inválido - min não pode ser superior a 59");
            } else {
                if (hora>6) {
                    System.out.println("Atraso maximo: " + ((hora-7)*60+min));
                } else {
                    System.out.println("Atraso maximo: 0");
                }
            }
        }
    }
}