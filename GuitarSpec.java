public class GuitarSpec extends InstrumentSpec {
    private NumStrings numStrings;


    public GuitarSpec(Builder builder, String model, Type type, NumStrings numStrings, Wood backWood, Wood topWood, NumStrings numStrings1) {
        super(builder, model, type, numStrings, backWood, topWood);
        this.numStrings = numStrings1;
    }

    public NumStrings getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (numStrings != otherSpec.numStrings)
            return false;
        return true;

    }




}
