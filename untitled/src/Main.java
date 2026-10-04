import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Schueleranzahl;
        int Anzahl;
        String zwischenName;
        int zwischenAlter;
        int zwischenNote;
        System.out.println("Wieviele Schüler willst du anlegen");
        Anzahl = sc.nextInt();
        Schüler[] Schulklasse=new Schüler[Anzahl];
        for (int i = 0; i < Schulklasse.length; i++) {
            System.out.println("Wie heißt der Schüler");
            zwischenName=sc.next();
            System.out.println("Wann ist der Schüler geboren");
            zwischenAlter=sc.nextInt();
            System.out.println("Welche Note hat der Schüler");
            zwischenNote=sc.nextInt();
            Schulklasse[i]=new Schüler(zwischenNote, zwischenName, zwischenAlter);
            if (i!=Schulklasse.length-1) System.out.println("-------- NÄCHSTER SCHÜLER --------");
            else{
                System.out.println();
                System.out.println("LISTE:");
            }
        }
        for (int i = 0; i < Schulklasse.length; i++) {
            System.out.println("Name: "+Schulklasse[i].getName()+" Geburtsjahr: "+Schulklasse[i].getGeburtsjahr()+" Note: "+Schulklasse[i].getSchulnote());
        }
    }
}