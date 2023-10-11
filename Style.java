public enum Style {

    F, A;

    public String toString(){
        switch (this){
            case A: return "A";
            case F: return "F";
        }
        return null;
    }

}
