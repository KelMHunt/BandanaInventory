package com.bandana.controllers;
import com.bandana.models.IPurchaseDatabase;
import com.bandana.models.InMemoryPurchaseDatabase;
import com.bandana.models.Purchase;

public class PurchaseInventoryController 
{
	IPurchaseDatabase db;
	public PurchaseInventoryController()
	{
		db= new InMemoryPurchaseDatabase();
	}
	public  PurchaseInventoryController(IPurchaseDatabase database)
	{
		db= database;
	}
	/**
	 * Stores purchase in data store/database
	 * After calculating the purchase price
	 *
	 * @return Purchase object with generated id and calculated price
	 */
	public Purchase storePurchase(Purchase purchase)
	{
		purchase.setCost(calculatePrice(purchase.getQuantity(), purchase.getType()));
		if(db.store(purchase))
		{
			//get the id
			purchase.setId(db.getLastInsertedId());
			return purchase;
		}
		return null;
	}
	public float calculatePrice(int quantity, String type)
	{
		switch(type.trim().toLowerCase())//trim() removes whitespaces before and after the string
		{
		case "floral":return quantity*500;
		case "army": return quantity*300;
		}
		return 0.0f;
	}
}
