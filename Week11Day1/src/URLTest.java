import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class URLTest {

	public static void main(String[] args) {
	
		
		try {
			URL abhUrl = new URL("http://atlantbh.com");
			URLConnection connect = abhUrl.openConnection();
			InputStream in = connect.getInputStream();
			String res = "";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ( (line = br.readLine()) != null){
				
				res += "\n" + line;
			}
			
			System.out.println(res);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
