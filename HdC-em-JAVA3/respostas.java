/* Exercício 1
import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe dois valores: ");
        double valorA = ler.nextDouble();
        double valorB = ler.nextDouble();

        while(valorA <= 0) {
            System.out.println("Informe um valor maior que zero: ");
            valorB = ler.nextDouble();
        }

        System.out.println("A divisao entre os dois valores e = " + valorA/valorB);
        ler.close();
    }   
} */

/* Exercício 2
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	        
      int a;
		
	
     for(a = 0; a < 30; a++) {
        System.out.println(a);
      }

      System.out.println("EXPLOSÃO !");
	   sc.close();
	}
    
} */

/* Exercício 3
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
 
      int a;
		
	
     for(a = 10; a > 0; a--) {
        System.out.println(a);
      }

      System.out.println("Oi meu chapa!");
	   sc.close();
	}
    
} */

/* Exercício 4
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double i = 15;
        double acumuladora = 0;
        double cont = 0;

        while(i < 100) {
            i++;
            cont++;
            acumuladora += i;
        }
        System.out.println(acumuladora/cont);
    }
} */

/* Exercício 5
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num1, num2, acum = 0, calc = 0;

        System.out.println("Informe um número: ");
        num1 = ler.nextInt();

        System.out.println("Informe outro número: ");
        num2 = ler.nextInt();

        while(num1 <= num2) {
            acum+=num1;
            num1++;
            calc++;
        }
        System.out.println(acum/calc);
    }
} */

/* Exercício 6
import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aprovados = 0;
        int x = 0;
        String g = "n";

        for( ; x < 10; x++) {
            System.out.println("Qual a primeira nota?");
            double um = ler.nextInt();
            System.out.println("Qual a segunda nota?");
            double dois = ler.nextInt();
            double conta = (um + dois) /2;

            if(conta >= 9.5) {
                aprovados++;
            };

            System.out.println("Calcular a media de outro aluno sim nao? ");
            ler.nextLine();
            String p = ler.nextLine();

            switch( p ){
                case ( "N" ):
                    System.out.println("O numero de alunos aprovados foi de: " + aprovados);
                    x = 10;
                    break;
                case ( "n" ):
                    System.out.println("O numero de alunos aprovados foi de: " + aprovados);
                    x = 10;
                    break;
                case ( "nao" ):
                    System.out.println("O numero de alunos aprovados foi de: " + aprovados);
                    x = 10;
                    break;
            }

        }

    }
} */