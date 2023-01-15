package com.myproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genreList")
    @JsonIgnore
    private List<Movie> movieList;


}
