import java.awt.Image;

public class Yarn {
	private String brand = "";
	private int yardage = -1;
	private String addNotes = "";
	boolean favorite = false;
	boolean inUse = false;
	int lotNumber = -1;
	Image image;
	int weight;
	String color;
	String fiber;
	
	Yarn(){}
	Yarn(String c, String f, int w){
		color = c;
		fiber = f;
		weight = w;
	}
	
	public void setBrand(String b){brand = b;}
	public void setYardage(int y){yardage = y;}
	public void setAddNotes(String an){addNotes = an;}
	public void setFavorite(boolean f) {favorite = f;}
	public void setInUse(boolean iu){inUse = iu;}
	public void setLotNumber(int ln){lotNumber = ln;}
	public void setWeight(int w){weight = w;}
	public void setColor(String c){color = c;}
	public void setFiber(String f){fiber = f;}
	public void setImage(Image i){image = i;}
	
	public String getBrand(){return brand;}
	public int getYardage(){return yardage;}
	public String getAddNotes(){return addNotes;}
	public boolean getFavorite(){return favorite;}
	public boolean getInUse(){return inUse;}
	public int getLotNumber(){return lotNumber;}
	public Image getImage(){return image;}
	public int getWeight(){return weight;}
	public String getColor(){return color;}
	public String getFiber(){return fiber;}
}
