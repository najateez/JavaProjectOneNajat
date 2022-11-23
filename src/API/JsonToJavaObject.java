package API;

import java.util.List;

//Q: Convert JSON to java object. (API).
//means Convert API from website as JSON (String), and then display them in output as data. run the program.
public class JsonToJavaObject {
	
	List<Results> results;
	Info info;
	
	public List<Results> getResults() {
		return results;
	}
	public void setResults(List<Results> results) {
		this.results = results;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}

}
