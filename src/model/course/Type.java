package model.course;

public enum Type {

    MAJOR, LIBERAL_ARTS, GENERAL;

    public static Type fromString(String input) {
        return isMatchingType(input);
    }

    private static Type isMatchingType(String input) {
        for (Type type : Type.values()) {
            if (type.name().equalsIgnoreCase(input)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid type: " + input);
    }
}