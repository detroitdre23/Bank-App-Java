public class ClientPhysique {
private int NPI,numeroTelephone;
private String nom,prenom;
Adresse adresse;
Date dateNaissance;
public Client(int numeroClient, int NPI, int numeroTelephone, String nom, String prenom, Adresse adresse, Date dateNaissance)
{
	super(numeroClient);
	this.NPI=NPI;
	this.numeroTelephone=numeroTelephone;
	this.nom=nom;
	this.prenom=prenom;
	this.adresse=adresse;
	this.dateNaissance=dateNaissance;
}
public int getNPI()
{
	return this.NPI;
}
public setNPI(int NPI)
{
	this.NPI=NPI;
}
public int getNumeroTelephone()
{
	return this.numeroTelephone;
}
public setNumeroTelephone(int numeroTelephone)
{
	this.numeroTelephone=numeroTelephone;
}
public String getNom()
{
	return this.nom;
}
public setNom(String nom)
{
	this.nom=nom;
}
public String getPrenom()
{
	return this.prenom;
}
public setPrenom(String prenom)
{
	this.prenom=prenom;
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
      return super.toString()+', Numéro de piéce d''identité : '+NPI+', Nom : '+this.nom+', Prénom : ',+this.prenom+' , Adresse : '+this.adresse+' , Date de Naissance : '+this.dateNaissance+', Numéro de telephone : '+numeroTelephone;
}
