package ExtractAPI;

public class Main {
	
	
	public static void main(String[] args) {		

		WebServiceAbstractAPI data = new WebServiceAbstractAPI();
		ClsDataByIp dados = data.getDataByIp("179.127.52.204");
		System.out.println(dados.getCity());
		
		
	}
	
}
