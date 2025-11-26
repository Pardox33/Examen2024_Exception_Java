
public class Movie extends Content{
	protected int duree;
	
	public Movie(String title, String genre, boolean isFree,int duree) {
		super(title,genre,isFree);
		this.duree=duree;
	}
	
	public void afficheDetails() {
		System.out.println("Titre:"+title+" /Free: "+isFree+" /Durée: "+duree);
	}
	
	public int getDuration(){
		return duree;
	}
	
}
