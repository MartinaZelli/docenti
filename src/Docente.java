public class Docente {
      /*9.
Scrivere poi una classe Universita, che rappresenti un insieme di docenti universitari
tramite un array di tipo Docente, e che contenga il costruttore parametrizzato ed
un metodo etaMinima che restituisce la minima
età tra i docenti universitari.

Inserire nella classe Universita il metodo TrovaGiovani
che restituisca i cognomi dei docenti che hanno età minima

         */
private String name;
private String surname;
private String code;
private int age;

    public Docente(String name, String surname, String code, int age) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getCode() {
        return code;
    }

    public int getAge() {
        return age;
    }
}
