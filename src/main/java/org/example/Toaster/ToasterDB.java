package org.example.Toaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ToasterDB {
    private HashMap<Integer, Toaster> data = new HashMap<>();
    private int activeID = 1;

    public ToasterDB(){
        addToaster(new Toaster(
                "Tesla", 22500000000L
        ));
        addToaster(new Toaster(
                "Apple", 100
        ));
        addToaster(new Toaster(
                "Cartoon Network", 1200
        ));
    }

    public int getLength() {
        return data.size();
    }

    public Toaster getToaster(int ID){
        return data.get(ID);
    }

    public List<Toaster> getToasters(){
        return new ArrayList<>(data.values());
    }

    public Toaster addToaster(Toaster toaster){
        toaster.setID(activeID);
        data.put(activeID++, toaster);
        return toaster;
    }

    public Toaster updateToaster(Toaster toaster){
        data.replace(toaster.getID(), toaster);
        return toaster;
    }

    public Toaster deleteToaster(int ID){
        return data.remove(ID);
    }
}
