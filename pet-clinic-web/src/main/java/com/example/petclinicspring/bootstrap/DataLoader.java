package com.example.petclinicspring.bootstrap;

import com.example.petclinicspring.model.Owner;
import com.example.petclinicspring.model.Vet;
import com.example.petclinicspring.service.OwnerService;
import com.example.petclinicspring.service.VetService;
import com.example.petclinicspring.service.map.OwnerServiceMap;
import com.example.petclinicspring.service.map.VetServiceMap;
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

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Andy");
        owner1.setLastName("Wang");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jack");
        owner2.setLastName("Chan");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Fan");
        vet1.setLastName("Wu");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Howei");
        vet2.setLastName("Liu");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
