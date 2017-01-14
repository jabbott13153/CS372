import java.awt.Color;

public class ShapesBase {

	private Color shape_color;
	private int shape_id;
	private String shape_type;
	
	//get and set for shape_color, shape_id, and shape_type
			public void set_color(Color c){shape_color = c;}
			public Color get_color(){return shape_color;}
			public void set_ID(int i){shape_id = i;}
			public int get_ID(){return shape_id;}
			public void set_type(String t){shape_type = t;}
			public String get_type(){return shape_type;}
			
	ShapesBase(){
		shape_color = Color.black;
		shape_id = 404;
		shape_type = "Does not Exist\n";
	}
	ShapesBase(Color c, int id){
		shape_color = c;
		shape_id = id;
	}
	
	ShapesBase(Color c, int id, String t){
		shape_color = c;
		shape_id = id;
		shape_type = t;
	}
}
