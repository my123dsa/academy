package dev.spring.project5.bank.controller;


import dev.spring.project4.step02.BeanConfig;
import dev.spring.project5.bank.config.Config;
import dev.spring.project5.bank.model.BankTransaction;
import dev.spring.project5.bank.parser.BankStatementCSVParser;
import dev.spring.project5.bank.parser.BankStatementParser;
import dev.spring.project5.bank.parser.BankStatementTSVParser;
import dev.spring.project5.bank.service.BankStatementParserFactory;
import dev.spring.project5.bank.service.BankStatementProcessor;
import dev.spring.project5.bank.util.BankStatementReader;
import dev.spring.project5.bank.view.Output;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.Month;
import java.util.List;

@Component
//@RequiredArgsConstructor
public class BankStatementAnalyzerSimple {

	private final BankStatementReader bankStatementReader;

	private final Output output;

	private final BankStatementProcessor bankStatementProcessor;

	private BankStatementParser bankStatementParser;

	private final BankStatementParserFactory bankStatementParserFactory;

//@RequiredArgsConstructor

	@Autowired
	public BankStatementAnalyzerSimple(BankStatementReader bankStatementReader,
									   Output output,
									   BankStatementProcessor bankStatementProcessor,
									   BankStatementParserFactory bankStatementParserFactory) {
		this.bankStatementReader = bankStatementReader;
		this.output = output;
		this.bankStatementProcessor = bankStatementProcessor;
		this.bankStatementParserFactory = bankStatementParserFactory;
	}

	public void run(String path) {
		try {
			List<String> list=  bankStatementReader.getAllList(path);
			if (list.isEmpty()) {
				output.print("입출력 없음");
				return;
			}
			bankStatementParser=bankStatementParserFactory.getParser(path);

			List<BankTransaction> lists= bankStatementParser.parseLineFrom(list);

			bankStatementProcessor.setLists(lists);

			output.print(bankStatementProcessor.findTransactionsInMonth(Month.JANUARY));
			output.print(bankStatementProcessor.findTransactionsInCategory("Pizza"));
			output.print(bankStatementProcessor.totalIn());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




//long sum = list.stream().mapToLong(item -> {
////String[] parts = item.split(",");
////LocalDate dateTime= LocalDate.parse(parts[0],DATE_PATTERN);
//BankTransaction bankTransaction= new BankTransaction(item);
//return bankTransaction.getLocaldate().getMonth() == Month.JANUARY ? bankTransaction.getInputCost() : 0;
//}).sum();
//return sum;

//long total =list.stream().mapToLong(item->{
////return Long.parseLong(item.split(",")[2]);
//return new BankTransaction(item).getInputCost();
//}).sum();
//return total;


//static long findTransactionsInJanuary(List<BankTransaction> lists) {
//return lists.stream().mapToLong(bankTransaction->
//	bankTransaction.getLocaldate().getMonth() == Month.JANUARY ? bankTransaction.getInputCost() : 0
//).sum();
//}
//
//static long totalInput(List<BankTransaction> lists) {
//return lists.stream().mapToLong(bankTransaction-> bankTransaction.getInputCost()).sum();
//}
//
