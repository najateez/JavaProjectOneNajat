package API;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main {

    public static String websiteLinkRandomUser = "https://randomuser.me/api/";

	public static void main(String[] args) throws Throwable {
		Scanner s=new Scanner(System.in); //TODO: 's' is not a good variable name
		Boolean isExit=true;

	do {
		System.out.println("Welcome to API System");
		System.out.println("*******************************");
		System.out.println("Menu:");
		System.out.println("0:JSON using (API), (the way of taking data from website and display them in output as JSON Shape)");
		System.out.println("1:Convert JSON to java object (API), (the way of taking (JSON Data) from website and covert it to string then display them in output as data)");
		System.out.println("2:Exit");
		System.out.println("3:Read documentation consume with parameters:1-multiple users. 2-pagination. 3-passwords. 4-seeding. with API Error");
		System.out.println("4:Read documentation consume with parameters:5-Nationality. 6- IncludingExcluding");
		System.out.println("*******************************");
		System.out.println("Enter a number from menu: ");
         int a=s.nextInt(); //TODO: Make it Integer  //TODO: 'a' is not a good variable name

		switch(a) {
		case 0:{
			System.out.println("Output as JSON Shape should appear, using (API):-");

			 HttpRequest requestData= HttpRequest.newBuilder()
				   	    .uri(URI.create(websiteLinkRandomUser)).method("GET", HttpRequest.BodyPublishers.noBody())
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
				 System.out.println("*******************************");
			break;
		}case 1:{
			System.out.println("Output should appear as data, using (API) (From JSON to data):-");
		// URL-> Response -> String -> Define object -> Output.

			   for(int i=0;i<2;i++) //TODO: Instead of using 2 make it dynamic
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
					UserData result= gson.fromJson(informationString.toString(), UserData.class);
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

			    System.out.println("Enter the No.of User you want: ");
				   int numberOfUsers=s.nextInt();
				HttpClient hClient= HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?results=5&")) //for multiusers
						.build();

				HttpResponse<String> response= hClient.send(request, HttpResponse.BodyHandlers.ofString());
				Gson gsonObj=new Gson();

				if(response.body().contains("error")){
					HandleExceptionsAPIError apiErrorObj= gsonObj.fromJson(response.body().toString(),HandleExceptionsAPIError.class);
					System.out.println(apiErrorObj.getError());
					System.out.println("*******************************");
					break;
				}

				UserData data= gsonObj.fromJson(response.body(), UserData.class);

				List<Results> resultsList = data.getResults();
/*				   for(int i=0;i<numberOfUsers;i++)
				      {

			//	System.out.println("full json data from different classes: "+response.body());

				// just will print data of things which i mentioned in website only

				//multiusers
				System.out.println("Multi users (from results class)");
				                 //class object+ getClassName+ getIndex + getTheProperty
				System.out.println(resultsList.get(i).getGender());
				System.out.println(resultsList.get(i).getEmail());
				System.out.println(resultsList.get(i).getPhone());
				System.out.println(resultsList.get(i).getCell());
				System.out.println(resultsList.get(i).getNat());
				System.out.println("************************");
				      }*/

				   for(Results result: resultsList){
					   if(result.getGender() != null){
						   System.out.println(result.getGender());
					   }
					   System.out.println(result.getEmail());
					   System.out.println(result.getPhone());
					   System.out.println(result.getCell());
					   System.out.println(result.getNat());
					   System.out.println("************************");
				   }


				hClient= HttpClient.newHttpClient();
			    request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?page=7&results=2&seed=abc&" //for pagination
						                                                           + "&password=upper,lower,1-16&" //for passwords
							                                                       + "&seed=foobar"))         //for seeds
							                                                       .build();

				response= hClient.send(request, HttpResponse.BodyHandlers.ofString());
				//	System.out.println("full json data from different classes: "+response.body());

				data= gsonObj.fromJson(response.body().toString(), UserData.class);

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

				if(data.getResults().get(0).getLogin().getPassword() != null){
					System.out.println(data.getResults().get(0).getLogin().getPassword());
				}

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
			}case 4:{
				/*i made it separate because (can not be together with previous one/ case3),
				  because page login we use password, and for includingExcluding the login is excluding
				   thats why not work together.
				 */
				System.out.println("(randomuser.me) Read documentation consume with parameters:");
				System.out.println("5- Nationality. 6- IncludingExcluding feilds.");

				HttpClient hClient= HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?&nat=gb&" //for nationality
						                                                       + "&inc=gender,name,nat&"  //for including
						                                                       + "&exc=login"))   //for excluding
						                                                       .build();

				HttpResponse<String> response= hClient.send(request, HttpResponse.BodyHandlers.ofString());
			//	System.out.println("full json data from different classes: "+response.body());

				// just will print data of things which i mentioned in website only
				Gson gsonObj=new Gson();

				UserData data= gsonObj.fromJson(response.body().toString(), UserData.class);
				//Nationality
				System.out.println("Nationality (from Nationality class)");
				System.out.println(data.getResults().get(0).getNat());
				System.out.println("************************");
				//IncludingExcluding
				System.out.println("IncludingExcluding (from IncludingExcluding class)");
				//including:
				System.out.println(data.getResults().get(0).getGender());
				System.out.println(data.getResults().get(0).getName());
				System.out.println(data.getResults().get(0).getNat());
				//Excluding: (Excluding always answer will be null).
				System.out.println(data.getResults().get(0).getLogin());
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



