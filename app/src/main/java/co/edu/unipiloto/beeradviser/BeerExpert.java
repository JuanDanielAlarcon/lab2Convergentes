package co.edu.unipiloto.beeradviser;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    List<String> getBrands (String Sabor){
        List<String> brands = new ArrayList<>();
        if(Sabor.equals("Tostado")){
            brands.add("Crisp Malting");
            brands.add("Roasted");
        }else if (Sabor.equals("Malta")){
            brands.add("Munich");
            brands.add("Viena");
        }else if (Sabor.equals("Acaramelado")){
            brands.add("Caramel 40");
            brands.add("Caramel 60  ");
        }else if (Sabor.equals("Nuez")){
            brands.add("Special B");
        }else if (Sabor.equals("Chocolate")){
            brands.add("Best Malz Black 1000");
            brands.add("Crisp Malting Chocolate");
        }else if (Sabor.equals("Caffe")){
            brands.add("Roast Barley");
        }else if (Sabor.equals("Ahumados")){
            brands.add("Best Malz Smoked");
        }else if (Sabor.equals("Herbales")){
            brands.add("Tettnanger");
            brands.add("Saaz");
        }else if (Sabor.equals("Citricos")){
            brands.add("Palisade");
            brands.add("Hall. Saphir");
        }else{
            brands.add("Nothig to show");
        }
        return brands;
    }
}

