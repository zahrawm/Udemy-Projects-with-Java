public class LogLine {
    private final String text;

    public LogLine(String text) {
        this.text = text;
    }

    public String getMessage() {
        return text.substring(text.indexOf(": ") + 2).trim();
    }

    private String getTag() {
        return text.substring(text.indexOf('[') + 1, text.indexOf(']'));
    }

    public LogLevel getLogLevel() {
        String tag = getTag();
        switch (tag) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String reformat() {
        return getMessage() + " (" + getLogLevel().getLabel() + ")";
    }

    public String getOutputForShortLog() {
        return getLogLevel().getLevel() + ":" + getMessage();
    }
}