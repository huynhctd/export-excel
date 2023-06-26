package com.example.jxls.dao;

import com.example.jxls.model.InvoiceItem;

import java.util.ArrayList;
import java.util.List;

public class CommonDao {

	public List<InvoiceItem> getListInvoiceItem() {
		List<InvoiceItem> invoiceItems =  new ArrayList<>();

		InvoiceItem invoiceItem1 = new InvoiceItem("BL001", "APartment1", "football", "2023-01", "20000");
		InvoiceItem invoiceItem2 = new InvoiceItem("BL002", "APartment2", "BBQ", "2023-01", "10000");
		InvoiceItem invoiceItem3 = new InvoiceItem("BL003", "APartment2", "BBQ", "2023-01", "10000");
		InvoiceItem invoiceItem4 = new InvoiceItem("BL004", "APartment2", "BBQ", "2023-01", "10000");
		invoiceItems.add(invoiceItem1);
		invoiceItems.add(invoiceItem2);
		invoiceItems.add(invoiceItem3);
		invoiceItems.add(invoiceItem4);
		return invoiceItems;
	}
}
