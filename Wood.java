public enum Wood {
    CEDAR,ALDER,MAHOGANY;

    public String toString(){
        switch (this){
            case ALDER:
                return "Alder";
            case CEDAR:
                return "Cedar";
            case MAHOGANY:
                return "Mahogany";
            default:
                return null;
        }
    }
}
