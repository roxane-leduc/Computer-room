package salleInfo;

import java.util.Date;

public final class Projecteur extends EquipInfo {
	//Attributs
		private String marque;
		private String resolution; //XGA, WXGZ, ...
		private boolean hautParleur;
		private boolean wiFi;
		
	//Constructeurs
		Projecteur(String idEquip, Date dateAchat, Date dateHS, String marque, String resolution, boolean hautParleur, boolean wiFi){
			super(idEquip,dateAchat,dateHS);
			this.marque = marque;
			this.resolution = resolution;
			this.hautParleur = hautParleur;
			this.wiFi = wiFi;
			}
			
	//accéder aux informations
		public String getMarque () { return marque; }
		public String getRes () { return resolution; }
		public boolean getHP () { return hautParleur; }
		public boolean getWiFi () { return wiFi; }
	
	//Redéfinition de toString
		public String toString() {
			return
			"\n---Informations sur le projecteur " + getIdEquip() + "---\n" +
			"\nDate d'achat : " + getDateAchat() +
			"\nDate de fin de service : " + getDateHS() +
			"\nMarque : " + getMarque() +
			"\nResolution : " + getRes() +
			"\nHaut parleurs disponibles : " + getHP() +
			"\nWifi disponible : " + getWiFi();	
		}
}
