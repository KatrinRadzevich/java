package org.example.JavaFinalProject.service;

import org.example.JavaFinalProject.model.PopularToys;
import org.example.JavaFinalProject.model.RareToys;
import org.example.JavaFinalProject.model.Toys;
import org.example.JavaFinalProject.model.Type;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private List<Toys> toyList = new ArrayList<>();
    private List<RareToys> rareToyList = new ArrayList<>();
    private List<PopularToys> popularToyList = new ArrayList<>();

    @Override
    public void create(Type type, Integer toyId, String toyName, Integer toyQuantity, Double toyWeight) {
        int id = getFreeId(type);
        if (Type.RARE == type) {
            RareToys rareToy = new RareToys(id, toyName, 50, toyWeight);
            toyList.add(rareToy);
            rareToyList.add(rareToy);
        }
        if (Type.POPULAR == type) {
            PopularToys popularToy = new PopularToys(id, toyName, 500, toyWeight);
            toyList.add(popularToy);
            popularToyList.add(popularToy);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isRare = Type.RARE == type;
        for (Toys toys : toyList) {
            if (toys instanceof PopularToys && !isRare) {
                lastId++;
            }
            if (toys instanceof RareToys && isRare) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<Toys> readAllToys() {
        return toyList;
    }

    @Override
    public List<RareToys> readOnlyRareToys() {
        return rareToyList;
    }

    @Override
    public List<PopularToys> readOnlyPopularToys() {
        return popularToyList;
    }
}
