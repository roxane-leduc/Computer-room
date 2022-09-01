package salleInfo;
import java.util.*;

public class TestUser {

	public static void main(String [] a){
		Eleve user1 = new Eleve("ZX80", "rleduc", "ttt");
		Eleve user2 = new Eleve("ZX81", "wleduc", "ttt");
		ArrayList<User> arrayListUser = new ArrayList<User>();

		arrayListUser.add(user1);
		arrayListUser.add(user2);
		
		for(User current : arrayListUser){
	  		System.out.println(current);
	  		
	  		Scanner myMdp = new Scanner(System.in);
	  		System.out.println("Quel est votre mdp?");
	  		String userMdp = myMdp.next();

	  		if (current.mdpValide(userMdp)){
	  			System.out.println("Bon mdp");
	  		}
		}
	}
	
}

