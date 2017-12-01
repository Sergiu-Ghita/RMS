import java.util.List;

public interface RunwayInterface {
	/**
	 Description: This method clears the Runway from planes

	 Pre-condition:Runway is filled with planes

	 Post-condition:There is no more planes on the runway

	 Test-cases: testclearRunway - checks if there are planes in the runway
	 			
	*/
	
	public void clearRunway();
	
	/**
	 Description: This method checks whether the Runway is empty from planes

	 Pre-condition: There is at least one plane or no plane at all

	 Post-condition: There is no more planes on the runway

	 Test-cases: testIsEmpty - checks if there are planes in the runway
	*/
	
	public boolean isEmpty();
	//////////////////////////////////////////////
	/**
	 Description: This method adds a plane thats on air to the waitToLand queue

	 Pre-condition: The plane is on air

	 Post-condition: The plane is added to the queue waitToLand

	 Test-cases: testaddToQueue_waitToLand - test if the plane exists in the queue
	 			 testaddToQueue_waitToLand_onLand - test if a plane from land can enter the landing queue
	*/
	public void addToQueue_waitToLand(Plane plane);
	/**
	 Description: This method adds a plane thats on ground to the waitToTakeOff queue
	 
	 Pre-condition: The plane is on ground

	 Post-condition: The plane is added to the queue waitToTakeOff

	 Test-cases: testAddToQueue_waitToTakeOff - test if the plane exists in the queue
	 			 testAddToQueue_waitToTakeOff_onAir - test if a plane from air can enter the waitToTakeOff queue
	*/
	public void addToQueue_waitToTakeOff(Plane plane);

	/**
	 Description: This method returns all planes of Status status /e.g onAir
	 
	 Pre-condition: Each plane has a status assigned

	 Post-condition: Planes can be classified by Status

	 Test-cases:
	 	*/
	
	public List<Plane> getPlanesByStatus(Plane.Status status);
	/**
	 Description: This method adds a plane to the Runway "database" of planes /e.g onAir
	 
	 Pre-condition: Each plane has a status assigned

	 Post-condition: A plane is ready to get in any queue 

	 Test-cases:
	 	*/
	
	public void addPlane(Plane plane);
	
	//public Plane[] getWaitToLandQueue();
	//public void setWaitToLandQueue(Plane[] plane);
	//public Plane[] getWaitToTakeOffQueue();
	//public void setWaitToTakeOfQueue(Plane[] plane);

	
}