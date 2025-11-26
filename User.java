
public class User {
	private String nom;
	private boolean isSub;
	public Content[] watchedContent;
	private int nbWatched;
	private final int MAX_WATCHED=100;
	
	public User(String nom, boolean isSub) {
		this.nom=nom;
		this.isSub=isSub;
		watchedContent=new Content[MAX_WATCHED];
	}
	public boolean canPlay(Content content) {
		if(isSub==true ||isSub==false && content.isFree==true ) {
			return true;
		}
		else {
			return false;
		}
	}
	public void addWatchedContent(Content content) {
		if(nbWatched<MAX_WATCHED) {
			watchedContent[nbWatched++]=content;
		}
		else {
			System.out.println("tableau Plein");
		}
	}
	public String[] getWatchedGenres() {
		String[]genres=new String[nbWatched];
		int k=0;
		for(int i=0;i<nbWatched;i++) {
			boolean existe=false;
			
			for(int j=0;j<k;j++) {
				if(genres[j].equals(watchedContent[i].genre)){
					existe=true;break;
				}
			}
			if(existe==false) {
			genres[k]=watchedContent[i].genre;
			k++;}}
		 
	
	    return genres;
	}
	
}