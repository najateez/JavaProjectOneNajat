package API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Write in google: how to make API calls in java?. 
//OR open this website: https://rapidapi.com/guides/make-api-call-java
// from step 4 : to import all libraries. step 5: last code.
public class APIDataFromWebsite {
	
	
	public static void main(String[] args) { //"GET" must be capital letter.
   	 
   	 HttpRequest requestData= HttpRequest.newBuilder()
   	    .uri(URI.create("https://randomuser.me/api/")).method("GET", HttpRequest.BodyPublishers.noBody())
   	    .build();
   	 
   	 HttpResponse<String> response = null;
   	 
   	 try {
   		 response = HttpClient.newHttpClient().send(requestData, HttpResponse.BodyHandlers.ofString());
   	 }catch (IOException e) {
   		 e.printStackTrace();
   	 }catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
   	 
   	 System.out.println(response.body());
   	
		

	}

}
