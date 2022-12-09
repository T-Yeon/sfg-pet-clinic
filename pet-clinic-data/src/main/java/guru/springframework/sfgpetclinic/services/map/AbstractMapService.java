package guru.springframework.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import guru.springframework.sfgpetclinic.model.BaseEntity;


public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T o) {
        if(o != null) {
            if (o.getId() == null) {
                o.setId(getNextId());
            }
            map.put(o.getId(), o);
        } else {
            throw new RuntimeException("object cannot be null");
        }
        return o;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T o) {
        map.entrySet().removeIf(i -> i.getValue().equals(o));
    }

    private Long getNextId() {

        return map.isEmpty() ? 1L : Collections.max(map.keySet()) + 1L;

    }

}
