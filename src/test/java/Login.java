import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;
@BeforeMethod
    public void preCondition(){
        // open browser
        // open site
    wd.get("https://telranedu.web.app");
    }
@Test
   public void loginSuccess(){
        //open form
    // wd find button + click
       // fill form
    // find email + click + type
    // find password + click + type
       // submit form
    // find button login + click

    Assert.assertEquals("","");
        // os == exp

   }

   @AfterMethod
 public void postCondition(){
  //close browser
       wd.quit();
 }


}
