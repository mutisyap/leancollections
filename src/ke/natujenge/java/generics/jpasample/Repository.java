package ke.natujenge.java.generics.jpasample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Persistence: To save stuff for long terms use.
 * Query: Retrieve the persisted data.
 * Java Persistence API helps us avoid doing too much
 */
public class Repository<OBJECT, ID> {
    Map<ID, OBJECT> dataStore = new HashMap<>();

    public void saveObject(ID id, OBJECT object){
        dataStore.put(id, object);
    }

    public List<OBJECT> getAll(){
        return new ArrayList<>(dataStore.values());
    }

    public OBJECT findById(ID id){
        return dataStore.get(id);
    }
}
