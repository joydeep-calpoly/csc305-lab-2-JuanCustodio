package Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Task.Award;
import Task.Dignitary;

public class Driver {
	
	public static void main(String[] args) throws JSONException
	{
		try 
		{
			String file = new String(Files.readAllBytes(Paths.get("input1.json")));


			JSONObject jsonObject = new JSONObject(file);

			
			String name = jsonObject.getString("name");
			
			JSONArray knownForArray = jsonObject.getJSONArray("knownFor");
			
			List<String> knownFor = new ArrayList<>();
			
			for(int i = 0; i < knownForArray.length() ; i++) {
				knownFor.add(knownForArray.getString(i));
			}
			
			JSONArray awardsArray = jsonObject.getJSONArray("awards");
			List<Award> awards = new ArrayList<>();
			
			for(int i = 0; i < awardsArray.length(); i++) {
				JSONObject awardIndex = awardsArray.getJSONObject(i);
				String awardName = awardIndex.getString("name");
				int year = awardIndex.getInt("year");
				
				awards.add(new Award(awardName, year));
			}
			
			
			Dignitary person = new Dignitary(name, knownFor, awards );
			
			System.out.println(person);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
