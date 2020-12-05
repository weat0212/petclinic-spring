package com.example.petclinicspring.bootstrap;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.model.PetType;
import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.service.OwnerService;
import com.example.petclinicspring.service.PetTypeService;
import com.example.petclinicspring.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.bootstrap
 * @date 2020/11/28 下午 03:57
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Andy");
        owner1.setLastName("Wang");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jack");
        owner2.setLastName("Chan");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Fan");
        vet1.setLastName("Wu");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Howei");
        vet2.setLastName("Liu");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
