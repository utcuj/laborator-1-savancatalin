
public class Tren {

	public String codTren;
	public int ora;
	public int min;
	public String statie;
	
	public Tren(String cod, int ora,int min,String statie)
	{
		this.codTren=cod;
		
		if ( ora < 23 && ora > 0 )
		{
			this.ora = ora;
		}
		else
		{
			this.ora = -1;
		}
		
		if (min > 0 && min < 59)
		{
			this.min = min;
		}
		else
		{
			this.min = -1;
		}
		
		this.statie=statie;
		
	}

	public String getCodTren() {
		return codTren;
	}

	public void setCodTren(String codTren) {
		this.codTren = codTren;
	}

	public int getOra() {
		return ora;
	}

	public void setOra(int ora) {
		if ( ora < 23 && ora > 0 )
		{
		this.ora = ora;
		}
		else
		{
		this.ora = -1;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min > 0 && min < 59)
		{
		this.min = min;
		}
		else
		{
		this.min = -1;
		}
	
	}

	public String getStatie() {
		return statie;
	}

	public void setStatie(String statie) {
		this.statie = statie;
	}
    public String InfoTren() {
        return this.statie +  "  Ora plecare: " + this.ora + ":"+ this.min;
    }
    
	
}
