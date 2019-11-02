import org.jsoup.Jsoup;

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
            // example: extract from "timestamp=\"1564777166000\" data-url=\"https://i.redd.it/7lw9gyvvr2e31.jpg";
            String redditpattern = "https://i.redd.it";
            String imgurpattern = "https://i.imgur.com";
            String earthporn = "https://www.reddit.com/r/EarthPorn/";
            String norwaypics = "https://www.reddit.com/r/NorwayPics/";
            String wallpapers = "https://www.reddit.com/r/wallpapers/"; //problematic long url
            String wallpaper = "https://www.reddit.com/r/wallpaper/";
            String porsche = "https://www.reddit.com/r/Porsche/";
            String carporn = "https://www.reddit.com/r/carporn/";
            String imageswithfilter = "https://ps.reddit.com/r/Images/search?q=flair%3A%27Nature%2FScenery%27&restrict_sr=on&sort=relevance&t=all";
	        String aerial = "https://www.reddit.com/r/AerialPorn/";
            String frontpartofurl = "";
            String url = "";
            String html = Jsoup.connect(earthporn).get().html();
            System.out.println(html);
            for (; i< html.length(); i++)
            {
                String redditmatch = html.substring(i,i+redditpattern.length());
                String imgurmatch = html.substring(i,i+imgurpattern.length());
                if (redditmatch.equals("https://i.redd.it"))
                {
                    frontpartofurl = redditpattern;
                    i += redditpattern.length() + 1;
                    break;
                }
                else if (imgurmatch.equals("https://i.imgur.com"))
                {
                    frontpartofurl = imgurpattern;
                    i += imgurpattern.length() + 1;
                    break;
                }
            }

            while (!html.substring(i,i+3).equals("jpg"))
            {
                url += html.charAt(i);
                i++;
            }

            url = frontpartofurl + "/" + url + "jpg";
            //System.out.println(url);
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
        GetURL.getURL();
    }


}
