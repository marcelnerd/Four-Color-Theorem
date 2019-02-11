import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Vertex extends Point2D.Float {
	
	private double weight;
	
	private ArrayList<Vertex> inCons;
	private ArrayList<Vertex> outCons;
		
	public Vertex(int x, int y) {
		super(x, y);
		
	}
	
}
