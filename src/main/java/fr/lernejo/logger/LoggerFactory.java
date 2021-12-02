package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(Stirng name) {

        return new ConsoleLogger();

    }
}
