public enum LogLevel {
    UNKNOWN("unknown", 0),
    TRACE("trace", 1),
    DEBUG("debug", 2),
    INFO("info", 4),
    WARNING("warning", 5),
    ERROR("error", 6),
    FATAL("fatal", 42);

    private final String label;
    private final int level;

    LogLevel(String label, int level) {
        this.label = label;
        this.level = level;
    }

    public String getLabel() {
        return label;
    }

    public int getLevel() {
        return level;
    }
}