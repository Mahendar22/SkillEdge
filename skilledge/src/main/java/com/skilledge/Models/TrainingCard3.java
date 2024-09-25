package com.skilledge.Models;

import jakarta.persistence.*;

@Entity
@Table(name="TrainingCard3")
public class TrainingCard3 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String TrainingCardslist;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTrainingCardslist() {
		return TrainingCardslist;
	}
	public void setTrainingCardslist(String trainingCardslist) {
		TrainingCardslist = trainingCardslist;
	}
	public TrainingCard3(long id, String trainingCardslist) {
		super();
		Id = id;
		TrainingCardslist = trainingCardslist;
	}
	public TrainingCard3() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TrainingCard3 [Id=" + Id + ", TrainingCardslist=" + TrainingCardslist + "]";
	}
	
	

}
