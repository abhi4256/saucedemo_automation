package com.qa.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.saucedemo.base.BaseClass;

public class HomePage extends BaseClass {
   
	@FindBy (id="item_4_title_link") WebElement item_bag;
	@FindBy (xpath = "//*[@id=\"add-to-cart\"]")WebElement add_to_cart;
	@FindBy (xpath ="//*[@id=\"back-to-products\"]") WebElement Back_to_product;
//	@FindBy (xpath = "//*[@id=\"add-to-cart\"]")  WebElement Add_to_cart_icon;
	@FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select") WebElement Filter;
	
	@FindBy (xpath = "//*[@id=\"react-burger-menu-btn\"]") WebElement Menu_btn;
	@FindBy (xpath = "//*[@id=\"logout_sidebar_link\"]") WebElement Logout;
	
	@FindBy(id="user-name") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(id="login-button")private WebElement login_btn;
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public void Login_for_home(String un,String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		login_btn.click();
		
	}
	
	public Select dropdown() {
		Select a = new Select(Filter);
		a.selectByValue("za");
		return a;
	}
	public void add() {
		item_bag.click();
		add_to_cart.click();
		Back_to_product.click();
		
	}

	public void Logout() {
		Menu_btn.click();
		Logout.click();
	}
	
}
