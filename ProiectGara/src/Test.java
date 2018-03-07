import java.util.*;


public class Test {

	public static void main(String[] args) {
        Gara gara = new Gara("Sinaia",initializareTrenuri());
        Collections.sort(gara.getTrenuri(), Comparator.comparing(Tren::getOra));
        
     // Scanner scanner = new Scanner(System.in);
      //String Cod = scanner.nextLine();
        for(Tren tren : gara.getTrenuri()) {
        	if(/*Cod.equals(tren.getCodTren()) && */(tren.getMin()!= -1) && (tren.getOra()!= -1)) {
        		//System.out.println(Cod+"statie"+gara.getNumeGara());
        		System.out.println(tren.InfoTren());
        		}
        }
        Interface gui = new Interface(gara);
        gui.go();

	}

	public static List<Tren> initializareTrenuri() {
        List<Tren> trenuri = new ArrayList<>();
        trenuri.add(new Tren("2a2v", 22 , 25 ,"Brasov"));
        trenuri.add(new Tren("2a2v", 21 , 23 ,"Bucuresti"));
        trenuri.add(new Tren("2a2v", 20 , 20 ,"Cluj"));
        trenuri.add(new Tren("2a", 32 , 60 ,"Dej"));
        return trenuri;
    }
}
