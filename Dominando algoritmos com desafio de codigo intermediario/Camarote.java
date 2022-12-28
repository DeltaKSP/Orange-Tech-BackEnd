// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner; 
    
public class Camarote {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        int impares = 0;
        int de = 1;
        int ate = tamanhoDaFila;
          for (int numero = de; numero <= ate; numero++) {
            if (numero % 2 != 0) {
            impares++;
    }
}
        System.out.print(impares + " pessoas no camarote");
        leitor.close();
    }
}