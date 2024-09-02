package dev.spring.project5.bank.service;


import dev.spring.project5.bank.model.BankTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Month;
import java.util.List;

@Component
public class BankStatementProcessor {

	private List<BankTransaction> lists;

	@Autowired
	public BankStatementProcessor(List<BankTransaction> lists) {
		this.lists = lists;
	}

	public long findTransactionsInMonth(Month month) {
		return lists.stream()
				.filter(bankTransaction-> bankTransaction.getLocaldate().getMonth().equals(month))
				.mapToLong(BankTransaction::getInputCost).sum();
	}
	public long findTransactionsInCategory(String category) {
		return lists.stream()
				.filter(bankTransaction -> bankTransaction.getCorrespondent().equals(category))
				.mapToLong(BankTransaction::getInputCost)
				.sum();
	}
	public long totalIn() {
		return lists.stream()
				.mapToLong(bankTransaction-> bankTransaction.getInputCost())
				.sum();
	}

	public void setLists(List<BankTransaction> lists) {
		this.lists = lists;
	}
}
