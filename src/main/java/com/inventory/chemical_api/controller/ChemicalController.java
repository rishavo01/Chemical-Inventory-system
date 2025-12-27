package com.inventory.chemical_api.controller;

import com.inventory.chemical_api.model.Chemical;
import com.inventory.chemical_api.service.ChemicalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChemicalController {

    private final ChemicalService chemicalService;

    public ChemicalController(ChemicalService chemicalService) {
        this.chemicalService = chemicalService;
    }

    @GetMapping("/chemicals")
    public List<Chemical> getAllChemicals() {
        return chemicalService.getAllChemicals();
    }

    @PostMapping("/chemical")
    public Chemical addChemical(@RequestBody Chemical chemical) {
        return chemicalService.addChemical(chemical);
    }

    @DeleteMapping("/chemical/{id}")
    public String deleteChemical(@PathVariable int id) {
        boolean deleted = chemicalService.deleteChemical(id);
        return deleted ? "Chemical deleted" : "Chemical not found";
    }
}
