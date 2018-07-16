package com.techlabs.flims;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Actor {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)", name = "actor_id", unique = true )
	private UUID actorId;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="Actors_Movies", joinColumns={@JoinColumn(referencedColumnName="actor_id")}
                                        , inverseJoinColumns={@JoinColumn(referencedColumnName="movie_id")}) 
    Set<Movies> movies = new HashSet<>();

	public UUID getActorId() {
		return actorId;
	}

	public void setActorId(UUID actorId) {
		this.actorId = actorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Movies> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movies> movies) {
		this.movies = movies;
	}

}
