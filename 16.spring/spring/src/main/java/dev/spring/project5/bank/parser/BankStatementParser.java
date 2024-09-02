package dev.spring.project5.bank.parser;


import dev.spring.project5.bank.model.BankTransaction;

import java.util.List;

public interface BankStatementParser {

    List<BankTransaction> parseLineFrom(List<String> list);

}
