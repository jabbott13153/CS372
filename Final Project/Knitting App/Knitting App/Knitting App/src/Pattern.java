import java.awt.Image;


public class Pattern {
	private boolean inProgress= false;
	double gauge = -1;
	Image image;
	String endProduct = "";
	Needles needles;
	Yarn yarn;
	
	//set methods for all variables
	public void setInProgress(boolean ip){inProgress =ip;}
	public void setGauge(double g){gauge = g;}
	public void setImage(Image i){image = i;}
	public void setEndProduct(String ep){endProduct =ep;}
	public void setNeedles(Needles n){needles = n;}
	public void setYarn(Yarn y){yarn = y;}
	
	//get methods for all variables
	public boolean getInProgress(){return inProgress;}
	public double getGauge(){return gauge;}
	public Image getImage(){return image;}
	public String getEndProduct(){return endProduct;}
	public Needles getNeedles(){return needles;}
	public Yarn getYarn(){return yarn;}
	
}
