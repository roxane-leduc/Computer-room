package salleInfo;

import java.util.Date;

public abstract class EquipInfo {
	private String idEquip;
	private Date dateAchat;
	private Date dateHS;
	
	//Constructeurs
		EquipInfo () {
			idEquip = "";
			dateAchat = new Date(0); //crée une date au 1 janvier 1970 00:00:00.000
			dateHS = new Date(0);
			}
		
		EquipInfo(String id, Date date1, Date date2){
			idEquip = id;
			dateAchat = date1;
			dateHS = date2;
			}
	
	//getters
		public String getIdEquip(){return idEquip;}
		public Date getDateAchat(){return dateAchat;}
		public Date getDateHS(){return dateHS;}
	
	//Modifier l'id
		public void setIdEquip(String NouveauId){idEquip = NouveauId;}
	
	//Redéfintion de toString()
		public String toString() {
			return "\n---Voici les informations sur cet équipement informatique---\n" +
					"\nidentifiant de l'équipement : " + getIdEquip() +
					"\nDate d'achat : " + getDateAchat() +
					"\nDate de fin de service : " + getDateHS();
			}			
}
