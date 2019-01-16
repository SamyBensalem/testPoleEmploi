package exercice;

public class PoleEmploi {

	public static void main(String[] args) {
//		System.out.println(javanais("bonjour"));
//		System.out.println("bavonjavour");
//		System.out.println(javanais("chante"));
//		System.out.println(("chavantave"));
//		System.out.println(javanais("moyen"));
//		System.out.println((("mavoyen")));
//		System.out.println(javanais("exemple"));
//		System.out.println(("avexavemplave"));
//		System.out.println(javanais("au"));
//		System.out.println(("avau"));

	}

	public static String javanais(String chaine) {
		if (chaine != null && chaine.length() != 0) {
			String reponse = "";

			//premiere occurence de voyelle
			int taille = chaine.trim().toLowerCase().length();
			for (int i = 0; i < taille; i++) {
				if ((chaine.charAt(i) == 'a' 
						|| chaine.charAt(i) == 'e' 
						|| chaine.charAt(i) == 'i'
						|| chaine.charAt(i) == 'o' 
						|| chaine.charAt(i) == 'u' 
						|| chaine.charAt(i) == 'y')

				) { //il faut de toutes facons rajouter av si il y a une premiere occurence
					reponse += "av"+chaine.charAt(i);
					if ((i < (taille - 1)) && (chaine.charAt(i + 1) == 'a' 
							|| chaine.charAt(i + 1) == 'e'
							|| chaine.charAt(i + 1) == 'i' 
							|| chaine.charAt(i + 1) == 'o' 
							|| chaine.charAt(i + 1) == 'u'
							|| chaine.charAt(i + 1) == 'y')) {
						//et compter le nombre de voyelle successives pour sauter l'ensemble au niveau de la valeur de i
						int j = i+1;
						while (j < taille && (chaine.charAt(j) == 'a' 
								|| chaine.charAt(j) == 'e'
								|| chaine.charAt(j) == 'i' 
								|| chaine.charAt(j) == 'o' 
								|| chaine.charAt(j) == 'u'
								|| chaine.charAt(j) == 'y')) {
							j++;

						}
						for (int k = i+1 ; k < j; k++) {
							reponse += chaine.charAt(k);
						}
						//on se repositionne a j-1 parce qu'on a a jouté la premiere occuence de voyelle au depart juste apres "av"
						i = j-1;
					}

				} else {
					//si pas de voyelle
					reponse += Character.toString(chaine.charAt(i));
				}
			}
			return reponse;
		} else{
			//si la chaine n'existe pas ou est vide
			System.out.println("Chaine invalide");
		}

		return null;

	}// javanais

}
