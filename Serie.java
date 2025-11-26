
public class Serie extends Content{
	private int nbEpisodes;
	private int dureeEpisode;
	
	public Serie(String title, String genre, boolean isFree,int nbEpisodes,int dureeEpisode) {
		super(title,genre,isFree);
		this.nbEpisodes=nbEpisodes;
		this.dureeEpisode=dureeEpisode;
	}
	
	public void afficheDetails() {
		System.out.println("Titre:"+title+" /Free: "+isFree+" /Nombre d'épisode: "+nbEpisodes+" /Durée d'épisode: "+dureeEpisode);
	}
	
	public int getDuration(){
		return dureeEpisode;
	}
}
