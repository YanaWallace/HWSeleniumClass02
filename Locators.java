package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
       //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //or you can use

       WebElement userNameTextBox= driver.findElement(By.id("txtUsername"));
       userNameTextBox.sendKeys("Admin");
       //to slow down
       Thread.sleep(2000);
       //clear the text box
        userNameTextBox.clear();

        //sending the username again
        userNameTextBox.sendKeys("Admin");

        //find the password
        WebElement pass= driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        //find the login button
        WebElement loginBtn= driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcom message
        WebElement message= driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();
        System.out.println(text);

        driver.findElement(By.partialLinkText("Recru")).click();

    }
}
