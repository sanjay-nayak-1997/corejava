class Restaurant 
{
	public synchronized void takeLunch(String name)
	{
		System.out.print("Hello ");
		System.out.println(name + " can have lunch now ");
	}
}


class RestaurantThread extends Thread

{
	Restaurant r;
	
	public RestaurantThread(Restaurant r) {
		this.r = r;
	}

	@Override
	public void run() {
		
		r.takeLunch(currentThread().getName());
	}
	
}


public class MainRestaurant {

	public static void main(String[] args) {
		Restaurant res=new Restaurant();
		RestaurantThread rt1=new RestaurantThread(res);
		rt1.setName("Sanjay");
		RestaurantThread rt2=new RestaurantThread(res);
		rt2.setName("Deepak");
		RestaurantThread rt3=new RestaurantThread(res);
		rt3.setName("Anfal");
		RestaurantThread rt4=new RestaurantThread(res);
		rt4.setName("Arvind");
		
		rt1.start();
		rt2.start();
		rt3.start();
		rt4.start();
		

	}

}
