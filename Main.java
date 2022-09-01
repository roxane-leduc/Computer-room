package salleInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//////////////DONNEES ENTREES DANS LE DUR/////////////////////
		
		//Elèves
		Eleve eleve1 = new Eleve("ZX80", "rleduc", "rrr");
		Eleve eleve2 = new Eleve("ZX81", "adeponthieux", "aaa");
		Eleve eleve3 = new Eleve("ZX82", "wleduc", "www");

		ArrayList<Eleve> arrayListEleve = new ArrayList<Eleve>();
		arrayListEleve.add(eleve1);
		arrayListEleve.add(eleve2);
		arrayListEleve.add(eleve3);

		
		//Profs
		Prof prof1 = new Prof("ZX80", "habdulrab", "hhh");
		Prof prof2 = new Prof("ZX81", "gduval", "ggg");
		
		ArrayList<Prof> arrayListProf = new ArrayList<Prof>();
		arrayListProf.add(prof1);
		arrayListProf.add(prof2);	
		
		
		Date dateAchat;
		Date dateHS;
		//ici, dateAchat et dateHS servent juste pour les tests
		dateAchat = new Date(0); //crée une date au 1 janvier 1970 00:00:00.000
		dateHS = new Date(0);
		
		//Imprimantes
		Imprimante Imp1 = new Imprimante("972701", dateAchat, dateHS, "EPSON", false, 40);
		Imprimante Imp2 = new Imprimante("972722", dateAchat, dateHS, "Canon", true, 60);

		//Projecteurs
		Projecteur projo1 = new Projecteur("882722", dateAchat, dateHS, "Epson", "XGA", false, true);
		Projecteur projo2 = new Projecteur("882468", dateAchat, dateHS, "Canon", "WXGZ", true, true);

		//Ordinateurs
		Ordi ordi1 = new Ordi("560722", dateAchat, dateHS, "Apple", 10 , 20 , "Windows");
		Ordi ordi2 = new Ordi("560692", dateAchat, dateHS, "DELL", 100, 40 , "Linux");
		
		//On met tous les équipements informatiques dans une liste
		ArrayList<EquipInfo> arrayListEquipInfo = new ArrayList<EquipInfo>();
		arrayListEquipInfo.add(Imp1);
		arrayListEquipInfo.add(Imp2);
		arrayListEquipInfo.add(projo1);
		arrayListEquipInfo.add(projo2);
		arrayListEquipInfo.add(ordi1);
		arrayListEquipInfo.add(ordi2);
		
		
		

////////////////////DEDUT DE L'AFFICHAGE/////////////////////////////////
		clearScreen();		
		System.out.println("\nBIENVENUE DANS LA SALLE INFORMATIQUE\n");
		boolean retourMenu=true;
		
		while (retourMenu==true) {
			
			System.out.println("MENU\n");
			System.out.println("1) Se connecter\n");
			System.out.println("2) Quitter\n");
			
			Scanner choixMenu = new Scanner(System.in);
			String sonChoixMenu = choixMenu.next();
			clearScreen();
	
		
			if (sonChoixMenu.equals("1")) {
	
				System.out.println("CONNEXION\n");
				System.out.println("\n1)Elève");
				System.out.println("\n2)Prof\n");
				
				@SuppressWarnings("resource")
				Scanner choixUtil = new Scanner(System.in);
				String sonChoixUtil = choixUtil.next();
				clearScreen();
				
			
		  		if (sonChoixUtil.equals("1")) {
		  			
		  			boolean connexion=true;
		  			
					while(connexion==true) {
						
		  				System.out.println("\t[Connexion Eleve]\n");

		  				System.out.println("Entrez login :");
		  				Scanner log = new Scanner(System.in);
		  				String sonLog = log.next();
		  				
		  				
		  				System.out.println("Entrez mdp :");
		  				Scanner mdp = new Scanner(System.in);
		  				String sonMdp = mdp.next();
		  				clearScreen();
		  				
		  				boolean logValide = false;
		  				boolean logTrouve = false;
		  				boolean mdpValide = false;
		  				for(Eleve current : arrayListEleve){
		  					logValide = false;
		  					if (current.login.equals(sonLog)) {logValide = true; logTrouve = true;}
		  					if (logValide==true) {
		  						if (current.mdp.equals(sonMdp)) {mdpValide = true; }
		  					}
		  				}
		  				
		  				if (logTrouve==false) {System.out.println("Login inconnu\n");}
		  				else if ((logTrouve==true) && (mdpValide==false)) {System.out.println("Mot de passe erroné\n");}
		  				else {
		  					System.out.println("Connexion réussie \n");
		  					System.out.println("Que voulez vous faire ? \n");
		  					System.out.println("1. Consulter la liste des équipements informatiques \n");
		  					System.out.println("2. Créer un nouveau profil utilisateur \n");
		  					
		  					@SuppressWarnings("resource")
							Scanner choixx = new Scanner(System.in);
		  					String sonChoixx = choixx.next();
		  					clearScreen();
		  					
		  					if(sonChoixx.equals("1")){ 
		  						for(EquipInfo current : arrayListEquipInfo){
		  							System.out.println(current);
		  							connexion=false;
		  						}
		  						
		  						System.out.println("\n[Tapez M pour retourner au menu]");
	  							String sonRetourM="pas un m ou M";
			  					while (!(sonRetourM.equals("m"))&&!(sonRetourM.equals("M"))){
			  						Scanner retourM = new Scanner(System.in);
				  					sonRetourM = retourM.next();
			  					}
			  					clearScreen();
		  						
		  					}
		  					
		  					else if(sonChoixx.equals("2")){
		  						System.out.println("Entrez votre INE : ");
		  						Scanner INEE = new Scanner(System.in);
		  	  					String sonINEE = INEE.next();
		  	  					
		  						System.out.println("Entre votre login :");
		  						Scanner ident = new Scanner(System.in);
		  	  					String sonIdent = ident.next();
		  	  					
		  	  					
		  	  					String sonNewMdp="";
		  	  					boolean validationMdp=false;
		  	  					
		  	  					while(validationMdp==false) {
			  						System.out.println("Entrez un mot de passe : ");
			  						Scanner newMdp = new Scanner(System.in);
			  	  					sonNewMdp = newMdp.next();
			  	  					
				  	  				System.out.println("Confirmez ce mot de passe : ");
			  						Scanner confirmMdp = new Scanner(System.in);
			  	  					String sonConfirmMdp = confirmMdp.next();
			  	  					
			  	  					if(sonNewMdp.contentEquals(sonConfirmMdp)) {validationMdp=true;}
			  	  					else { System.out.println("Confirmation de mot de passe râtée, réessayez.");}
		  	  					}
		  	  					
		  	  					Eleve newEleve = new Eleve(sonINEE, sonIdent, sonNewMdp);
		  	  					arrayListEleve.add(newEleve);
		  	  					
		  	  					System.out.println("\nVoici la liste des personnes qui se sont connectées sur ce poste :");
		  	  					for(Prof current : arrayListProf){ System.out.println(current);}
		  	  					for(Eleve current : arrayListEleve){ System.out.println(current);}
		  	  					connexion=false;
		  	  				
			  	  				System.out.println("[Tapez M pour retourner au menu]");
				  	  			String sonRetourM2="a";
			  					while (!(sonRetourM2.equals("m"))&&!(sonRetourM2.equals("M"))){
			  						Scanner retourM2 = new Scanner(System.in);
			  						sonRetourM2 = retourM2.next();
			  					}
			  					clearScreen();

		  					}
		  					
		  				}
		  				
		  			//connexion d'un utilisateur élève ratée (login ou mdp incorrect)
						if((logTrouve==false) || (mdpValide==false)) {
							System.out.println("1)Réessayer\n");
							System.out.println("2)Retour Menu\n");
							System.out.println("3)Quitter\n");								
							Scanner suite = new Scanner(System.in);
	  	  					int saSuite = suite.nextInt();
	  	  					clearScreen();
	  	  					
							switch(saSuite){
							   
						       case 1: 
						           System.out.println("Vous pouvez réessayer\n");
						           break;
						   
						       case 2:
						    	   connexion=false;
						           break;
						   
						       case 3:
						    	   System.exit(-1);
						           break;
						           
						       default:
						           System.out.println("Erreur de saisie");
						           break;
						     }
						   
						}
		  			}
		  		}
		  		else if (sonChoixUtil.equals("2")) {
		  			
			  			boolean connexion=true;
			  			
						while(connexion==true) {
			  				System.out.println("\t[Connexion Prof]\n");

				  			System.out.println("Entrez login :");
							Scanner log = new Scanner(System.in);
							String sonLog = log.next();
							
							System.out.println("Entrez mdp :");
							Scanner mdp = new Scanner(System.in);
							String sonMdp = mdp.next();
							
							clearScreen();
							
							
							boolean logValide2 = false;
							boolean logTrouve2 = false;
							boolean mdpValide2 = false;
						
							for(Prof current : arrayListProf){
								logValide2 = false;
								if (current.login.equals(sonLog)) {logValide2 = true; logTrouve2 = true;}
								if (logValide2==true) {
									if (current.mdp.equals(sonMdp)) {mdpValide2 = true; }
								}
							}
					
						
							if (logTrouve2==false) {System.out.println("Login inconnu\n");}
							else if ((logTrouve2==true) && (mdpValide2==false)) {System.out.println("Mot de passe erroné\n");}
							else {
								System.out.println("Connexion réussie \n");
								System.out.println("Que voulez vous faire ? \n");
								System.out.println("1. Enregistrer un nouvel équipement informatique \n");
								System.out.println("2. Créer un nouveau profil utilisateur \n");
								
								
								@SuppressWarnings("resource")
								Scanner choixx = new Scanner(System.in);
			  					String sonChoixx = choixx.next();
			  					
			  					clearScreen();
			  				
			  					if(sonChoixx.equals("1")){ 
			  						System.out.println("Voulez vous ajouter :\nUne imprimante (1)\nUn projecteur (2)\nUn ordinateur (3)\n");
			  						@SuppressWarnings("resource")
			  						Scanner choixEquip = new Scanner(System.in);
			  	  					String sonChoixEquip = choixEquip.next();
			  	  					clearScreen();
			  	  					
				  					Date dateAchat2=new Date();
				  					Date dateHS2=new Date();
			  	  					if(sonChoixEquip.equals("1")) {
				  	  					System.out.println("Entrez l'identifiant de la machine : ");
				  						Scanner idd = new Scanner(System.in);
				  	  					String sonidd = idd.next();
				  	  					
					  	  				System.out.println("Entrez la marque de la machine : ");
				  						Scanner marqueI = new Scanner(System.in);
				  	  					String saMarqueI = marqueI.next();
				  	  					
					  	  				System.out.println("L'impression se fait-elle en couleur (true ou false) ? ");
				  						Scanner coul = new Scanner(System.in);
				  	  					boolean saCoul = coul.nextBoolean();
				  	  					
				  	  					System.out.println("Quelle est sa mémoire interne (en Mo)? ");
										Scanner Mem = new Scanner(System.in);
					  					int saMem = Mem.nextInt();
					  					
					  					Imprimante imprim = new Imprimante(sonidd, dateAchat2, dateHS2, saMarqueI, saCoul, saMem);
					  					arrayListEquipInfo.add(imprim);
				  	  					
					  					clearScreen();
					  					System.out.println("---Nouvelle liste des équipements informatiques---");
				  	  					for(EquipInfo current : arrayListEquipInfo) {System.out.println(current);}
				  	  						
				  	  				}
		
		
			  	  					else if(sonChoixEquip.equals("2")) {
				  	  					System.out.println("Entrez l'identifiant de la machine : ");
				  						Scanner idd = new Scanner(System.in);
				  	  					String sonidd = idd.next();
				  	  					
					  	  				System.out.println("Entrez la marque de la machine : ");
				  						Scanner marqueP = new Scanner(System.in);
				  	  					String saMarqueP = marqueP.next();
				  	  					
					  	  				System.out.println("Entrez le type de résolution de la machine (XGA, WXGZ ...) : ");
				  						Scanner reso = new Scanner(System.in);
				  	  					String saReso = reso.next();
				  	  					
				  	  					System.out.println("Haut parleur intégré (true ou false) ? ");
										Scanner HP = new Scanner(System.in);
					  					boolean sonHP = HP.nextBoolean();
					  					
					  					System.out.println("Option WiFi intégrée (true ou false) ? ");
										Scanner wiFi = new Scanner(System.in);
					  					boolean saWiFi = wiFi.nextBoolean();
					  					
					  					Projecteur projo = new Projecteur(sonidd, dateAchat2, dateHS2, saMarqueP, saReso, sonHP, saWiFi);
					  					arrayListEquipInfo.add(projo);
				  	  					
					  					clearScreen();
					  					System.out.println("---Nouvelle liste des équipements informatiques---");
				  	  					for(EquipInfo current : arrayListEquipInfo) {System.out.println(current);}
				  	  					
				  	  				}
		
				  	  				else if(sonChoixEquip.equals("3")) {
				  	  					System.out.println("Entrez l'identifiant de la machine : ");
				  						Scanner idd = new Scanner(System.in);
				  	  					String sonidd = idd.next();
				  	  					
					  	  				System.out.println("Entrez la marque de la machine : ");
				  						Scanner marqueO = new Scanner(System.in);
				  	  					String saMarqueO = marqueO.next();
				  	  					
					  	  				System.out.println("Entrez mémoire interne de la machine(en Mo) : ");
										Scanner Mem = new Scanner(System.in);
					  					float saMem = Mem.nextFloat();
				  	  					
				  	  					System.out.println("Entrez la capacité du disque (en GB) : ");
										Scanner capa = new Scanner(System.in);
					  					float saCapa = capa.nextFloat();
					  					
					  					System.out.println("Entrez le système d'exploitation de la machine : ");
										Scanner syst = new Scanner(System.in);
					  					String sonSyst = syst.next();
					  					
					  					Ordi newOrdi = new Ordi(sonidd, dateAchat2, dateHS2, saMarqueO, saMem, saCapa, sonSyst);
					  					arrayListEquipInfo.add(newOrdi);
				  	  					
					  					clearScreen();
				  	  					System.out.println("---Nouvelle liste des équipements informatiques---");
				  	  					for(EquipInfo current : arrayListEquipInfo) {System.out.println(current);}
				  	  				}
			  	  					
				  	  				connexion=false;
				  	  				
				  	  				System.out.println("[Tapez M pour retourner au menu]");
					  	  			String sonRetourM3="a";
				  					while (!(sonRetourM3.equals("m"))&&!(sonRetourM3.equals("M"))){
				  						Scanner retourM2 = new Scanner(System.in);
				  						sonRetourM3 = retourM2.next();
				  					}
				  					clearScreen();
			  	  					
			  					}
			  					else if(sonChoixx.equals("2")){
			  						
			  						System.out.println("Entrez votre NUMEN : ");
			  						Scanner NUMEN = new Scanner(System.in);
			  	  					String sonNUMEN = NUMEN.next();
			  	  					
			  						System.out.println("Entre votre login :");
			  						Scanner ident = new Scanner(System.in);
			  	  					String sonIdent = ident.next();
			  	  					
				  	  				String sonNewMdp="";
			  	  					boolean validationMdp=false;
			  	  					
			  	  					while(validationMdp==false) {
				  						System.out.println("Entrez un mot de passe : ");
				  						Scanner newMdp = new Scanner(System.in);
				  	  					sonNewMdp = newMdp.next();
				  	  					
					  	  				System.out.println("Confirmez ce mot de passe : ");
				  						Scanner confirmMdp = new Scanner(System.in);
				  	  					String sonConfirmMdp = confirmMdp.next();
				  	  					
				  	  					if(sonNewMdp.contentEquals(sonConfirmMdp)) {validationMdp=true;}
				  	  					else { System.out.println("Confirmation de mot de passe râtée, réessayez.");}
			  	  					}
			  	  					
			  	  					Prof newprof = new Prof(sonNUMEN, sonIdent, sonNewMdp);
			  	  					arrayListProf.add(newprof);
			  	  					
			  	  					System.out.println("\nVoici la liste des personnes qui se sont connectées sur ce poste :\n");
			  	  					for(Eleve current : arrayListEleve){ System.out.println(current);}
			  	  					for(Prof current : arrayListProf){ System.out.println(current);}
				  	  				connexion=false;
				  	  				
				  	  				System.out.println("[Tapez M pour retourner au menu]");
					  	  			String sonRetourM2="a";
				  					while (!(sonRetourM2.equals("m"))&&!(sonRetourM2.equals("M"))){
				  						Scanner retourM2 = new Scanner(System.in);
				  						sonRetourM2 = retourM2.next();
				  					}
				  					clearScreen();
			  	  					
			  					}
							}
							
							//connexion d'un utilisateur prof ratée (login ou mdp incorrect
							if((logTrouve2==false) || (mdpValide2==false)) {
								System.out.println("1) Réessayer\n");
								System.out.println("2) Retour Menu\n");
								System.out.println("3) Quitter\n");								
								Scanner suite = new Scanner(System.in);
		  	  					int saSuite = suite.nextInt();
		  	  					
		  	  					clearScreen();
		  	  					
								switch(saSuite){
								   
							       case 1: 
							           System.out.println("Vous pouvez réessayer\n");
							           break;
							   
							       case 2:
							    	   connexion=false;
							           break;
							   
							       case 3:
							    	   System.exit(-1);
							           break;
							           
							       default:
							           System.out.println("Erreur de saisie");
							           break;
							     }
							   
							}
						}	
		  		}
	  		
			}
			
			else if(sonChoixMenu.equals("2")){System.exit(-1);}
		}
		
		
	}
	
	//Pour clear screen
	public static void clearScreen(){
			System.out.print("\033[H\033[2J");
			System.out.flush();
	}
	
}
