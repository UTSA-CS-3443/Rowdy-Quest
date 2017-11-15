package controller;
import model.Location;
import model.OverWorld;

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
		Rectangle mouseBounds = new Rectangle(event.getSceneX()-2, event.getSceneY()-2, 4, 4);
		
		System.out.print(event.getSceneX() + ", " + event.getSceneY()+ ", ");
		
		for(Location loc : overWorld.getLocations()){
			if(mouseBounds.getBoundsInParent().intersects(loc.getBounds().getBoundsInParent()))
				System.out.println("You clicked " + loc.getName());
		}
	}

}
