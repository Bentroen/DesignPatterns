package thirdparty;

public class JsonImportService {

	public void loadJson(String data) {
		System.out.println("[" + this.getClass().getName() + "] The system was fed with following JSON data:");
		System.out.println(data);
	}
	
	
}
