import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*9. Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: nome, cognome, codice ed età, e che contenga il costruttore parametrizzato ed i metodi getCodice, getCognome e getEta che restituiscono rispettivamente il codice, il cognome e l’età del docente.

Scrivere poi una classe Universita, che rappresenti un insieme di docenti universitari tramite un array di tipo Docente, e che contenga il costruttore parametrizzato ed un metodo etaMinima che restituisce la minima
età tra i docenti universitari.

Inserire nella classe Universita il metodo TrovaGiovani che restituisca i cognomi dei docenti che hanno età minima

         */
        Universista uni = new Universista(Arrays.asList(new Docente("Pippo","Pluto","123",5)));

        MetodiUnivesita.trovaListaGiovani(uni);

    }
}