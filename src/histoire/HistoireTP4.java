package histoire;
import personnages.Traitre;
import personnages.Samourai;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.GrandMere;
public class HistoireTP4 {
	
 public static void main(String[] args) {
	  Humain prof = new Humain("Prof", "kombucha", 54);
      
      Yakuza yakuza = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
      Ronin roro = new Ronin("Roro", "shochu", 60);
      Commercant chonin = new Commercant("Chonin", 40);
      Commercant kumi = new Commercant("Kumi", 10);
      Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
      Traitre masako = new Traitre( "Miyamoto", "Masako", "saké", 100);
  	  Commercant marco = new Commercant("Marco", 100);
	GrandMere grandMere = new GrandMere("Grand-Mère", 10);
	
      prof.direBonjour();
      prof.acheter("une boisson", 12);
      prof.boire();
      prof.acheter("un jeu", 2);
      prof.acheter("kimono", 50);
      
  

      marco.direBonjour();
      marco.seFaireExtorquer();
      marco.recevoir(15);
      marco.boire();
      
   
      yakuza.direBonjour();
      yakuza.extorquer(marco);
      
      
    
      roro.direBonjour();
      roro.donner(marco);
      roro.provoquer(yakuza);
    

      marco.faireConnaissanceAvec(roro);
      marco.faireConnaissanceAvec(yakuza);
      marco.faireConnaissanceAvec(chonin);
      marco.faireConnaissanceAvec(kumi);
      marco.listerConnaissance();
      roro.listerConnaissance();
      yakuza.listerConnaissance();
 
      akimoto.faireConnaissanceAvec(marco);
      akimoto.listerConnaissance();
      akimoto.faireConnaissanceAvec(marco);
      akimoto.listerConnaissance();
      akimoto.boire("thé");
  

    	masako.direBonjour();
    	masako.extorquer(marco);
    	masako.extorquer(marco);
    	masako.extorquer(marco);
    	masako.extorquer(marco);

    	System.out.println("Niveau : " + masako.getNiveauTraitrise());
      
    	masako.faireConnaissanceAvec(marco);
    	masako.faireLeGentil();

    	System.out.println("Niveau : " + masako.getNiveauTraitrise());
    	

    	grandMere.faireConnaissanceAvec(akimoto);
    	grandMere.faireConnaissanceAvec(yaku);
    	grandMere.faireConnaissanceAvec(masako);
    	grandMere.faireConnaissanceAvec(kumi);
    	grandMere.faireConnaissanceAvec(marco);
    	grandMere.faireConnaissanceAvec(chonin);
    	grandMere.ragoter();
 }
}
