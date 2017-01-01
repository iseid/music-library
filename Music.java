
public class Music {
	private String songTitle;
	private String albumName;
	private String artistName;
	private int releaseYear;

	//creates a music object with attributes a typical track would contain
	public Music(String title, String album, String artist, int year) {
		songTitle = title;
		albumName = album;
		artistName = artist;
		releaseYear = year;
	}

	public String getTitle() { 
		return songTitle;
	}
	public String getAlbum() { 
		return albumName;
	}
	public String getArtist() {
		return artistName;
	}
	public int getYear() { 
		return releaseYear;
	}
	
	public String toString() {
		String s1 = songTitle + ", " + albumName + ", " + artistName + ", " + releaseYear;
		
		return s1;
	}
	 public double getPrice() {
		 double d1 = 0;
		 if(releaseYear < 1970 ) {
			 d1 = .59;
		 }else if(releaseYear >= 1970 && releaseYear < 1980) {
			 d1 = .69;
		 }else if(releaseYear >= 1980 && releaseYear < 1990) {
			 d1 = 0.79;
		 }else if(releaseYear >= 1990 && releaseYear < 2000) {
			 d1 = 0.89;
		 }else if(releaseYear >= 2000 && releaseYear < 2010) {
			 d1 = .99;
		 }else {
			 d1 = 1.29;
		 }
		 
			 return d1;
	 }
}
