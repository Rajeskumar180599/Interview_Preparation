package Interview_programs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakesScreeShot {

     static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {
        //--------------------- OLD format ---------------------------------------
        TakesScreenshot ts = (TakesScreenshot)  driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("");
        FileUtils.copyFile(src,des);

        //--------------------- NEW FORMAT ---------------------------------------
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(""));
    }

}
