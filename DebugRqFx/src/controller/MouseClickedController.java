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
		Rectangle mouseBounds = new Rectangle(event.getSceneX()-5, event.getSceneY()-5, 10, 10);
		
		System.out.println(event.getSceneX() + " " + event.getSceneY());
		
		for(Location loc : overWorld.getLocations()){
			if(mouseBounds.getBoundsInParent().intersects(loc.getBounds().getBoundsInParent()))
				System.out.println("Success");
		}
	}

}
