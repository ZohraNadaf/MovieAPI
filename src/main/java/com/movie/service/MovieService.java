package com.movie.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.model.Movie;

@Service
public class MovieService {
	List<Movie> movies = new ArrayList<Movie>(Arrays.asList(
			new Movie("1","Harry Potter and the Philosopher's Stone","Chris Columbus"),
			new Movie("2","Jumanji: Welcome to the Jungle","Jake Kasdan"),
			new Movie("3","Lord of the Rings: The Fellowship of the Ring","Peter Jackson")
			));
	
	public List<Movie> readMovies(){
		return movies;
	}

	public boolean createMovie(String id, String title, String director) {
		Movie movie = new Movie(id,title,director);
		for(Movie eachMovie : movies) {
			if(eachMovie.getId().equals(id)) {
				return false;
			}
		}
		movies.add(movie);
		return true;
	}

	public void updateMovie(String id,String title, String director) {
		Movie updatedMovie = new Movie(id,title,director);
		for(int i = 0;i < movies.size(); i++) {
			Movie movie = movies.get(i);
			if(movie.getId().equals(id)) {
				movies.set(i, updatedMovie);
				return;
			}	
		}
	}

	public void deleteMovie(String id) {
		for(Movie movie : movies) {
			if(movie.getId().equals(id)) {
				movies.remove(movie);
				return;
			}
		}
	}
}
