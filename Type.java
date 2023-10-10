public enum Type {

    ELECTRIC, ACOUSTIC;

    public String toString(){
        switch (this){
            case ACOUSTIC: return "Acoustic";
            case ELECTRIC: return "Electric";
        }
        return null;
    }
}
