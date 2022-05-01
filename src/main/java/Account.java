public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }


    private boolean isSpaceOne() {
        int spaceCount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ')
                spaceCount++;
        }
        return spaceCount == 1;
    }

    public boolean checkNameToEmboss() {
        try {

            boolean isNotEmpty = !name.isEmpty();
            boolean isLengthValid = name.length() >= 3 && name.length() <= 19;
            boolean isNotEndsSpacesExist = !name.startsWith(" ") && !name.endsWith(" ");
            return isNotEmpty && isLengthValid && isNotEndsSpacesExist && isSpaceOne();

        } catch (NullPointerException exception) {
            return false;
        }
    }

}