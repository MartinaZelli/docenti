import java.util.ArrayList;
import java.util.List;

public class MetodiUnivesita {

	public static List<Docente> trovaListaGiovani(Universista universita){
		List<Docente> listaDocenti = universita.getListaDocenti();

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

	public static int etaMinima (Universista universita){
		List<Docente> listaGiovani =trovaListaGiovani(universita);
		return listaGiovani.getFirst().getAge();

	}

	public static List<String> trovaGiovani(Universista universita){
		List<Docente> listaGiovani = trovaListaGiovani(universita);
		List<String> cognomiGiovani = new ArrayList<>();
		for (int i = 0; i <listaGiovani.size(); i++) {
			cognomiGiovani.add(listaGiovani.get(i).getSurname());
		}
		return  cognomiGiovani;
	}
}
