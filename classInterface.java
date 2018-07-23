interface interface1
{
	public void switchOff();
	public void switchon();
	public void changeChannel();
	public void increaseVolume();
	public void decreaseVolume();
}
public class classInterface implements interface1{

	@Override
	public void switchOff() {
		
		System.out.println("Switching off the tv...");
		
	}

	@Override
	public void switchon() {
		
		System.out.println("Switching on the tv...");
		
	}

	@Override
	public void changeChannel() {
		
		System.out.println("Changing the channel...");
		
	}

	@Override
	public void increaseVolume() {
		
		System.out.println("Increasing the volume...");
		
	}

	@Override
	public void decreaseVolume() {
		
		System.out.println("Decreasing the volume...");
		
	}
	
	

}
