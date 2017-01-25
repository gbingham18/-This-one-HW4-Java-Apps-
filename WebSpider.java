import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebSpider {
	public static void main(String[] args)
	{
		HashMap<String, Boolean> websitesVisited = new HashMap<String, Boolean>();
		ArrayList<String> URLNames = new ArrayList();
		
		try
		{
			URL url = new URL("https://www.youtube.com/");
			BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = rdr.readLine();
			while (line != null)
			{
				Pattern URL = Pattern.compile("https:(.*?)\"");
				Matcher matcher = URL.matcher(line);
				if (matcher.find())
				{
					websitesVisited.put(matcher.group(1), false);
					URLNames.add(matcher.group(1));
				}
			}
						
		} catch (Exception ex){ System.out.printf("%s", ex.getMessage()); }
		
		
		for (int i = 0; i < 100; i++)
		{
			try
			{
				URL url = new URL(URLNames.get(i));
				BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
				String line = rdr.readLine();
				while (line != null)
				{
					Pattern URL = Pattern.compile("https:(.*?)\"");
					Matcher matcher = URL.matcher(line);
					if (matcher.find())
					{
						websitesVisited.put(matcher.group(1), false);
					}
				}
				websitesVisited.put(URLNames.get(i), true);
			} catch (Exception ex) { System.out.printf("%s", ex.getMessage()); }
			
		}
	}
}
