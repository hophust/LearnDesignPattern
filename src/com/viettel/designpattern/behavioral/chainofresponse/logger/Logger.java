package com.viettel.designpattern.behavioral.chainofresponse.logger;

public abstract class Logger {
    protected LogLevel logLevel;
    protected Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Logger setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel severity, String mgs) {
        if(logLevel.getLevel() <= severity.getLevel()) {
            writeMessage(mgs);
        }
        if(nextLogger != null) {
            nextLogger.log(severity,mgs);
        }
    }

    protected abstract void writeMessage(String msg);
}
