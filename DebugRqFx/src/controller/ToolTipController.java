package controller;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import main.Main;
import model.Game;
import model.Location;
import model.Map;

public class ToolTipController implements EventHandler<MouseEvent> {

	private Tooltip tp;
	private Node  node; 
	
	public ToolTipController(){
		tp  = new Tooltip("");
	}
	
	
	@Override
	public void handle(MouseEvent t) {
		Rectangle mouseBounds = new Rectangle(t.getSceneX(), t.getSceneY(), 1, 1);
		
		
		
		if(Game.overWorld.getIsOn()){
			node =(Node)t.getSource();
			
			for(Location loc : Game.overWorld.getLocations()){//loops through arraylist of map locations
				if(mouseBounds.getBoundsInParent().intersects(loc.getBounds().getBoundsInParent())){
					System.out.println("Intersecting " + loc.getName());
					tp.show(node,Main.stage.getX()+t.getSceneX(), Main.stage.getY()+t.getSceneY());
					tp.setText(loc.getName());
				}
				else{
					tp.setText("");
					tp.hide();
				}
			}
			
			
			
		}
		else{
			tp.hide();
		}
       
	}

}
