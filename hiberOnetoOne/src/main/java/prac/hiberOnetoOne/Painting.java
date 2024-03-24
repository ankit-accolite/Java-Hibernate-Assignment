package prac.hiberOnetoOne;

import jakarta.persistence.*;

@Entity
public class Painting {
	@Id
	@Column(name="Art_ID")
	private int ArtID;
	private int price;
	
	@OneToOne
	private Artist artist;
	
	public Painting() {
		super();
		
	}
	
	public Painting(int id ,int price,Artist art) {
		super();
		this.ArtID = id;
		this.price = price;
		this.artist=art;
	}
	
	public int getArtID() {
		return ArtID;
	}
	public void setArtID(int artID) {
		ArtID = artID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Painting [ArtID=" + ArtID + ", price=" + price + ", artist= "+artist.toString()+"]";
	}
	
	
}
