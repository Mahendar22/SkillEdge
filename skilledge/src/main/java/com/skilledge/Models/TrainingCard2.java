package com.skilledge.Models;

import jakarta.persistence.*;

@Entity
@Table(name="TrainingCard2")
public class TrainingCard2 {
	
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
	public TrainingCard2(long id, String trainingCardslist) {
		super();
		Id = id;
		TrainingCardslist = trainingCardslist;
	}
	public TrainingCard2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TrainingCard2 [Id=" + Id + ", TrainingCardslist=" + TrainingCardslist + "]";
	}
	
	

}
