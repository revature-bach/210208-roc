package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.exception.AccountNotFoundException;
import com.revature.models.Account;
import com.revature.services.AccountService;

public class AccountServlet extends HttpServlet {

	public AccountService as;
	
	public AccountServlet() {
		as = new AccountService();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String URI = request.getRequestURI();
		URI = URI.replace("/ServletDemo/account", "");
		
		// /ServletDemo/account 
		// ""
		
		// /ServletDemo/account/1
		// /1
		ObjectMapper om = new ObjectMapper();
		PrintWriter writer = response.getWriter();
		if (URI.contains("/")) {
			URI = URI.replace("/", "");
			
			int id = Integer.parseInt(URI);
			Account account;
			try {
				account = as.getAccountById(id);
				writer.append(om.writeValueAsString(account));
				response.setStatus(200);
				response.setContentType("application/json");
			} catch (AccountNotFoundException e) {
				response.setStatus(404);
			}
			
		} else {
			List<Account> accounts = as.getAllAccounts();
			
			writer.append(om.writeValueAsString(accounts));
			response.setStatus(200);
			response.setContentType("application/json");
		}
		
	}
	
}
