public class MandolinSpec extends InstrumentSpec{

    private Style style;

    public MandolinSpec(Style style) {
        this.style = style;
    }

    public MandolinSpec(Builder builder, String model, Type type, NumStrings numStrings, Wood backWood, Wood topWood, Style style) {
        super(builder, model, type, numStrings, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec otherSpec) {
        if (style != otherSpec.style)
            return false;
        return true;

    }
}
