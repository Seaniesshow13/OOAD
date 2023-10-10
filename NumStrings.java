public enum NumStrings {

    SIX, TWELVE;

    public String toString() {
        switch (this) {
            case SIX:
                return "Acoustic";
            case TWELVE:
                return "Electric";
        }
        return null;
    }
}
