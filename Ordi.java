package salleInfo;

import java.util.Date;

public final class Ordi extends EquipInfo {
	//Attributs
		private String marque;
		private float memoire; //en GiB
		private float capaciteDisque; //en GB
		private String systExploit;
		
	//Constructeur
		Ordi(String idEquip, Date dateAchat, Date dateHS, String marque, float memoire, float capaciteDisque, String systExploit){
			super(idEquip, dateAchat, dateHS);
			this.marque = marque;
			this.memoire = memoire;
			this.capaciteDisque = capaciteDisque;
			this.systExploit = systExploit;
		}
	
	//accéder aux informations
		public String getMarque () { return marque; }
		public float getMemoire () { return memoire; }
		public float getCapaciteDisque () { return capaciteDisque; }
		public String getSystExploit () { return systExploit; }
		
	//Afficher les caractéristiques d'un ordi
		public void afficherCaraOrdi() {
			System.out.println( "Marque : " + getMarque() );
			System.out.println( "Mémoire : " + getMemoire() + " GiB" );
			System.out.println( "Mémoire : " + getCapaciteDisque() + " GiB" );
			System.out.println( "Système d'exploitation : " + getSystExploit() );
		}
	
	//Redéfiniton de toString()
		public String toString() {
			return
			"\n---Informations sur l'ordinateur " + getIdEquip() + "---\n" +
			"\nDate d'achat : " + getDateAchat() +
			"\nDate de fin de service : " + getDateHS() +
			"\nMarque : " + getMarque() +
			"\nMémoire : " + getMemoire() + " GiB" +
			"\nCapacité du disque : " + getCapaciteDisque() + " GB" +
			"\nSystème d'exploitation : " + getSystExploit();	
		}
			
}

