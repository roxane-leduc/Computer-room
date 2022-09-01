package salleInfo;

public final class Prof extends User {
	//Attributs
		private String NUMEN;

	//Methodes
	//Constructeurs
		Prof(String NUMEN, String login, String mdp) {
			//Initialise l’attribut NUMEN avec la valeur de l’argument NUMEN
			super(login,mdp);
			this.NUMEN = NUMEN;
		}
	
	//Accesseurs
		public String getNUMEN() {return NUMEN;}
		
	//Affichage
		@Override
		public String toString() {
			return this.NUMEN + " : " + this.login;
		}
}
