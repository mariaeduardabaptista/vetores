import java.util.Scanner;

public class vetor {

    public static void main(String[] args) throws Exception {
    
      double soma=0, media;
      int total=0;
      Scanner ler = new Scanner(System.in);

      System.out.println("Quantos alunos voce deseja incluir?");
      total = ler.nextInt();
      ler.nextLine();

      String[] nomes = new String[total];
      double[] notas = new double[total];


      for(int i=0; i<total; i++){
          System.out.println(" Digite o nome do aluno: " + (i+1));
          nomes[i] = ler.nextLine();
          System.out.println(" Digite a nota do aluno: " + (i+1));
          notas[i] = ler.nextDouble();
          soma = soma +notas[i];
          ler.nextLine();
      }
         media = soma / total;
         System.out.println("A media dos alunos e:" + media);
         System.out.println("Lista de alunos acima da media:");

         for(int i=0; i<total; i++){
           if(notas[i] > media){
             System.out.println(nomes[i]);
           }
         }
         ler.close();
    }
}
