package com.skilledge.Models;

import jakarta.validation.constraints.NotEmpty;

public class TrainingCard2Dto {
	
	
    @NotEmpty(message="the list is requried")

	private String TrainingCardslist;

	public String getTrainingCardslist() {
		return TrainingCardslist;
	}

	public void setTrainingCardslist(String trainingCardslist) {
		TrainingCardslist = trainingCardslist;
	}
	
	

}
