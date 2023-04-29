public class ConnexionInternet {
private String debit,type;
private int tarif;
public Date(String debit, String type, int tarif)
{
	this.debit=debit;
	this.type=type;
	this.tarif=tarif;
}
public String getDebit()
{
	return this.debit;
}
public setDebit(String debit)
{
	this.debit=debit;
}
public String getType()
{
	return this.type;
}
public setType(String type)
{
	this.type=type;
}
public String getTarif()
{
	return this.tarif;
}
public setTarif(int tarif)
{
	this.tarif=tarif;
}
public String toString()
{
	return 'Débit : '+this.debit+', Type : '+this.type+', Tarif : '+this.tarif;
	
}
}
