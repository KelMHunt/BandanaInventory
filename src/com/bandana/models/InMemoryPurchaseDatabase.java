package com.bandana.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryPurchaseDatabase implements IPurchaseDatabase
{
	private static Map<Integer, Purchase> purchases;
	private static int nextId=0;
	private static Map<Integer, Purchase> getInstance()
	{		
			if(purchases==null)
			{
				purchases=new HashMap<Integer, Purchase>();
			}
			return purchases;
	}
	
//	static{
//		db=new InMemoryPurchaseDatabase();
//		for(int i=0;i<3;i++)
//		{
//			db.store(new Purchase("Customer"+i, i%2==0 ? "Floral":"Army",
//					i, 
//					i *(i%2==0 ? 500 : 300)));
//		}
//	}
//	private static IPurchaseDatabase getInstance()
//	{
//		if(db==null)
//		{
//			db=new InMemoryPurchaseDatabase();
//		}
//		return db;
//	}
	public boolean store(Purchase purchase)
	{
		purchase.setId(++nextId);
		getInstance().put(++nextId, purchase);
		return true;		
	}
	public List<Purchase> retrieveAll()
	{
		List<Purchase> purchases = new ArrayList<Purchase>();
		for (Purchase purchase: getInstance().values())
		{
			purchases.add(purchase);
		}
		//getInstance().entrySet();
		return purchases;
	}
	public int getLastInsertedId()
	{
		return nextId;
	}

}
