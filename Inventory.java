import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }


    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSpec().matches(searchSpec)){
                GuitarSpec guitarSpec = guitar.getSpec();
            }
            matchingGuitars.add(guitar);

        }

        return matchingGuitars;
    }

    //public Guitar search(Guitar searchGuitar) {

       // List matchingGuitars = new LinkedList();
       // for (Iterator i = guitars.iterator(); i.hasNext(); ) {
          //  Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique and ignore price since it is irrelevant

           // String builder = searchGuitar.getBuilder();
           // if((builder !=null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
           //     continue;

           // String model = searchGuitar.getModel();
          //  if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
           //     continue;

            //String type = searchGuitar.getType();
           // if ((type != null) && (!searchGuitar.equals("")) && (!type.equals(guitar.getType())))
           //     continue;

          //  String backWood = searchGuitar.getBackwood();
           // if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackwood())))
          //      continue;
           // String topWood = searchGuitar.getBackwood();
           // if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopwood())))
           //     continue;
           // matchingGuitars.add(guitar);
       // }
       // return matchingGuitars;
    }