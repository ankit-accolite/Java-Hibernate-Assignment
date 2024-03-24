package prac.hiberOnetoOne;
import jakarta.persistence.*;

@Entity
public class Artist {
	@Id
	@Column(name="Artist_ID")
	private int Artist_ID;
	private String Artist_Name;
	public int getArtist_ID() {
		return Artist_ID;
	}
	public void setArtist_ID(int artist_ID) {
		Artist_ID = artist_ID;
	}
	public String getArtist_Name() {
		return Artist_Name;
	}
	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}
	public Artist(int artist_ID, String artist_Name) {
		super();
		Artist_ID = artist_ID;
		Artist_Name = artist_Name;
	}
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Artist [Artist_ID=" + Artist_ID + ", Artist_Name=" + Artist_Name + "]";
	}
	
	
}
