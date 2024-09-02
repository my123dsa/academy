package dev.spring.project5.bank.util;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
public class BankStatementReader {
    private final String RESOURCES = "src/main/resources/";

    public List<String> getAllList(String path) throws IOException {

        List<String> list = Files.readAllLines(Path.of(RESOURCES + path));
        return list;
    }
}
