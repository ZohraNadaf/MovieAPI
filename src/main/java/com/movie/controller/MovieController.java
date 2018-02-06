package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.movie.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService serviceObj;
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public ModelAndView showMovieList(ModelMap model) {
		model.addAttribute("movies", serviceObj.readMovies());
		return new ModelAndView("movieList");
	}
	
	@RequestMapping(value = "/addMovie", method = RequestMethod.GET)
	public ModelAndView showAddMovie() {
		return new ModelAndView("addMovie");
	}
	
	@RequestMapping(value = "/addMovie", method = RequestMethod.POST)
	public ModelAndView addMovie(ModelMap model,@RequestParam String id, @RequestParam String title, @RequestParam String director){
		serviceObj.createMovie(id,title,director);
		model.addAttribute("movies", serviceObj.readMovies());
		return new ModelAndView("movieList");
	}
	
	@RequestMapping(value = "/updateMovie", method = RequestMethod.GET)
	public ModelAndView showUpdateMovie() {
		return new ModelAndView("updateMovie");
	}
	
	@RequestMapping(value = "/updateMovie", method = RequestMethod.POST)
	public ModelAndView showUpdateMovie(ModelMap model,@RequestParam String id,@RequestParam String title, @RequestParam String director) {
		serviceObj.updateMovie(id,title,director);
		model.addAttribute("movies", serviceObj.readMovies());
		return new ModelAndView("movieList");
	}
	
	@RequestMapping(value = "/deleteMovie", method = RequestMethod.GET)
	public ModelAndView showDeleteMovie() {
		return new ModelAndView("deleteMovie");
	}
	
	@RequestMapping(value = "/deleteMovie", method = RequestMethod.POST)
	public ModelAndView showDeleteMovie(ModelMap model,@RequestParam String id) {
		serviceObj.deleteMovie(id);
		model.addAttribute("movies", serviceObj.readMovies());
		return new ModelAndView("movieList");
	}
}
