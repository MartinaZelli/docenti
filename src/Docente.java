public class Docente {
private final String name;
private final String surname;
private final String code;
private final int age;

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

    public String getName() {
        return name;
    }
}
