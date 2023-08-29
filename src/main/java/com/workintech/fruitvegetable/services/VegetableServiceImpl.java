package com.workintech.fruitvegetable.services;

import com.workintech.fruitvegetable.dao.VegetableRepository;
import com.workintech.fruitvegetable.entity.Vegetable;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImpl implements VegetableService{
    private VegetableRepository vegetableRepository;
    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public List<Vegetable> findAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public List<Vegetable> findAllByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }

    @Override
    public List<Vegetable> findAllByPriceAsc() {
        return vegetableRepository.getByPriceAsc();
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public Vegetable find(int id) {
        Optional<Vegetable> vegetableOptional = vegetableRepository.findById(id);
        if (vegetableOptional.isPresent()){
            return vegetableOptional.get();
        }
        return null;
    }
    @Transactional
    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }
    @Transactional
    @Override
    public void delete(Vegetable vegetable) {
         vegetableRepository.delete(vegetable);
    }
}
