package com.skilledge.Models;

public class TrainingCard2Dto {
    private String TrainingCardslist;

    public String getTrainingCardslist() {
        return TrainingCardslist;
    }

    public void setTrainingCardslist(String trainingCardslist) {
        TrainingCardslist = trainingCardslist;
    }

    @Override
    public String toString() {
        return "TrainingCard2Dto{" +
                "TrainingCardslist='" + TrainingCardslist + '\'' +
                '}';
    }

}
