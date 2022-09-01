package salleInfo;

public abstract class User {
	//Attributs
		String login;
		String mdp;
		
	//Méthodes
	//Constructeurs
		User(String login, String mdp) {
			this.login = login;
			this.mdp = mdp;
		}
		
	//Accesseurs
		public String getLogin() {return login;}
		public String getMdp() {return mdp;}

	//Connexion : Vérification mot de passe
		public boolean mdpValide(String m){
			String bonMdp=getMdp();
			return (m.equals(bonMdp));
		}
}
