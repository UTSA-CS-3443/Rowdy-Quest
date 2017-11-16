package controller;
import model.Game;
import model.Location;
import model.OverWorld;
import model.Map;
import controller.events.LocalEvents;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;



public class MouseClickedController implements EventHandler<MouseEvent> {

	private OverWorld overWorld;
	
	public MouseClickedController(OverWorld overWorld){
		this.overWorld = overWorld;
	}
	
	
	@Override
	public void handle(MouseEvent event) {
		Rectangle mouseBounds = new Rectangle(event.getSceneX(), event.getSceneY(), 1, 1);//creates rectangle where mouse is clicked
		
		//System.out.print(event.getSceneX() + ", " + event.getSceneY() + ", ");
		if(overWorld.getIsOn()){//if the map is pulled up
			for(Location loc : overWorld.getLocations()){//loops through arraylist of map locations
				if(mouseBounds.getBoundsInParent().intersects(loc.getBounds().getBoundsInParent())){//checks if the mouse click intersects with the location's bounds
					System.out.println("Going to " + loc.getName());
					Map m = Game.map;
					m.loadMap(loc.getPath());
					LocalEvents.closeMap();
					break;
				}
			}
		}
	}
}
