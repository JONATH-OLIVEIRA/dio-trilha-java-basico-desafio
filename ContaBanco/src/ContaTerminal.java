import java.io.Console;

public class ContaTerminal {
    public static void main(String[] args) {
        String sigla;
      
        Console console = System.console();

        System.out.println("Digite a sua Nota: ");
        sigla = console.readLine();       

       switch (sigla){
        case "P":{
            System.out.println("PEQUENO");
            break;
        }
        case "M":{
            System.out.println("MEDIO");
            break;
        }
        case "G":{
            System.out.println("GRANDE");
            break;
        }
            
          default:
          System.out.println("INDEFINIDO");
       }
      
    }
}