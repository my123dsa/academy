package dev.spring.project5.bank.service;

import dev.spring.project5.bank.parser.BankStatementCSVParser;
import dev.spring.project5.bank.parser.BankStatementParser;
import dev.spring.project5.bank.parser.BankStatementTSVParser;

import org.springframework.stereotype.Component;

@Component
public class BankStatementParserFactory {

    public BankStatementParser getParser(String fileName) {
        if (fileName.endsWith(".csv")) {
            return new BankStatementCSVParser();
        } else if (fileName.endsWith(".txt")) {
            return new BankStatementTSVParser();
        } else {
            throw new IllegalArgumentException("Unsupported file format: " + fileName);
        }
    }
}
