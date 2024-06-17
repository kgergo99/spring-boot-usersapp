package com.gergo.exercise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tank {
    private long id;
    private String name;
    private TankType type;
    private double weightTons;
    private double armorThicknessMm;
    private double mainGunCaliberMm;
    private Manufacturer manufacturer;
    private Country country;
    private int productionYearStart;
    private int productionYearEnd;
}
