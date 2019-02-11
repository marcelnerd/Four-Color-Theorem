import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		GraphGUI yeet = new GraphGUI();
		frame.add(yeet);
		frame.setVisible(true);
		//TODO Allow user to enter the polygons to be used; This could be done using terminal or gui; Start with using test cases
		//TODO Feed polygons into algorithm and solve the map; This could be displayed in the gui as it is happening, or not
		//TODO Display final result in gui
	}

}
