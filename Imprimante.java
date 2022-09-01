package salleInfo;

import java.util.Date;

public final class Imprimante extends EquipInfo {
	//Attributs
		private String marque;
		private boolean couleur;
		private int memoireInterne; //en Mo
	
	//Constructeurs
		Imprimante (String idEquip, Date dateAchat, Date dateHS, String marque, boolean couleur, int memoireInterne){
				super(idEquip, dateAchat, dateHS);
				this.marque = marque;
				this.couleur = couleur;
				this.memoireInterne = memoireInterne;
		}
	
	//Accéder aux informations
		public String getMarque () { return marque; }
		public boolean getCouleur () { return couleur; }
		public int getMemoireInterne () { return memoireInterne; }
	
	//redéfinition de toString()
		public String toString() {
			return
			"\n---Informations sur l'imprimante " + getIdEquip() + "---\n" +
			"\nDate d'achat : " + getDateAchat() +
			"\nDate de fin de service : " + getDateHS() +
			"\nMarque : " + getMarque() +
			"\nImpression en couleur possible : " + getCouleur() +
			"\nMémoire : " + getMemoireInterne() + " GiB";
		}
}
