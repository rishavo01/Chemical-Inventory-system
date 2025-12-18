package com.inventory.chemical_api.controller;

import com.inventory.chemical_api.model.Chemical;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ChemicalController {


    private List<Chemical> chemicals = new ArrayList<>();


    public ChemicalController() {
        chemicals.add(new Chemical(
                1,
                "Carbon",
                "CO2",
                10,
                "kg",
                "Medium",
                LocalDate.of(2026, 7, 5)
        ));

        chemicals.add(new Chemical(
                2,
                "Sodium Chloride",
                "NaCl",
                25,
                "kg",
                "Low",
                LocalDate.of(2027, 1, 10)
        ));
    }

    // GET ALL
    @GetMapping("/chemicals")
    public List<Chemical> getAllChemicals() {
        return chemicals;
    }

    // GET ONE
    @GetMapping("/chemical")
    public Chemical getOneChemical() {
        return chemicals.get(0);
    }

    // POST
    @PostMapping("/chemical")
    public Chemical addChemical(@RequestBody Chemical chemical) {
        chemicals.add(chemical);
        return chemical;
    }
}
