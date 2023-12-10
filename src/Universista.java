import java.util.ArrayList;
import java.util.List;

public class Universista {

    private final List<Docente> listaDocenti;

    public Universista(List<Docente> listaDocenti) {
        this.listaDocenti = listaDocenti;
    }

    public int etaMinima (){
        List<Docente> listaGiovani =trovaListaGiovani();
        return listaGiovani.getFirst().getAge();

    }

    public List<String> trovaGiovani(){
        List<Docente> listaGiovani = trovaListaGiovani();
        List<String> cognomiGiovani = new ArrayList<>();
        for (int i = 0; i <listaGiovani.size(); i++) {
            cognomiGiovani.add(listaGiovani.get(i).getSurname());
        }
        return  cognomiGiovani;
    }


    private List<Docente> trovaListaGiovani (){
        List<Docente> listaGiovani = new ArrayList<>();
        for (int i = 0; i < listaDocenti.size(); i++) {
            if (listaGiovani.isEmpty()){
                listaGiovani.add(listaDocenti.get(i));
                continue;
            }
            if (listaGiovani.getFirst().getAge()<listaDocenti.get(i).getAge()){
                continue;
            }
            if (listaGiovani.getFirst().getAge()==listaDocenti.get(i).getAge()){
                listaGiovani.add(listaDocenti.get(i));
                continue;
            }
            if (listaGiovani.getFirst().getAge()>listaDocenti.get(i).getAge()){
                listaGiovani = new ArrayList<>();
                listaGiovani.add(listaDocenti.get(i));
            }
        }
        return listaGiovani;
    }


}
