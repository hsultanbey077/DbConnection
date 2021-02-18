package com.company.controllers;

import com.company.entities.Train;
import com.company.entities.User;
import com.company.repositories.interfaces.ILokoRepo;
import com.company.repositories.interfaces.ITrainRepo;

import java.util.List;

public class TrainController {

    private final ITrainRepo trainRepo;
    private final ILokoRepo lokoRepo;


    public TrainController(ITrainRepo trainRepo, ILokoRepo lokoRepo) {

        this.trainRepo = trainRepo;
        this.lokoRepo =lokoRepo;
    }

    public String createTrain(Train train) {
        Train trains = new Train(train);

        boolean created = trainRepo.createTrain(train);

        return (created ? "User was created!" : "User creation was failed!");
    }

    public String getTrain(int id) {
        Train train = trainRepo.getTrain(id);

        return (train == null ? "User was not found!" : train.toString());
    }

    public String getAllTrains() {
        List<Train> trains = trainRepo.getAllTrains();

        return trains.toString();
    }
}
