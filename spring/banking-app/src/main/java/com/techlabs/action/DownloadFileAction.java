package com.techlabs.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Transaction;
import com.techlabs.service.AccountService;

public class DownloadFileAction {
	@Autowired
	private AccountService service;
	
	public void execute() throws Exception {

		HttpServletResponse response = ServletActionContext.getResponse();
		try {
			response.setContentType("text/csv");
			String reportName = "transactions.csv";
			response.setHeader("Content-disposition", "attachment;filename=" + reportName);

			
			String CSV = "ID, Amount, Type, Date\n";
			
			for(Transaction t : service.getTransactions()) {
				CSV += t.getTransId() + ", " + t.getAmount() + ", " 
						+ t.getType() + ", " + t.getDate() + "\n";
			}

			response.getOutputStream().print(CSV);
			response.getOutputStream().flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
