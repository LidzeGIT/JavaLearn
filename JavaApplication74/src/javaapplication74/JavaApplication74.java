public class NewClient {
    static WebDriver driver;

    @Test
    public void Step1() {
        WebElement elemet = (new WebDriverWait(driver, 120)).until(ExpectedConditions.presenceOfElementLocated(By.name("Меню")));
        elemet.click();
    }
    @Test
    public void Step2() {
        Actions bl = new Actions(driver);
        bl.moveToElement(driver.findElement(By.name("Новый клиент"))).click().perform();
    }
    @Test
    public void Step3() {
        Actions bl = new Actions(driver);
        bl.moveToElement(driver.findElement(By.name("Клиент"))).click().perform();
    }
    @Test
    public void setSurname() {
         WebElement elemet4 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.id("134")));
         elemet4.sendKeys("Loool");
    }
    @Test
    public void setName() {
       WebElement element5 = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.id("135")));
       element5.sendKeys("Lalala");
    }
}
