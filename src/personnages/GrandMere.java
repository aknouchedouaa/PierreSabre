package personnages;
import java.util.Random;
public class GrandMere  extends Humain {

	public GrandMere(String nom,  int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser(Humain humain) {

	    if (nbConnaissance < 5) {

	        memoire[nbConnaissance] = humain;
	        nbConnaissance++;

	    } else {

	        parler("Oh ma tête ! Je ne peux plus retenir le nom "
	                + "d'une personne supplémentaire !");
	    }
	}
	private enum TypeHumain {
	    COMMERCANT,
	    RONIN,
	    SAMOURAI,
	    TRAITRE,
	    GRAND_MERE,
	    HABITANT
	}
	
	private String humainHasard() {

	    TypeHumain[] types = TypeHumain.values();

	    Random hasard = new Random();

	    int indice = hasard.nextInt(types.length);

	    return types[indice].toString().toLowerCase();
	}
	
	public void ragoter() {

	    for (int i = 0; i < nbConnaissance; i++) {

	        if (memoire[i] instanceof Traitre) {

	            parler("Je sais que " + memoire[i].getNom()
	                    + " est un traître. Petit chenapan !");

	        } else {

	            parler("Je crois que " + memoire[i].getNom()
	                    + " est " + humainHasard());
	        }
	    }
	}
}
