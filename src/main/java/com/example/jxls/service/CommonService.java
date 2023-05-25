package com.example.jxls.service;

import com.example.jxls.common.Report;
import com.example.jxls.dao.CommonDao;
import com.example.jxls.model.InvoiceItem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonService {
	
	private CommonDao dao;
	
	public CommonService() {
		dao = new CommonDao();
	}
	
	private void createCommonClientReport(String templateName, String outputName) throws FileNotFoundException {
		Report report = new Report();
		
		OutputStream outStream = new FileOutputStream(outputName);
		
		Map<String, Object> data = new HashMap<>();
		data.put("createdAt", "2021-01-01");
		data.put("clients", dao.getAllClients());
		
		report.createDocument(outStream, templateName, data);
	}
	
	public void createClientReport() throws FileNotFoundException {
		createCommonClientReport("clientsTemplate", "target/clients.xls");
	}
	
	public void createClientReportWithConditions() throws FileNotFoundException {
		createCommonClientReport("clientsMarkInactiveTemplate", "target/clientsMarkInactive.xls");
	}

	public void createTemPlateReceiept() 	throws FileNotFoundException {
		String template = "template_receiept";
		Report report = new Report();

		Map<String, Object> data = new HashMap<>();
		data.put("now", LocalDateTime.now());
		data.put("accountName", "THT Company");
		data.put("accountAddress", "StarLake, HN");

		data.put("billingName", "Huynhctd");
		data.put("billingEmail", "huynhctd@smartosc.com");
		data.put("billingAddress", "Thuan Thanh, BN");


		data.put("accountName", "THT Company");
		data.put("accountName", "THT Company");

		List<InvoiceItem> invoiceItems =  new ArrayList<>();

		InvoiceItem invoiceItem1 = new InvoiceItem("BL001", "APartment1", "football", "2023-01", "20000");
		InvoiceItem invoiceItem2 = new InvoiceItem("BL002", "APartment2", "BBQ", "2023-01", "10000");
		InvoiceItem invoiceItem3 = new InvoiceItem("BL003", "APartment2", "BBQ", "2023-01", "10000");
		InvoiceItem invoiceItem4 = new InvoiceItem("BL004", "APartment2", "BBQ", "2023-01", "10000");
		invoiceItems.add(invoiceItem1);
		invoiceItems.add(invoiceItem2);
		invoiceItems.add(invoiceItem3);
		invoiceItems.add(invoiceItem4);

		data.put("invoiceItems", invoiceItems);

		OutputStream outStream = new FileOutputStream("target/receipt.xlsx");
		report.createDocument(outStream, template, data);
	}

}
