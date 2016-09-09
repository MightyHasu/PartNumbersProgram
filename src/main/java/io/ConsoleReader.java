package io;

import interfaces.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PC2 on 9/6/2016.
 */
public class ConsoleReader implements Reader{

    private BufferedReader reader;

    private ConsoleReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));;
    }

    public String readLine() throws IOException {
    return this.reader.readLine();
    }
}
