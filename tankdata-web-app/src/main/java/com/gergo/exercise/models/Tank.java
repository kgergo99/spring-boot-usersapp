package com.gergo.exercise.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tank {
    private String name;
    private TankType type;
    private double weightTons;
    private double armorThicknessMm;
    private double mainGunCaliberMm;
    private Manufacturer manufacturer;
    private Country country;
    private int productionStart;
    private int productionEnd;
}
