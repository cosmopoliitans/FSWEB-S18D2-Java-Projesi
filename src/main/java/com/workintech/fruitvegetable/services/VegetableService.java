package com.workintech.fruitvegetable.services;

import com.workintech.fruitvegetable.entity.Fruit;
import com.workintech.fruitvegetable.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> findAll();
    List<Vegetable> findAllByPriceDesc();
    List<Vegetable> findAllByPriceAsc();
    List<Vegetable> searchByName(String name);
    Vegetable find(int id);
    Vegetable save(Vegetable vegetable);
    void delete(Vegetable vegetable);
}
