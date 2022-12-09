package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet o) {
        return super.save(o.getId(), o);
    }

    @Override
    public void delete(Pet o) {
        super.delete(o);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
