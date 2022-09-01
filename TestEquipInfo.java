package salleInfo;
import java.util.*;

public class TestEquipInfo{

	public static void main(String [] a){
		Date dateAchat;
		Date dateHS;
		dateAchat = new Date(0); //crée une date au 1 janvier 1970 00:00:00.000
		dateHS = new Date(0);
		
		Imprimante equipInfoo = new Imprimante("idEquip", dateAchat, dateHS, "marque", true, 40);
		
		ArrayList<EquipInfo> arrayListEquipInfo = new ArrayList<EquipInfo>();

		arrayListEquipInfo.add(equipInfoo);
		
		for(EquipInfo current : arrayListEquipInfo){
	  		System.out.println(current);
	  		}
		}
}


