package com.myapp.expenseapp.service;

import java.util.List;

import com.myapp.expenseapp.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();

	Expense findById(long id);
	
	void delete(long id);

	Expense save(Expense expense);
}