import java.util.ArrayList;
import java.util.List;

public class Runway implements RunwayInterface {
	List<Plane> waitToLand;
	List<Plane> waitToTakeOff;
	static List<Plane> planeList = new ArrayList<Plane>();
	@Override
	public void clearRunway() {
		List <Plane> planesOR =  this.getPlanesByStatus(Plane.Status.ONRUNWAY);
		for (Plane plane:planesOR) {
			plane.setStatus(Plane.Status.ONGROUND);
		}
	}

	@Override
	public boolean isEmpty() {
		List <Plane> planesOnRunway = getPlanesByStatus(Plane.Status.ONRUNWAY);
		if (planesOnRunway.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public void addToQueue_waitToLand(Plane plane) {
		
	}

	@Override
	public void addToQueue_waitToTakeOff(Plane plane) {
		// TODO Auto-generated method stub

	}


	@Override
	public List<Plane> getPlanesByStatus(Plane.Status status) {
		List<Plane> planes = new ArrayList<Plane>() ;
		for (Plane plane: planeList) {
			if(plane.getStatus() == status) {
				planes.add(plane);
			}
		}
		return planes;
	}

	@Override
	public void addPlane(Plane plane) {
		planeList.add(plane);
		
	}

	
	public Plane nextPlane(List <Plane> plane){
		
		return null;
	}
	public List<Plane> getWaitToLandQueue() {
		return waitToLand;
	}
	public void setWaitToLandQueue(List<Plane> plane){
		this.waitToLand=plane;
		
	}
	public List<Plane> getWaitToTakeOffQueue() {
		return waitToTakeOff;
	}
	public void setWaitToTakeOfQueue(List<Plane> plane) {
		this.waitToTakeOff = plane;
	}
	public List <Plane> getPlanes() {
		
		return planeList;
	}
}