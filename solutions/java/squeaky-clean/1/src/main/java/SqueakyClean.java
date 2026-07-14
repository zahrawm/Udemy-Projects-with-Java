public class SqueakyClean {
    private static final java.util.Map<Character, Character> LEET_MAP = java.util.Map.of(
        '0', 'o',
        '1', 'l',
        '3', 'e',
        '4', 'a',
        '5', 's',
        '7', 't'
    );

    public static String clean(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;
        for (char c : input.toCharArray()) {
            char toAppend;
            if (c == '-') {
                capitalizeNext = true;
                continue;
            } else if (c == ' ') {
                toAppend = '_';
            } else if (LEET_MAP.containsKey(c)) {
                toAppend = LEET_MAP.get(c);
            } else if (Character.isLetter(c)) {
                toAppend = c;
            } else {
                continue;
            }
            result.append(capitalizeNext ? Character.toUpperCase(toAppend) : toAppend);
            capitalizeNext = false;
        }
        return result.toString();
    }
}