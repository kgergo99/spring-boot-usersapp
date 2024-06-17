package com.gergo.exercise.service;

import com.gergo.exercise.models.Country;
import com.gergo.exercise.models.Manufacturer;
import com.gergo.exercise.models.Tank;
import com.gergo.exercise.models.TankType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TankService {
    private static final List<Tank> tanks = new ArrayList<>();

    static {
        for (int i = 0; i<10; i++){
            tanks.add(new Tank(
                    i,
                    "Test tank #" + i,
                    TankType.LIGHT,
                    12.2d,
                    34d,
                    88d,
                    new Manufacturer(
                            1,
                            "Test manufacturer",
                            new Country(0, "Germany")),
                    new Country(0, "Germany"),
                    1933,
                    1944
            ));
        }
    }

    public List<Tank> getAllTanks() { return tanks; }
}
