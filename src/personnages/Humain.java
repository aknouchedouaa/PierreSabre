package personnages;

public class Humain {
 protected String nom ; 
 protected String boissonFavorite ; 
 protected int argent ; 
 
protected Humain[] memoire = new Humain[30];
 protected int nbConnaissance = 0;
 
 public Humain(String nom, String boissonFavorite, int argent) {
	super();
	this.nom = nom;
	this.boissonFavorite = boissonFavorite;
	this.argent = argent;
}
 public int getArgent() {
	return argent;
}
 public String getNom() {
	return nom;
}
 public String getBoissonFavorite() {
	return boissonFavorite;
}

 protected void parler(String texte) {
	    System.out.println("(" + nom + ") - " + texte);
	}
 
 public void direBonjour() {
	    parler("Bonjour ! Je m’appelle " + nom
	            + " et j’aime boire du " + boissonFavorite + ".");
	}
 public void boire() {
	    parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

 protected void gagnerArgent(int gain) {
	    argent = argent + gain;
	}

	protected void perdreArgent(int perte) {
	    argent = argent - perte;
	}
	
	public void acheter(String bien, int prix) {

	    if (argent >= prix) {

	        parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir "
	                + bien + " à " + prix + " sous");

	        perdreArgent(prix);

	    } else {

	        parler("Je n'ai plus que " + argent
	                + " sous en poche. Je ne peux même pas m'offrir un "
	                + bien + " à " + prix + " sous.");

	    }
	}
	protected void memoriser(Humain humain) {

	    if (nbConnaissance == memoire.length) {

	        for (int i = 0; i < memoire.length - 1; i++) {
	            memoire[i] = memoire[i + 1];
	        }

	        nbConnaissance--;
	    }

	    memoire[nbConnaissance] = humain;
	    nbConnaissance++;
	}
	private void repondre(Humain humain) {

	    direBonjour();

	    memoriser(humain);
	}
	public void faireConnaissanceAvec(Humain autreHumain) {

	    direBonjour();

	    autreHumain.repondre(this);

	    memoriser(autreHumain);
	}
	
	public void listerConnaissance() {

	    String liste = "";

	    for (int i = 0; i < nbConnaissance; i++) {

	        if (i > 0) {
	            liste += ", ";
	        }

	        liste += memoire[i].getNom();
	    }

	    parler("Je connais beaucoup de monde dont : " + liste);
	}
	
	
}
 
 

