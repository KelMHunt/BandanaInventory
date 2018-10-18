package com.bandana.models;
import java.util.List;

public interface IPurchaseDatabase 
{
	boolean store(Purchase purchase);
	List<Purchase> retrieveAll();
	int getLastInsertedId();
}
