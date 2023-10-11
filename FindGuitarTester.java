import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        InstrumentSpec whatLookingFor = new InstrumentSpec(Builder.GIBSON,
                "Stratocaster",
                Type.ACOUSTIC,NumStrings.TWELVE, Wood.ALDER, Wood.MAHOGANY);

        List matchingGuitars = inventory.search(whatLookingFor);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("You might like these: ");

            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Instrument guitar = (Instrument) i.next();
                InstrumentSpec spec = Instrument.getSpec();
                System.out.println("We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " Guitar: " + guitar.getPrice());
            }
        } else {
            System.out.println("Sorry, We have nothing for you");
        }
    }




    public static void initialiseInventory(Inventory inventory){
        InstrumentSpec spec = new InstrumentSpec(Builder.FENDER, "Stratocaster", Type.ACOUSTIC,NumStrings.TWELVE, Wood.ALDER, Wood.MAHOGANY);
        inventory.addGuitar("V00001",500.00, spec);

         spec = new InstrumentSpec(Builder.COLLINS,"Stratocaster",Type.ELECTRIC,NumStrings.SIX, Wood.CEDAR, Wood.CEDAR);
         inventory.addGuitar("V00002" , 1000.00, spec);

        spec = new InstrumentSpec(Builder.GIBSON,"Stratocaster",Type.ELECTRIC,NumStrings.TWELVE, Wood.MAHOGANY, Wood.CEDAR);
        inventory.addGuitar("V00003" , 1500.00, spec);
    }


}
