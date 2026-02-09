package libreria;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
    
     Libro libri[]=new Libro[4];
     
     for(int i=0;i<libri.length;i++) {
         System.out.println("Inserisci titolo del libro :"+(i+1));
         String titolo=scanner.nextLine();
         System.out.println(" Inserisci il suo prezzo :"+(i+1));
         Double prezzo=scanner.nextDouble();
         scanner.nextLine();
         
         Libro L=new Libro(titolo,prezzo);
         
         libri[i]=L;
        
     }
     System.out.println("\n ----ELENCO LIBRI---");
         for(int i=0;i<libri.length;i++) {
             libri[i].stampaInfo();
             
             
         }
     }
     
     
    }


