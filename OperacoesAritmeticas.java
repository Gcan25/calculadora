import java.io.PrintStream;
import java.util.Scanner;
public class OperacoesAritmeticas{
/**
 * @param args
 */
public static void main(String[] args){

    String Soma= ("+");
    String Subtracao= ("-");
    String Divisao= ("/");
    String Multiplicacao= ("*");
    int resultado;
    
    

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira variável:   ");
        int variavelUm = scanner.nextInt();
        System.out.print("Digite a segunda variável:   ");
        int variavelDois = scanner.nextInt();
        System.out.print("Qual operacao deseja realizar ?   ");
        String operacao = scanner.next();

            switch (operacao) {
                 case "+":
                    System.out.println(variavelUm + variavelDois);
                 break;
                 case "-":
                    System.out.println (variavelUm - variavelDois);
                 break;
                 case "/":
                    System.out.println(variavelUm / variavelDois);
                 break;
                 case "*":
                    System.out.println(variavelUm * variavelDois);
                 break;
            
                
            default:
                throw new AssertionError();
        }
        


        }

   

}