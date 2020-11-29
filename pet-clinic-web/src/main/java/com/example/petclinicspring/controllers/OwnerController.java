package com.example.petclinicspring.controllers;

import com.example.petclinicspring.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.controllers
 * @date 2020/11/25 下午 01:06
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
