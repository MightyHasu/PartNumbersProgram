package io;

import interfaces.Writer;

/**
 * Created by PC2 on 9/6/2016.
 */
public class ConsoleWriter implements Writer {

    @SuppressWarnings("supressWarning")
    public ConsoleWriter() {
    }

    public void writeLine(String message) {
        System.out.println(message);
    }
}
