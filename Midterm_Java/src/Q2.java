
class Location {
	public double latitude;
	public double longitude;
	public Location(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon; 
	}
	
	public double distance(Location other) {
		double RadiusEarth = 6371.0;
		double lat1 = this.latitude;
		double lon1 = this.longitude;
		double lat2 = other.latitude;
		double lon2 = other.longitude;
		return RadiusEarth*Math.acos(Math.cos(Math.toRadians(90-lat1))*Math.cos(Math.toRadians(90-lat2))+Math.sin(Math.toRadians(90-lat1))*Math.sin(Math.toRadians(90-lat2))*Math.cos(Math.toRadians(lon1-lon2)));
	}
}

class Person {
	
	public boolean is_vaccinated; 
	private Location location; 
	private double radius;
	
	public Person(boolean vaccinated, Location loc, double rad) {
		// fill here!
		is_vaccinated = vaccinated;
		location = loc;
		radius = rad;
		
	}
	
	public double getRadius() {
		// fill here!
		return radius;
	}
	
	public Location getLocation() {
		// fill here!
		return location;
	}
	
	public boolean isCloseContact(Person other) {
		// fill here!
		boolean result = false;
		if (!this.is_vaccinated || !other.is_vaccinated) {
			if (location.distance(other.location) <= radius ) {
				result = true;
			}
		}
		return result;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Location loc1 = new Location(31.3, 68.401);
		Location loc2 = new Location(31.3, 68.402);
		Location loc3 = new Location(21.3, 60.1);
		Person p1 = new Person(false, loc1, 10);
		Person p2 = new Person(false, loc2, 20);
		Person p3 = new Person(true, loc3, 40);
		System.out.println(loc1.distance(loc2)); // 		0.09501150042813652
		System.out.println(loc2.distance(loc3)); // 		1384.9443207066624
		System.out.println(loc1.distance(loc3)); // 		1384.8850593240236
		System.out.println(p1.isCloseContact(p2)); // 		true
		System.out.println(p2.isCloseContact(p3)); // 		false
		System.out.println(p1.isCloseContact(p3)); // 		false

	}

}
