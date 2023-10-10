public enum Builder {

    FENDER, GIBSON,COLLINS;

    public String toString(){
        switch (this) {
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case COLLINS: return "Collins";

        }
        return null;
    }
}
