import java.awt.Image;

public class Needles {
	private String addNotes = "";
	private boolean circular = false;
	private boolean doublePointed = false;
	private boolean straight = false;
	private boolean favorite = false;
	private boolean inUse = false;
	private boolean alreadyOwn;
	Image image;
	int length = -1;
	int size;
	String brand = "";
	String material = "";
	
	//constructors for Needles
	Needles(){;}
	Needles(int s, int l){
		size = s;
		length = l;
	}
	Needles(int s, int l, boolean ao){
		size = s;
		length = l;
		alreadyOwn = ao;
	}
	Needles(int s, boolean ao){
		size = s;
		alreadyOwn = ao;
	}
	
	
	//set methods for all variables
	public void setAddNotes(String ad){addNotes = ad;}
	public void setCircular(boolean c){circular = c;}
	public void setDoublePointed(boolean dpn){doublePointed = dpn;}
	public void setStraight(boolean s){straight = s;}
	public void setFavorite(boolean f){favorite = f;}
	public void setInUse(boolean iu){inUse = iu;}
	public void setImage(Image i){image = i;}
	public void setLength(int l){length = l;}
	public void setSize(int s){size = s;}
	public void setBrand(String b){brand = b;}
	public void setMaterial(String m){material =m;}
	
	//get methods for all variables
	public String getNotes(){return addNotes;}
	public boolean getCircular(){return circular;}
	public boolean getDoublePointed(){return doublePointed;}
	public boolean getStraight(){return straight;}
	public boolean getFavorite(){return favorite;}
	public boolean getInUse(){return inUse;}
	public Image getImage(){return image;}
	public int getLength(){return length;}
	public int getSize(){return size;}
	public String getBrand(){return brand;}
	public String getMaterial(){return material;}
}
