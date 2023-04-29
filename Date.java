/*Hireche Abdelghani*/
/*Classe Date*/
public class Date {
private int jour,mois,annee;
public Date(int jour, int mois, int annee)
{
	this.jour=jour;
	this.mois=mois;
	this.annee=annee;
}
/*Redifinition de toString() pour afficher un date sous le format jour mois année */
public String toString()
{
	if(this.mois==1) return this.jour+" Janvier "+this.annee;
	else if(this.mois==2) return this.jour+" Février "+this.annee;
	else if(this.mois==3) return this.jour+" Mars "+this.annee;
	else if(this.mois==4) return this.jour+" Avril "+this.annee;
	else if(this.mois==5) return this.jour+" Mai "+this.annee;
	else if(this.mois==6) return this.jour+" Juin "+this.annee;
	else if(this.mois==7) return this.jour+" Juillet "+this.annee;
	else if(this.mois==8) return this.jour+" Aout "+this.annee;
	else if(this.mois==9) return this.jour+" Septembre "+this.annee;
	else if(this.mois==10) return this.jour+" Octobre "+this.annee;
	else if(this.mois==11) return this.jour+" Novembre "+this.annee;
	else return this.jour+" Décembre"+this.annee;
	
}
}
