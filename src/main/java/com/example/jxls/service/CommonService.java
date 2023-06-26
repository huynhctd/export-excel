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

	public void createTemPlateReceiept() 	throws FileNotFoundException {
		String template = "template_receiept";
		Report report = new Report();

		// test data
		Map<String, Object> data = new HashMap<>();
		data.put("now", LocalDateTime.now());
		data.put("accountName", "THT Company");
		data.put("accountAddress", "StarLake, HN");

		data.put("billingName", "Huynhctd");
		data.put("billingEmail", "huynhctd@smartosc.com");
		data.put("billingAddress", "Thuan Thanh, BN");


		data.put("accountName", "THT Company");
		data.put("accountName", "THT Company");

		data.put("invoiceItems", dao.getListInvoiceItem());

		OutputStream outStream = new FileOutputStream("target/receipt.xlsx");
		report.createDocument(outStream, template, data);
	}

}
