package personnages;
import java.util.Random;
public class Traitre extends Samourai {
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}
	public int getNiveauTraitrise() {
	    return niveauTraitrise;
	}
	
	@Override
	public void direBonjour() {
	    super.direBonjour();
	    parler("Mon niveau de traîtrise est de "
	            + niveauTraitrise + ".");
	}
	public void extorquer(Commercant victime) {

	    if (niveauTraitrise < 3) {

	        int sommeVolee = victime.getArgent() * 2 / 10;

	        victime.perdreArgent(sommeVolee);
	        gagnerArgent(sommeVolee);

	        niveauTraitrise++;

	        parler("J'ai extorqué " + victime.getNom()
	                + " et je lui ai pris " + sommeVolee + " pièces.");

	    } else {

	        parler("Je suis trop traître, je ne peux plus extorquer !");
	    }
	}
	public void faireLeGentil() {

	    if (nbConnaissance > 0) {

	        Random hasard = new Random();

	        int indice = hasard.nextInt(nbConnaissance);

	        Humain ami = memoire[indice];

	        int don = getArgent() / 20;

	        perdreArgent(don);
	        ami.gagnerArgent(don);

	        parler("Je donne " + don + " pièces à "
	                + ami.getNom() + ". Nous sommes ami-ami !");

	        if (niveauTraitrise > 0) {
	            niveauTraitrise--;
	        }

	    } else {

	        parler("Je ne connais personne, je ne peux pas faire le gentil !");
	    }
	}
	
}
