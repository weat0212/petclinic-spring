package com.example.petclinicspring.bootstrap;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.model.Pet;
import com.example.petclinicspring.model.PetType;
import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.service.OwnerService;
import com.example.petclinicspring.service.PetTypeService;
import com.example.petclinicspring.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setAddress("Banqiao Dist");
        owner1.setCity("New Taipei");
        owner1.setTelephone("0912345678");

        Pet andysPet = new Pet();
        andysPet.setName("Mickey");
        andysPet.setPetType(savedDogPetType);
        andysPet.setOwner(owner1);
        andysPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(andysPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jack");
        owner2.setLastName("Chan");
        owner2.setAddress("Xin-Yi Dist");
        owner2.setCity("Keelung");
        owner2.setTelephone("0987654321");

        Pet jacksPet = new Pet();
        jacksPet.setName("Wozi");
        jacksPet.setPetType(savedCatPetType);
        jacksPet.setOwner(owner2);
        jacksPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(jacksPet);

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
