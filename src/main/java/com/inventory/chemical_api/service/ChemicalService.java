package com.inventory.chemical_api.service;

import com.inventory.chemical_api.model.Chemical;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChemicalService {

    private List<Chemical> chemicals = new ArrayList<>();

    public ChemicalService() {
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

    public List<Chemical> getAllChemicals() {
        return chemicals;
    }

    public Chemical addChemical(Chemical chemical) {
        chemicals.add(chemical);
        return chemical;
    }

    public boolean deleteChemical(int id) {
        return chemicals.removeIf(c -> c.getId() == id);
    }
}
