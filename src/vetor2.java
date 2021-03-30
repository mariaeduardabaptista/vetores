import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite nomes separados por virgula: ");
        String[] nomes = ler.nextLine().split(",");

        System.out.println("Nomes:\n");

        for (int i=0; i<nomes.length; i++){
            System.out.println(nomes[i].trim());
        }
    ler.close();    
    }

    
}
