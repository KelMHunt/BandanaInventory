package com.bandana.models;

public class Purchase 
{
	private String customerName;
	private String type;
	private int quantity;
	private float cost;
	private int id;	

	public Purchase()
	{
		this("", "", 0, 0.0f);
	}	
	public Purchase(String string, String string2, int i, float f) 
	{
		customerName=string;
		type=string2;
		quantity=i;
		cost=f;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
