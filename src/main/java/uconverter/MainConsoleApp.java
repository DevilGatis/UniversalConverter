package uconverter;

import asg.cliche.ShellFactory;
import uconverter.converters.core.UniversalConverter;

import java.io.IOException;

public class MainConsoleApp {

    public static void main(String[] args) throws IOException {
        ShellFactory
                .createConsoleShell("hello", "This is Universal Converter", new UniversalConverter())
                .commandLoop();
    }

}
