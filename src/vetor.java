import java.util.Scanner;

public class vetor {

    public static void main(String[] args) throws Exception {
    
      double soma=0, media;
      int total=0;
      Scanner ler = new Scanner(System.in);

      System.out.println("quantos alunos vc deseja incluir?");
      total = ler.nextInt();
      ler.nextLine();

      String[] nomes = new String[total];
      double[] notas = new double[total];


      for(int i=0; i<total; i++){
          System.out.println("digite o nome do aluno" + (i+1));
          nomes[i] = ler.nextLine();
          System.out.println("digite a nota do aluno" + (i+1));
          notas[i] = ler.nextDouble();
          soma = soma +notas[i];
          ler.nextLine();
      }
         media = soma / total;
         System.out.println("a media dos alunos e:" + media);
         System.out.println("lista de alunos acima da media:");

         for(int i=0; i<total; i++){
           if(notas[i] > media){
             System.out.println(nomes[i]);
           }
         }
         ler.close();
    }
}
