package forcaelastica;

import java.util.Scanner;
public class ForcaElastica {


    public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    int op=0;
    float forca=0, ΔL=0, k=0;
    System.out.println("1 Para descobrir o coeficiente 'K'; \n2 Para descobrir a deformaçao 'ΔL';"
            + "\n3 para descobrir a força nessesaria para deformar a mola; ");
    do{
    op = imput.nextInt();
    }while(((op==1)&&(op==2))&&(op==3));
    if (op == 1){
        System.out.println("Qual a força que esta sendo exercida na mola? (em Niltons)");
        forca = imput.nextFloat();
        System.out.println("Qual a deformaçao que esta força causou na mola? (em Metros)");
        ΔL = imput.nextFloat();
        k = forca / ΔL;
        System.out.println("O coeficiente K é igual a : "+k);
    }
    else{
    }
      if (op == 2){
          System.out.println("Qual a força que esta sendo exercida na mola? (em Niltons)");
          forca = imput.nextFloat();
          System.out.println("Qual o coeficiente 'K' ? (em N/M)");
          k = imput.nextFloat();
          ΔL = forca / k;
          System.out.println("O coeficiente ΔL é igual a : "+ΔL);
      }
      else{
          System.out.println("Qual a deformaçao que esta força causou na mola? (em Metros)");
          ΔL = imput.nextFloat();
          System.out.println("Qual o coeficiente 'K' ? (em N/M)");
          k = imput.nextFloat();
          forca = ΔL * k;
          System.out.println("O coeficiente ΔL é igual a : "+forca);
      }
    }
    
}
