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
    private static WebElement element;
    
    @BeforeClass
    public static void starterChrome() {
        System.setProperty("webdriver", "C:\\sel\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://habr.com/");
    }

    @Test
    public void test1() {
        element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/a[2]"));
        element.click();
    }
    @Test
    public void test2(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[3]/div/input"));
        element.sendKeys("lm123123@yandex.ru");
    }
    @Test
    public void test3(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[4]/div/input"));
        element.sendKeys("ildfjajfjs");
    }
    @Test
    public void test4(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[5]/div/input"));
        element.sendKeys("31233123q");
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[6]/div/input"));
        element.sendKeys("31233123q");
    }
    @Test
    public void test5(){
        element = driver.findElement(By.xpath("//*[@id=\"register_form\"]/div[7]/div/label/span[1]"));
        element.click();
    }
    @Test
    public void test6(){
        element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[2]"));
        element.click();
    }

    @AfterClass
    public static void ret() {
        WebElement exitButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[1]"));
        exitButton.click();
        driver.quit();
    }
}
