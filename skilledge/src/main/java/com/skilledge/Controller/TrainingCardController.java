package com.skilledge.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilledge.Models.TrainingCard1;
import com.skilledge.Models.TrainingCard1Dto;
import com.skilledge.Services.TrainingCard1Repository;

@Controller
@RequestMapping("/TrainingCards")
public class TrainingCardController {

	@Autowired
	private TrainingCard1Repository TrainingRepo;
	
	
	@GetMapping("/display")
	private String cards(Model model) {
		List<TrainingCard1> trainingcards=TrainingRepo.findAll();
		model.addAttribute("Training1",trainingcards);
		return "trainingcards/TrainingCardsDisplay";
	}
	
	@GetMapping("/create")
	   private String trainingcardsdto(Model model) {
		TrainingCard1Dto dt=new TrainingCard1Dto();
		model.addAttribute("tainingcardsDto",dt);
		
		return "TrainingCard/create";
	}
}
