import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 try{
    Scanner skan = new Scanner(System.in);
   String imie;
    String nazwisko;
    String urodzenie;
    int wiek;
    int funkcja;
    System.out.println("Wybierz funkcję: \n"+
                "1 - dodanie nowego studenta \n"+
                "2 - wyszukanie danego studenta \n");
    funkcja = skan.nextInt();
    switch(funkcja)
      {
        case 1:
          {
            Scanner skan1 = new Scanner(System.in);
            System.out.println("Podaj imie:");
            imie = skan1.nextLine();
            Scanner skan2 = new Scanner(System.in);
            System.out.println("Podaj nazwisko:");
            nazwisko = skan2.nextLine();
            Scanner skan3 = new Scanner(System.in);
            System.out.println("Podaj date urodzenia:");
            urodzenie = skan3.nextLine();
          }break;

        case 2:
          {
            
          }
      }
   }catch (IOException e) {
   }
    
    }
}