package upskill.ebay.pageAction;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtShoes.getText(), "Shoes");
	}
	
public void verifyPantsItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
		
		//Option 2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtPants.getText(), "Pants");
	}

public void verifyShirtsItems(){
	
	//Option 1
	Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	
	//Option 2
	Assert.assertEquals(EbaySearchResultLocatorsObj.txtShirts.getText(), "Shirts");
    }

public void filterBrand(String brand){
	if(brand.equals("Adidas")){
	EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
	} else if(brand.equals("Nike")){
	EbaySearchResultLocatorsObj.cbxBrandNike.click();
	} else if(brand.equals("Unbranded")){
	EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
	} else {
		System.out.println("Brand not found");
	}
}

public void verifyBrandItems(String brand){
	if(brand.equals("Adidas")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	} else if(brand.equals("Nike")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}	else if(brand.equals("Unbranded")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}  else {
		System.out.println("Brand not found");
	}
    }

public void filterColor(String color){
	if(color.equals("Black")){
	EbaySearchResultLocatorsObj.cbxColorBlack.click();
	}else if(color.equals("White")){
	EbaySearchResultLocatorsObj.cbxColorWhite.click();
	}else if(color.equals("Blue")){
	EbaySearchResultLocatorsObj.cbxColorBlue.click();
	}else
	{System.out.println("Color Not Found");}}

public void verifyColorItems(String color){
	if(color.equals("Black")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}else if(color.equals("White")){
	Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	}else if(color.equals("Blue")){
	Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}else {
		System.out.println("Color Not Found");
	}
	}
	
public void selectCottonTee(){
	EbaySearchResultLocatorsObj.cbxlinkShirtItems.click();
	
}
	
}

