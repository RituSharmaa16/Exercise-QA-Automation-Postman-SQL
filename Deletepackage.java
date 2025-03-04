import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class Deletepackage {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ecspro-qa.kloudship.com");
        Thread.sleep(5000);

        //login
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("kloudship.qa.automation@mailinator.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Password1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='login-btn']")).click();
        Thread.sleep(8000);

        //select package types
        driver.findElement(By.xpath("//div[@class='row count-card-wrapper']//mat-card[8]")).click();
        Thread.sleep(5000);

        //delete package
        driver.findElement(By.xpath("//div[normalize-space()='Ritu_Sharma 16 x 16 x 16']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//mat-card[contains(@class, 'mat-card') and contains(@class, 'mat-focus-indicator') and contains(@class, 'card-list') and contains(@class, 'cursor-pointer') and contains(@class, 'row') and contains(@class, 'ng-star-inserted') and contains(@class, 'selected') and contains(@class, 'carrier-all-bar')]//div[contains(@class, 'delete') and contains(@class, 'ng-star-inserted')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary ng-star-inserted']")).click();

        //logout
        driver.findElement(By.xpath("//mat-icon[normalize-space()='more_vert']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[contains(@class, 'mat-menu-content')]//button[contains(@class, 'mat-menu-item')]//mat-icon[normalize-space()='power_settings_new']")).click();
    }
}
