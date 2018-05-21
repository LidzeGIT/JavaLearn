import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Chrome {

    private static WebDriver driver;

    @BeforeClass
    public static void starterChrome() {
        System.setProperty("webdriver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://habr.com/");
    }

    @Test
    public void reg() {
        WebElement reg = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/a[2]"));
        reg.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[3]/div/input"));
        email.sendKeys("lm123123@yandex.ru");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[4]/div/input"));
        login.sendKeys("ildfjajfjs");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[5]/div/input"));
        pass.sendKeys("31233123q");
        WebElement pass2 = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[6]/div/input"));
        pass2.sendKeys("31233123q");
        WebElement auth = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[7]/div/label/span[1]"));
        auth.click();
        WebElement live = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[2]"));
        live.click();

    }

    @AfterClass
    public static void ret() {
        WebElement exitButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[1]"));
        exitButton.click();
        driver.quit();
    }
}
