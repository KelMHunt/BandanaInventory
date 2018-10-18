package com.bandana;

import java.awt.EventQueue;
import com.bandana.controllers.PurchaseInventoryController;
import com.bandana.views.PurchaseInventoryView;

public class ClientDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new PurchaseInventoryView(new PurchaseInventoryController());
					
			}
		});
	}

}
