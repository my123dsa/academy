package dev.spring.project5.bank.parser;


import dev.spring.project5.bank.model.BankTransaction;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Component
@Qualifier(value = "CSVParser")
public class BankStatementCSVParser implements BankStatementParser{

	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	@Override
	public List<BankTransaction> parseLineFrom(List<String> list){
		
		List<BankTransaction> bankTransactions= new ArrayList<>();
		
		for(String line :list) {
			String[] col = line.split(",");
			LocalDate date = LocalDate.parse(col[0], DATE_PATTERN);
			String correspondent = col[1];
			long inputCost = Long.parseLong(col[2]);
			BankTransaction bankTransaction = new BankTransaction(date, inputCost, correspondent);
			bankTransactions.add(bankTransaction);
		}
		return bankTransactions;
	}
}
