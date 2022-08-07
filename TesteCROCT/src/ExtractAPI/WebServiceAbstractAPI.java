package ExtractAPI;
import com.google.gson.Gson;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class WebServiceAbstractAPI {
	
	private final String YOUR_ACCESS_KEY = "1632a3a0ccd3f5f21329a3e4110ef980";
	private boolean isSuccess = false;
	
	public ClsDataByIp getDataByIp(String IP) {
		
		HttpResponse<String> response = Unirest.get("https://api.ipstack.com/" + IP
				+ "?access_key=" + YOUR_ACCESS_KEY)
				.header("Content-Type", "application/json")
				.asString().ifFailure((t) -> {
					System.out.println("t = " + t.getStatusText());
					System.out.println("t = " + t.getBody());
				}).ifSuccess((t) -> {
					isSuccess = true;
					System.out.println(t.getStatusText());					
				}).ifFailure((t) -> {
					System.out.println("t = " + t.getStatusText());
					System.out.println("t = " + t.getBody());
					isSuccess = false;
				});
		
		if (isSuccess) {
			return new Gson().fromJson(response.getBody(), ClsDataByIp.class);
		} else {
			return new ClsDataByIp();
		}
		
	}
	
	
}
