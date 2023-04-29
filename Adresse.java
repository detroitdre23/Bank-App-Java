public class Adresse {
private int numerodeRue,codePostal;
private String nomdeRue,ville;
public Adresse(int numerodeRue, String nomdeRue, int codePostal, String ville)
{
	this.numerodeRue=numerodeRue;
	this.nomdeRue=nomdeRue;
	this.codePostal=codePostal;
	this.ville=ville;
}
public String toString()
{
	return this.numerodeRue+', '+this.nomdeRue+', '+this.codePostal+', '+this.ville;
	
}
}
