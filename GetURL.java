import org.jsoup.Jsoup;

/**
 * GetURL.java and Downloader.java only are relevant to automatic background changer program.
 * Latest version is this file, not one in IdeaProjects (WebScraping folder).
 * Instead of pattern being i.reddit.it, maybe change to https:// since some photos are hosted in imgur
 * resulting in a URL with i.imgur.it instead of i.reddit.it. 
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
            String earthporn = "https://www.reddit.com/r/EarthPorn/";
            String norwaypics = "https://www.reddit.com/r/NorwayPics/";
            String wallpapers = "https://www.reddit.com/r/wallpapers/";
            String imageswithfilter = "https://ps.reddit.com/r/Images/search?q=flair%3A%27Nature%2FScenery%27&restrict_sr=on&sort=relevance&t=all";
            String html = Jsoup.connect(earthporn).get().html();
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


}
