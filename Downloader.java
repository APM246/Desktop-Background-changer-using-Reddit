import java.io.InputStream;
import java.nio.file.Files;
import java.net.URL;
import java.nio.file.Paths;

public class Downloader
{


    public static void main(String[] args)
    {
        try
        {
            InputStream in = new URL(GetURL.getURL()).openStream();
            try 
            {
            Files.delete(Paths.get("C:\\Users\\Arun Muthu\\Pictures\\AutomaticBackgroundChanger\\test5.jpg"));
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            Files.copy(in, Paths.get("C:\\Users\\Arun Muthu\\Pictures\\AutomaticBackgroundChanger\\test5.jpg"));
        }

        catch (Exception e)
        {}
    }

}
