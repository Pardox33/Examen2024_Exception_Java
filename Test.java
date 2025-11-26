

public class Test {
	public static void main(String []args) {
		
		StreamingPlatform plateforme=new StreamingPlatform(10,20);
		Movie m1=new Movie("Inception", "Sci-Fi", false, 148);
		Serie s=new Serie("The Good Doctor", "Scientific", false, 25, 50);
		Movie m2=new Movie("A Beautiful Mind", "Real Life Story", true, 75);
		Serie s2=new Serie("Charlok Holms", "Detective", true, 236, 22);
		
		plateforme.addContent(m1);
		plateforme.addContent(s);
		plateforme.addContent(m2);
		plateforme.addContent(s2);
		
		for(int j=0;j<4;j++) {
			plateforme.cont[j].afficheDetails();
		
		}
		User u1=new User("Siwar",true);
		User u2=new User("Imen",false);
		plateforme.addUser(u2);
		plateforme.addUser(u1);

		try {
			plateforme.playContent(u2, s);
		}
		catch(AccessDeniedException e) {
			System.out.println("Erreur "+e.getMessage());
		}
		try {
			plateforme.playContent(u1, m1);
		}
		catch(AccessDeniedException e) {
			System.out.println("Erreur "+e.getMessage());
		}
		try {
			plateforme.findContent("xxxx");
		}
		catch(ContentNotFoundException e) {
			System.out.println("Erreur "+e.getMessage());
		}
		try {
			plateforme.findContent(s.title);
		}
		catch(ContentNotFoundException e) {
			System.out.println("Erreur "+e.getMessage());
		}
		

		}
	}