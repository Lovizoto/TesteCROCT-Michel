package ExtractAPI;

public class ClsTimeZone {
	
	private String id = "";
	private String current_time = "";
	private int gmt_offset = 0;
	private String code = "";
	private boolean is_daylight_saving = true;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurrent_time() {
		return current_time;
	}
	public void setCurrent_time(String current_time) {
		this.current_time = current_time;
	}
	public int getGmt_offset() {
		return gmt_offset;
	}
	public void setGmt_offset(int gmt_offset) {
		this.gmt_offset = gmt_offset;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isIs_daylight_saving() {
		return is_daylight_saving;
	}
	public void setIs_daylight_saving(boolean is_daylight_saving) {
		this.is_daylight_saving = is_daylight_saving;
	}
	
	
	
}
