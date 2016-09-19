/*

automation challenge 8 (Crawler and image verification):
Extension of the crawler challenge.  As you navigate through the site, find every broken image.

Go to https://www.skiutah.com/

Verify that each reference to an image displays the image correctly and not a dead image.  Log every page that has a
broken image to a text file.

Listed below is the sample code stub for running this test.

 */

public class Utils extends SeleniumWebdriverBaseClass
{
    @Test
    // This method is the main method for launching tests
    public void testLauncher() throws InterruptedException, IOException {

        // Verify Page Title
        VerifyPageTitle(URL, Expected_Value);
        // Visit every page of the skiutah.com domain once, compiling a list of all unique images on the skiutah.com domain
        // Log every broken image, along with the page where that image is located
        webCrawler();
    }
}
