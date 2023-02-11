package java_7day;

public class Tv {
//	변수  channel, volume, serialNumber 1 2 3 4 5 6	
//  메소드  volumeUp, volumeDown  channelUp channelDown	
	public static int count = 0;
	private int channel,volume,serialNumber=0;
	
	public Tv() {
		count++;
		serialNumber = count;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void volumeUp() {
		volume++;
	}
	public void volumeDown() {
		volume--;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
		
}
