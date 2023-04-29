public class ContratAbonnement implements Abonnement{
ConnexionInternet connexion;
Date datedeb,datefin;
boolean active;
Client client;
String type;
public ContratAbonnement(ConnexionInternet connexion, Date datedeb, Date datefin)
{
	this.connexion=connexion;
	this.datedeb=datedeb;
	this.datefin=datefin;
	LocalDate date = LocalDate.now();
	if(datefin<=date){
		this.setActive(true);
	}
    else {
		this.setActive(false);
	}
	if (client instanceof ClientPhysique){
		this.setType('résiduel');
	}
	else {
		this.setType('professionel');
	}
}
public String getConnexion()
{
	return this.connexion;
}
public setConnexion(ConnexionInternet connexion)
{
	this.connexion=connexion;
}
public Date getDateDeb()
{
	return this.datedeb;
}
public setDateDeb(Date datedeb)
{
	this.datedeb=datedeb;
}
public Date getDateFin()
{
	return this.datefin;
}
public setDateFin(Date datefin)
{
	this.datefin=datefin;
}
public setActive(Bolean active)
{
	this.active=active;
}
public setType(String type)
{
	this.type=type;
}
public String toString()
{
	if(this.active==true){
    return 'Contrat , Connexion Internet : '+this.connexion.toString()+', Date de début : '+this.datedeb+', Date de fin : '+this.datefin+', Type : '+this.type+', Client : '+this.client.toString()+', Fonctionnel';
	}
	else{
    return 'Contrat , Connexion Internet : '+this.connexion.toString()+', Date de début : '+this.datedeb+', Date de fin : '+this.datefin+', Type : '+this.type+', Client : '+this.client.toString()+', Résilié';
	}
}
public void inscription()
{
}
public void résiliation()
{
	
}
public void  renouvellement()
{
}
}
