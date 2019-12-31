import java.io.InputStream;
import java.nio.file.Files;
import java.net.URL;
import java.nio.file.Paths;

public class Downloader
{
    public static void main(String[] args)
    {
        String path = "..\\set up\\background-photo.jpg";

        try
        {
            InputStream in = new URL(GetURL.getURL()).openStream();
            try 
            {
            Files.delete(Paths.get(path));
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            Files.copy(in, Paths.get(path));
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
