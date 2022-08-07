package Model;




public class ClsOutput {
	
	private int clientId;
	private long timestamp;
	private String ip;
	private double latitude;
	private double longitude;
	private String country;
	private String region;
	private String city;
	
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public ClsOutput(int clientId, long timestamp, String ip, double latitude, double longitude, String country,
			String region, String city) {
		super();
		this.clientId = clientId;
		this.timestamp = timestamp;
		this.ip = ip;
		this.latitude = latitude;
		this.longitude = longitude;
		this.country = country;
		this.region = region;
		this.city = city;
	}
	
	
}
