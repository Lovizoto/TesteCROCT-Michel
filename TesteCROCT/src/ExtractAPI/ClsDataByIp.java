package ExtractAPI;
import java.util.ArrayList;

public class ClsDataByIp {

	private String ip = "";
	private String type = "";
	private String continent_code = "";
	private String continent_name = "";
	private String country_code = "";
	private String country_name = "";
	private String region_code = "";
	private String region_name = "";
	private String city = "";
	private String zip = "";
	private double latitude = 0.0;
	private double longitude = 0.0;
	private ArrayList<ClsLocation> location = new ArrayList<>();
	private ArrayList<ClsTimeZone> time_zone = new ArrayList<>();
	private ArrayList<String> currency = new ArrayList<>();
	private ArrayList<ClsConnection> connection = new ArrayList<>();
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContinent_code() {
		return continent_code;
	}
	public void setContinent_code(String continent_code) {
		this.continent_code = continent_code;
	}
	public String getContinent_name() {
		return continent_name;
	}
	public void setContinent_name(String continent_name) {
		this.continent_name = continent_name;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	public ArrayList<ClsLocation> getLocation() {
		return location;
	}
	public void setLocation(ArrayList<ClsLocation> location) {
		this.location = location;
	}
	public ArrayList<ClsTimeZone> getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(ArrayList<ClsTimeZone> time_zone) {
		this.time_zone = time_zone;
	}
	public ArrayList<String> getCurrency() {
		return currency;
	}
	public void setCurrency(ArrayList<String> currency) {
		this.currency = currency;
	}
	public ArrayList<ClsConnection> getConnection() {
		return connection;
	}
	public void setConnection(ArrayList<ClsConnection> connection) {
		this.connection = connection;
	}
	
	
	
	
	
	
	
}
