package com.pluralsight;

import org.openqa.selenium.By;

public class PathPages {

	static String url = "https://www.pluralsight.com/paths";
	static String title = "Java | Pluralsight";
	
	public void goTo() {
		Browser.goTo(url);
		
	}
	
	public void goToJavaPath() {
		
		Browser.driver.findElement(By.xpath("//*[@id=\"pathContent\"]/div[176]"));		
		//Browser.driver.findElement(By.cssSelector(".item:nth-child(176) .item-text")).click();
	    //assertThat(driver.getTitle(), is("Java | Pluralsight"));
		
	}
	
	public boolean isAt() {
		return Browser.title().equals(title);
	}

	
	

}
