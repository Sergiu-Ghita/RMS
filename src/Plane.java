import java.util.UUID;

import java.util.ArrayList;


public class Plane {

	//private static final Plane Plane = null;
	
	//private int id;
	private UUID id;
	//Plane [] allPlanes;
	//private String Status;
	public enum Status{
		ONGROUND,
		ONAIR ,
		ONRUNWAY
	}

	private Status PlaneStatus;
	
	public Plane(Status status) {
		PlaneStatus=status;	
		UUID id  = UUID.randomUUID();
		this.setId(id);
		
		
	}
	public void setId(UUID newId) {
		this.id = newId;
	}
	public UUID getId() {
		return this.id;
	}
	public void setStatus(Status status) {
		this.PlaneStatus=status;
	}
	public Status getStatus() {
		return this.PlaneStatus;
	}
	public void land() {
		
	}
}