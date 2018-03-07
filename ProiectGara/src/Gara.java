import java.util.*;

public class Gara implements Comparator<Tren> {
	public String numeGara;
	public List<Tren> trenuri;
	
	public Gara(String nume ,List<Tren> Trenuri)
	{
		this.numeGara=nume;
		this.trenuri=Trenuri;
	}
	public String getNumeGara() {
		return numeGara;
	}
	public void setNumeGara(String numeGara) {
		this.numeGara = numeGara;
	}
	public List<Tren> getTrenuri() {
		return trenuri;
	}
	public void setTrenuri(List<Tren> trenuri) {
		this.trenuri = trenuri;
	}
	public int compare(Tren t1, Tren t2)
	{
	        int ora1 = t1.getOra();
	        int ora2 = t2.getOra();
	        int min1 = t1.getMin();
	        int min2 = t2.getMin();

	        if (ora1 == ora2 ) {
	            if (min1 == min2) {
	                return 0;
	            } else if (min1 > min2) {
	                return 1;
	            } else {
	                return -1;
	            }
	        } else if (ora1 > ora2) {
	            return 1;
	        }
	        return -1;
  }

		
}
