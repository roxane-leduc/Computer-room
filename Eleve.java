package salleInfo;

public final class Eleve extends User {
	//Attribut
		private String INE;

	//Methodes
	//Constructeurs
		Eleve(String INE,String login, String mdp) {
			super(login,mdp);
			this.INE = INE;
		}
	
	//accéder à l'INE
		public String getINE() {return INE;}

	//Affichage
		@Override
		public String toString() {
			return this.INE + " : " + this.login;
		}
}