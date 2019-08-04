import org.jsoup.Jsoup;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * GetURL.java and Downloader.java only are relevant to automatic background changer program.
 */

public class GetURL
{
    public static String getURL()
    {
        int i = 0;
        try
        {
            String pattern = "https://i.redd.it";
            //String test = "timestamp=\"1564777166000\" data-url=\"https://i.redd.it/7lw9gyvvr2e31.jpg";
           // String wow = Jsoup.connect("https://www.reddit.com/r/EarthPorn/").get().html();
            //String norwayspics = "https://www.reddit.com/r/NorwayPics/"
            //String images-with-filter = https://ps.reddit.com/r/Images/search?q=flair%3A%27Nature%2FScenery%27&restrict_sr=on&sort=relevance&t=all
            String html = Jsoup.connect("https://ps.reddit.com/r/Images/search?q=flair%3A%27Nature%2FScenery%27&restrict_sr=on&sort=relevance&t=all").get().html();
            //System.out.println(html);
            for (; i< html.length(); i++)
            {
                String match = html.substring(i,i+pattern.length());
                if (match.equals("https://i.redd.it") || match == "https://i.redd.it")
                {
                    System.out.println(true);
                    i += pattern.length() + 1;
                    break;
                }
            }

            String url = "";
            while (!html.substring(i,i+3).equals("jpg"))
            {
                url += html.charAt(i);
                i++;
            }

            url = "https://i.redd.it/" + url + "jpg";
            return url;
        }

        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(GetURL.getURL());
        //GetURL.getDimensions();
    }
}
