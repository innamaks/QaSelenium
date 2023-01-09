import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class Index {
    WebDriver wd;

    @BeforeMethod
    public void start() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Saibo/Downloads/index.html");
        wd.manage().window().maximize();

    }

    @Test
    public void tableTest() {
// правда ли в таблице четыре строки
        List<WebElement> elementList = wd.findElements(By.cssSelector("tr"));
        Assert.assertEquals(elementList.size(), 4);

        // правда ли что последния строка содержит Mexico
        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        String text = lastRow.getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("Mexico"));
        // правда  ли что последняя ячейка содержит строку Mexico
        WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        String str = lastCell.getText();
        Assert.assertTrue(str.contains("Mexico"));
    }
}
