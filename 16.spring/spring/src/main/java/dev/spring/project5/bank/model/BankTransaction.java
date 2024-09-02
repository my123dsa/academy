package dev.spring.project5.bank.model;

import java.time.LocalDate;

public class BankTransaction {
	private LocalDate localdate;
	private Long inputCost;
	private String correspondent;
	public BankTransaction(LocalDate localdate, Long inputCost, String correspondent) {
		this.localdate = localdate;
		this.inputCost = inputCost;
		this.correspondent = correspondent;
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public Long getInputCost() {
		return inputCost;
	}
	public String getCorrespondent() {
		return correspondent;
	}
}





//public BankTransaction(String string){
//	String[] strList= string.split(",");
//	this.correspondent= strList[1];
//	this.localdate= LocalDate.parse(strList[0],DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//	this.inputCost= Long.parseLong(strList[2]);
//}