package repositories;

import interfaces.Part;

import java.util.HashMap;

/**
 * Created by PC2 on 9/12/2016.
 */
public class PartRepositoryImpl {

    private HashMap<Part, Integer> PartsQuantity;

    public PartRepositoryImpl() {
        this.PartsQuantity = new HashMap<Part, Integer>();
    }

    public void addBoard (Part part){
        if (!PartsQuantity.containsKey(part)) {
            PartsQuantity.put(part,1);
        } else {
            PartsQuantity.put(part, PartsQuantity.get(part)+1);
        }
    }

    public void getPartList(){
        for (Part part : PartsQuantity.keySet()) {
            System.out.println(part.toString()+" - "+this.PartsQuantity.get(part));
        }
    }
}
