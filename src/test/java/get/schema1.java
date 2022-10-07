package get;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class schema1 {

	public static void main(String[] args) throws IOException, ParseException
	{
		int count=0;
		JSONParser jsonparser=new JSONParser();
		FileReader reader=new FileReader(".\\json\\players.json");
		Object obj=jsonparser.parse(reader);
		JSONObject players=(JSONObject)obj;
		String Fname=(String)players.get("name");
		String Location=(String)players.get("location");
		
//		System.out.println(Fname);
//		System.out.println(Location);
		
		JSONArray a=(JSONArray)players.get("player");
//		System.out.println(a);
		
		for(int i=0;i<a.size();i++)
		{
			JSONObject player=(JSONObject)a.get(i);
			
			
			String Name=(String)player.get("name");
			String Country=(String)player.get("country");
			String Role=(String)player.get("role");
			
			
			if(Role.equals("Wicket-keeper"))
			{
				System.out.println(Role);
			}

	}
		}

}
