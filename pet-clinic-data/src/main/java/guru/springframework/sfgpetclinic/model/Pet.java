package guru.springframework.sfgpetclinic.model;


import java.time.LocalDate;

public class Pet extends BaseEntity {
    
    private PetType petType;
    private Owner owner;
    private LocalDate birthdate;


    public PetType getPetType() {
        return this.petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    
}
