import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * experimental version: checks for image dimensions.
 * Need to keep calling getURL, with html String variable being changed each time (cut part of html that has already been analysed)
 * Amend getURL to have String parameter html and/or private variable in Downloader class keeping track of unanalysed HTML
 */
public class Downloader
{
    final static String newURL = "C:\\Users\\Arun Muthu\\Pictures\\AutomaticBackgroundChanger\\test5.jpg";

    public static int[] getDimensions()
    {
        try
        {
            BufferedImage bi = ImageIO.read(new File(newURL));
            return new int[] {bi.getWidth(),bi.getHeight()};
        }
        catch (Exception e)
        {
            return null;
        }
    }

    public static void createFile()
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
            Files.copy(in, Paths.get(newURL));
        }

        catch (Exception e)
        {}
    }

    public static void main(String[] args)
    {
       do
       {
           createFile();
       }
       while (!Arrays.equals(getDimensions(),new int[] {1920,1080}));
    }

}
