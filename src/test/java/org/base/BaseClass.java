package org.base;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static Frame f;
	public static JavascriptExecutor j;
	public static Select s;
	public static WebDriverWait w;
	//1
	public static void launchchrome() throws AWTException {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 a=new Actions(driver);
		 r=new Robot();
	     j=(JavascriptExecutor)driver;
	}
	//2
	public static void winMax() {
		driver.manage().window().maximize();

	}
	//3
	public static void loadurl(String siteName) {
		driver.get(siteName);
	}
	//4
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	//5
	public static void printcurrenturl() {
		System.out.println(driver.getCurrentUrl()); 

	}
	//6
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
		

	}
	public static void fill(WebElement ele,String value,long li) {
		ele.sendKeys(value);

	}
	//7
	public static void btnclick(WebElement ele) {
		ele.click();

	}
	//8
	public static void closechrome() {
		driver.close();

	}
	//9
	public static void completeclose() {
		driver.quit();

	}
	//10
	public static void taketext(WebElement ele, String value) {
		System.out.println(ele.getText());

	}
	//11
	public static void takename(WebElement ele ,String values) {
		System.out.println(ele.getAttribute(values));
	}
	//12
	public static void drag(WebElement e1,WebElement e2) {
		a.dragAndDrop(e1,e2).perform();
	}//13   
	public static void move(WebElement target) {
		a.moveToElement(target).perform();

	}//14
	public static void move1(WebElement target) {
		a.moveToElement(target).click().perform();

	}//15
	public static void move2(WebElement target) {
		a.moveToElement(target).click().build().perform();

	}//16
	public static void send(WebElement e1, String value) {
		a.sendKeys(e1, value).perform();

	}
	//17
	public static void clk() {
		a.click().perform();
	
	}//18
	public static void clkadd(WebElement ele) {
		a.click(ele);

	}
	//19
	public static void dblclk(WebElement e1) {
		a.doubleClick(e1).perform();

	}//20
	public static void conclk(WebElement e1) {
		a.contextClick(e1).perform();

	}//21
	public static void ups(WebElement e1,Keys keys) {
		a.keyUp(e1, keys).perform();

	}//22
	public static void downs(WebElement e1,Keys keys) {
		a.keyDown(e1, keys).perform();

	}//23
	public static void prs(int vkEnter) {
		r.keyPress(vkEnter);

	}//24
	public static void rels(int key) {
		r.keyRelease(key);

	}//25
	public static void acc() {
		al=driver.switchTo().alert();
		al.accept();

	}//26
	public static void dis() {
		al=driver.switchTo().alert();
		al.dismiss();

	}//27
	public static void alsend1(String value) {
		al=driver.switchTo().alert();
		al.sendKeys(value);

	}//28
	public static void altaketext() {
		al=driver.switchTo().alert();
		System.out.println(al.getText());

	}//29
	public static  void frai(int value) {
		 driver.switchTo().frame(0);
		 

	}//30
	public static  void fras(String name) {
		 driver.switchTo().frame("value");
    }//31
	public static  void fraw(WebElement ele) {
		 driver.switchTo().frame(ele);
	
    }//32
	public static  void frasi(String id) {
		 driver.switchTo().frame("value");
	
	}//33
	public static void frapra() {
		driver.switchTo().parentFrame();
	}//34
	public static void fradef() {
		driver.switchTo().defaultContent();

	}//35
	public static void frasend(WebElement e1, String value) {
		a.sendKeys(e1, value).build().perform();
	}//36
	public static void fraclk(WebElement e1) {
		a.click(e1).build().perform();

	}//37
	public static void jscript1(WebElement e1) {
		j.executeScript("arguments[0].scrollIntoView(true)", e1);

	}//38
	public static void jscript2(WebElement e1) {
		j.executeScript("arguments[0].scrollIntoView(false)", e1);

	}//39
	public static void jscript3(WebElement e1) {
		j.executeScript("arguments[0].setAttribute('value','amar')", e1);
	}//40
	public static void jscript4(WebElement e1) {
		j.executeScript("arguments[0].setAttribute('style','background:purple;border:5px solid green')", e1);
   }//41
	public static void jscript5(WebElement e1) {
		j.executeScript("arguments[0].click()", e1);
	
   }//42
	public static void jscript6(WebElement e1) {
		Object o = j.executeScript("return arguments[0].getAttribute('value')", e1);
		String s=(String)o;
		System.out.println(s);
	}//43
	public static void stawait(int time) throws InterruptedException {
	    Thread.sleep(time);

	}//44
	public static void dynwait(long time,TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time,unit);

	}//45
	public static void selein(WebElement ele,int vlaue) {
	     s=new Select(ele);
		 s.selectByIndex(vlaue);
	}//46
	public static void seleval(WebElement ele,String value) {
		 s=new Select(ele);
		 s.selectByValue(value);
	}//47
	public static void selevis(WebElement ele,String value) {
		 s=new Select(ele);
		 s.selectByVisibleText(value);
	}//48
	public static void selemul(WebElement ele) {
		 s=new Select(ele);
		System.out.println( s.isMultiple());
	}//49
	public static void seleopt(WebElement ele) {
		s=new Select(ele);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			WebElement all = op.get(i);
			System.out.println(all.getText());
		}
	}//50
	public static void seleallop(WebElement ele) {
		s=new Select(ele);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement each : all) {
			System.out.println(each.getText());
		}
	}//51
	public static void selefrst(WebElement ele) {
		s=new Select(ele);
		WebElement frst = s.getFirstSelectedOption();
		System.out.println(frst.getText());

	}//52
	public static void deselein(WebElement ele,int value) {
		s=new Select(ele);
		s.deselectByIndex(value);

	}//53
	public static void deleseleval(WebElement ele,String value) {
		s=new Select(ele);
        s.deselectByValue(value);
	}//54
	public static void deselevisi(WebElement ele,String value) {
		s=new Select(ele);
		s.deselectByVisibleText(value);

	}//55
	public static void deseleall(WebElement ele) {
		s=new Select(ele);
		s.deselectAll();

	}//56
	public static void webmthena(WebElement ele) {
		System.out.println(ele.isEnabled());

	}//57
	public static void webmthdis(WebElement ele) {
		System.out.println(ele.isDisplayed());
		

	}//58
	public static void webmthdsel(WebElement ele) {
		System.out.println(ele.isSelected());

	}//59
	public static void webmthdsend(WebElement ele,String value) {
		ele.sendKeys(value);

	}//60
	public static void sub(WebElement ele) {
		ele.submit();

	}//61
	public static void ref() {
		driver.navigate().refresh();

	}//62
	public static void forw() {
		driver.navigate().forward();

	}//63
	public static void gobck() {
		driver.navigate().back();

	}//64
	public static void gotos(String s) {
		driver.navigate().to(s);

	}//65
	public static void takesnap(String name) throws IOException {
		TakesScreenshot tk= (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dsc=new File("C:\\Users\\SURENDRAN\\eclipse-workspace\\MavenProject\\Screenshot\\"+name+".jpg");
        FileUtils.copyFile(src, dsc);
	}//66
	public static void clr(WebElement ele) {
		ele.clear();

	}//67
	public static void winhand() {
		
		Set<String> child = driver.getWindowHandles();
		List<String> li= new ArrayList<String>();
		li.addAll(child);
		String s = li.get(1);
		driver.switchTo().window(s);
		

	}//68
	public static void winhandpar() {
		Set<String> child = driver.getWindowHandles();
		List<String> li= new ArrayList<String>();
		li.addAll(child);
		String s = li.get(0);
		driver.switchTo().window(s);

	}//69
	public static void robocopy() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}//70
	public  static void robopaste() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}//71
	public static void robocut() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

	}//72
	public static void roboenter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}//73
	public static void robotab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}//74
	public static void roboshit() {
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}
	
	//75
	public static void roboall() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

	}//76
	public static void robosave() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);

	}//77
	public static void robocaps() {
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
        r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	}//78
	public static void roboclear() {
		r.keyPress(KeyEvent.VK_CLEAR);
        r.keyRelease(KeyEvent.VK_CLEAR);

	}//79
	public static void robodelete() {
		r.keyPress(KeyEvent.VK_DELETE);
        r.keyRelease(KeyEvent.VK_DELETE);
	}//80
	public static void robo() {
		r.keyPress(KeyEvent.VK_CANCEL);
        r.keyRelease(KeyEvent.VK_CANCEL);
	}//81
	public static String getdata(int rownumber ,int cellnumber) throws IOException {
		File f= new File("C:\\Users\\SURENDRAN\\eclipse-workspace\\MyProject\\target\\XLdatas\\Signin.xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("datas");
			Row r = s.getRow(rownumber);
				Cell c =r.getCell(cellnumber);
				int cellType = c.getCellType();
				String value = "";
				if (cellType==1) {
					value=c.getStringCellValue();
					
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim= new SimpleDateFormat("dd,MMMM,yyyy");
					value=sim.format(d);
				}
				else {
					double d = c.getNumericCellValue();
					long l=(long)d;
					 value = String.valueOf(l);
				}
			      return value;

	}//82
	public static void createdata(int rownumber ,int cellnumber,String value) throws IOException {
		File f= new File("C:\\Users\\SURENDRAN\\eclipse-workspace\\MyProject\\target\\XLdatas\\Report.xlsx");
		FileInputStream fin= new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("rep");
		Row r = s.getRow(rownumber);
		Cell s1 = r.createCell(cellnumber);
        s1.setCellValue(value);
        FileOutputStream fout= new FileOutputStream(f);
        w.write(fout);
        
         
	}//83
	public static void launchfirefox() {
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();

	}//84
	public static void launchedg() {
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();

	}
     
	
	
	 
	
}

