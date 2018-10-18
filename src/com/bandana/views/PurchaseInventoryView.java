package com.bandana.views;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;


import com.bandana.controllers.PurchaseInventoryController;

public class PurchaseInventoryView extends JFrame implements ActionListener
{
	private PurchaseInventoryController controller;
	private JTextField txtCustomer, txtQuantity;
	private JComboBox ddlType;
	private JTextArea txtReporting;
	private JButton btnClear, btnPurchase;
	
	
	public PurchaseInventoryView(PurchaseInventoryController controller)
	{
		this.controller=controller;
		initView();
		configureListeners();
	}

	private void configureListeners()
	{
		// TODO Auto-generated method stub
		
	}

	private void initView() 
	{
		// TODO Auto-generated method stub
		setTitle("Bandana Inventory");
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1,2));		
		JPanel pnlLeft= new JPanel(new GridLayout(7,1));
		JPanel pnlRight= new JPanel(new BorderLayout());
		pnlLeft.add(new JLabel("Customer"));
		pnlLeft.add(txtCustomer= new JTextField());
		pnlLeft.add(new JLabel("Quantity"));
		pnlLeft.add(txtQuantity= new JTextField());
		pnlLeft.add(new JLabel("Type"));
		this.add(pnlLeft);
		pnlLeft.add(ddlType);
		setVisible(true);
	}

	@Override	
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		
	}
	
}
