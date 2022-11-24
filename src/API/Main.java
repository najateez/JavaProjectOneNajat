package API;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main {
	
	public static void main(String[] args) throws Throwable {
		
		
		Scanner s=new Scanner(System.in); 
		boolean isExit=true;
	
	do {
		System.out.println("Welcome to API System");
		System.out.println("*******************************");
		System.out.println("Menu:");
		System.out.println("0:JSON using (API), (the way of thaking data from website and display them in output as JSON Shape)");
		System.out.println("1:Convert JSON to java object (API), (the way of taking (JSON Data) from website and covert it to string then display them in output as data)");
		System.out.println("2:Exit");
		System.out.println("3:Read documentation consume with parameters:1-multiple users. 2-pagination. 3-passwords. 4-seeding. with API Error");
		System.out.println("*******************************");
		System.out.println("Enter a number from menu: ");
         int a=s.nextInt();
		
		switch(a) {
		case 0:{
			System.out.println("Output as JSON Shape should appear, using (API):-");
			
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
			break;
		}case 1:{
			System.out.println("Output should appear as data, using (API) (From JSON to data):-");
		// URL-> Response -> String -> Define object -> Output.
				for(int i=0;i<3;i++)
				{
					URL url= new URL("https://randomuser.me/api/");
					HttpURLConnection conn= (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.connect();
					StringBuilder informationString = new StringBuilder();
					
					int responseCode = conn.getResponseCode();
					if(responseCode != 200)
					{
						throw new RuntimeException("HttpResponseCode");
					}else {
						Scanner os= new Scanner(url.openStream());
						while(os.hasNext()) {
							informationString.append(os.next());
						}
						os.close();
					}
					
					Gson gson=new Gson(); //to remove error of Gson, should download from google: download Gson jar.
					
					/* the way to setup Gson jar to your project:
					   - right click to your project->properties->java build path->librarries->Add external jar's
					   in class path->Apply.
					 */
					/* the link i used to download Gson jar:
					   http://www.java2s.com/example/jar/g/download-gson262jar-file.html
					   - click  gson-2.6.2.jar 
					 */
					JsonToJavaObject result= gson.fromJson(informationString.toString(), JsonToJavaObject.class);
					System.out.println("Name= "+ result.getResults().get(0).getName().getFirst());
					System.out.println("gender= "+ result.getResults().get(0).getGender());
					System.out.println("email= "+ result.getResults().get(0).getEmail());
					System.out.println("phone= "+ result.getResults().get(0).getPhone());
					System.out.println("cell= "+ result.getResults().get(0).getCell());
					System.out.println("Nat= "+ result.getResults().get(0).getNat());
					System.out.println("*******************************");
				}
				     break;	
			}case 2:{
				isExit=false;
				break;
			}case 3:{
				System.out.println("(randomuser.me) Read documentation consume with parameters:");
			    System.out.println("1-multiple users. 2-pagination. 3-passwords. 4-seeding. with API Error");			     
				
				HttpClient hClient= HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?results=5&" //for multiusers
						                                                       + "&page=7&results=2&seed=abc&"  //for pagination
					                                                           + "&password=upper,lower,1-16&" //for passwords
						                                                       + "&seed=foobar"))  //for seeds
						                                                       .build();

				HttpResponse<String> response= hClient.send(request, HttpResponse.BodyHandlers.ofString());
				System.out.println("full json data from different classes: "+response.body());
				
				// just will print data of things which i mentioned in website only
				Gson gsonObj=new Gson();
				
				JsonToJavaObject data= gsonObj.fromJson(response.body().toString(),JsonToJavaObject.class);
				
				//multiusers
				System.out.println("Multi users (from results class)");
				                 //class object+ getClassName+ getIndex + getTheProperty
				System.out.println(data.getResults().get(0).getGender());
				System.out.println(data.getResults().get(0).getEmail());
				System.out.println(data.getResults().get(0).getPhone());
				System.out.println(data.getResults().get(0).getCell());
				System.out.println(data.getResults().get(0).getNat());
				System.out.println("************************");
				
				//pagination
				System.out.println("pagination (from info class)");
				System.out.println(data.getInfo().getPage());
				System.out.println(data.getInfo().getResults());
				System.out.println(data.getInfo().getSeed());
				System.out.println("************************");
				
				//passwords
				System.out.println("passwords (from login class)");
				System.out.println(data.getResults().get(0).getLogin().getPassword());
				System.out.println("************************");
				
				//Seeding
				System.out.println("Seeding (from info class)");
				System.out.println(data.getInfo().getSeed());
				System.out.println("************************");
				
				//Handle exceptions (API error)
				System.out.println("Handle exceptions (API error) (from HandleExceptionsAPIError class)");
				HandleExceptionsAPIError apiErrorObj= gsonObj.fromJson(response.body().toString(),HandleExceptionsAPIError.class);
				System.out.println(apiErrorObj.getError());
				
				
				
				System.out.println("*******************************");
				break;
			}default:{
				System.out.println("It is not an option. Try again and enter a number from menu above.");
				break;
			}
		}
	}while(isExit);
	}
}



