package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FlipkartTest {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // ---------- TEST CASE 1 ----------
    @Test
    public void searchIphoneTest() {
        test = extent.createTest("Search iPhone 15");
        openFlipkartAndSearch("iPhone 15");
        String title = driver.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("iphone"));
        test.pass("iPhone search successful");
    }

    // ---------- TEST CASE 2 ----------
    @Test
    public void searchSamsungTest() {
        test = extent.createTest("Search Samsung Galaxy");
        openFlipkartAndSearch("Samsung Galaxy");
        String title = driver.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("samsung"));
        test.pass("Samsung search successful");
    }

    // ---------- TEST CASE 3 (Intentional Fail) ----------
    //@Test
   /* public void searchInvalidProductTest() {
        test = extent.createTest("Search XYZABC (Invalid Product)");
        openFlipkartAndSearch("XYZABC");
        String title = driver.getTitle();
        // This will fail intentionally
        Assert.assertTrue(title.toLowerCase().contains("iphone"));
        test.pass("Unexpected success (this should fail)");
    }*/

    // ---------- COMMON METHOD ----------
    public void openFlipkartAndSearch(String product) {
        driver.get("https://www.flipkart.com/");
        test.info("Opened Flipkart");

        try {
            driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
            test.info("Closed login popup");
        } catch (Exception e) {
            test.warning("Login popup not found");
        }

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(product);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        test.info("Searched for: " + product);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        try {
            if (result.getStatus() == ITestResult.FAILURE) {
                test.fail(result.getThrowable());
                String screenshotPath = takeScreenshot(result.getName());
                test.addScreenCaptureFromPath(screenshotPath);
            } else if (result.getStatus() == ITestResult.SKIP) {
                test.skip("Test skipped: " + result.getName());
            } else if (result.getStatus() == ITestResult.SUCCESS) {
                test.pass("Test passed successfully");
            }
        } finally {
            driver.quit();
        }
    }

    @AfterSuite
    public void closeReport() {
        extent.flush();
    }

    public String takeScreenshot(String testName) {
        try {
            File screenshot = ((org.openqa.selenium.TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
            String path = "screenshots/" + testName + ".png";
            File dest = new File(path);
            dest.getParentFile().mkdirs();
            // Overwrite existing file if already exists
            Files.copy(screenshot.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return path;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
