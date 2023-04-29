public class ClientPhysique {
private String raisonSociale;
private int NRC,numeroTelephone;
Adresse adresse;
public Client(int numeroClient, int NRC, String raisonSociale, int numeroTelephone,Adresse adresse)
{
	super(numeroClient);
	this.NRC=NRC;
	this.numeroTelephone=numeroTelephone;
	this.adresse=adresse;
	this.dateNaissance=dateNaissance;
	this.raisonSociale=raisonSociale;
}
public int getNRC()
{
	return this.NRC;
}
public setNRC(int NRC)
{
	this.NRC=NRC;
}
public int getNumeroTelephone()
{
	return this.numeroTelephone;
}
public setNumeroTelephone(int numeroTelephone)
{
	this.numeroTelephone=numeroTelephone;
}
public String getRaisonSociale()
{
	return this.raisonSociale;
}
public setRaisonSociale(String raisonSociale)
{
	this.raisonSociale=raisonSociale;
}
public String getAdresse()
{
	return this.adresse;
}
public setAdresse(Adresse adresse)
{
	this.adresse=adresse;
}
public Date getDateNaissance()
{
	return this.dateNaissance;
}
public setDateNaissance(Date dateNaissance)
{
	this.dateNaissance=dateNaissance;
}
public String toString()
{
      return super.toString()+', Numéro de registre de commerce : '+NRC+', Raison Sociale : '+this.raisonSociale+' , Adresse : '+this.adresse+', Numéro de telephone : '+numeroTelephone;
}
