import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunwayTest {
	private Runway runway;
	private Plane plane;
	@BeforeEach
	void setUp() throws Exception {
		runway = new Runway();
		//plane = new Plane(Plane.Status.ONAIR);
	}
	@Test
	void testIsEmpty() {
		//List<Plane> planesOnRunway = runway.getPlanesByStatus(Plane.Status.ONRUNWAY);
		//Plane[] noPlanesOnRunway = null;
		//Plane [] planeOnRunway = (Plane[]) planesOnRunway.toArray();
		plane = new Plane(Plane.Status.ONAIR);
		runway.addPlane(plane);
		boolean result = runway.isEmpty();
		assertTrue(result);
	}
	@Test
	void testIsEmpty_busy() {
		plane = new Plane(Plane.Status.ONRUNWAY);
		runway.addPlane(plane);
		List<Plane> planesOnRunway = runway.getPlanesByStatus(Plane.Status.ONRUNWAY);
		boolean planeIsOn = planesOnRunway.contains(plane);
		assertFalse(planeIsOn);
	}
	void testGetPlanesByStatus() {
		Plane plane1 = new Plane(Plane.Status.ONAIR);
		Plane plane2 = new Plane(Plane.Status.ONAIR);
		Plane plane3 = new Plane(Plane.Status.ONGROUND);
		runway.addPlane(plane1);
		runway.addPlane(plane2);
		runway.addPlane(plane3);
		List<Plane> planesOnGround = runway.getPlanesByStatus(Plane.Status.ONGROUND);
		boolean plane = planesOnGround.contains(plane3);//get length of the list and create an array size of the list
		assertTrue(plane);
		
		
	}
	@Test
	void testClearRunway() {
		runway.clearRunway();
		boolean empty = runway.isEmpty();
		assertTrue(empty);
	}
	@Test
	void testClearRunway_busy() {
		runway.clearRunway();
		plane = new Plane(Plane.Status.ONRUNWAY);
		runway.addPlane(plane);
		boolean empty = runway.isEmpty();
		assertFalse(empty);
	}

	@Test
	void testAddToQueue_waitToLand() {
		plane = new Plane(Plane.Status.ONAIR);
		runway.addPlane(plane);
		runway.addToQueue_waitToLand(plane);
		List<Plane> queueWTL = runway.getWaitToLandQueue();
		boolean planeIsOnQueue =queueWTL.contains(plane);
		assertTrue(planeIsOnQueue);
	}

	@Test
	void testAddToQueue_waitToTakeOff() {
		plane = new Plane(Plane.Status.ONGROUND);
		runway.addPlane(plane);
		runway.addToQueue_waitToTakeOff(plane);
		List<Plane> queueWTTO = runway.getWaitToTakeOffQueue();
		boolean planeIsOnQueue = queueWTTO.contains(plane);
		assertTrue(planeIsOnQueue);
	}
	@Test
	void testAddPlane() {
		plane = new Plane(Plane.Status.ONAIR);
		runway.addPlane(plane);
		List<Plane> allPlanes = runway.getPlanes();
		boolean planeIsThere = allPlanes.contains(plane);
		assertTrue(planeIsThere);
		
		fail("Not yet implemented");
	}
	void testNextPlane() {
		Plane plane1 = new Plane(Plane.Status.ONAIR);
		Plane plane2 = new Plane(Plane.Status.ONAIR);
		Plane plane3 = new Plane(Plane.Status.ONAIR);
		runway.addPlane(plane1);
		runway.addPlane(plane2);
		runway.addPlane(plane3);
		Plane [] planes = {plane1,plane2,plane3};
		List <Plane> thePlanes =  new ArrayList <Plane>(Arrays.asList(planes));
		Plane nextPlane= runway.nextPlane(thePlanes);
		assertEquals(nextPlane,plane1);
	}

}
