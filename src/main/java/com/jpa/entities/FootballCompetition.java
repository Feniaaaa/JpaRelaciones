package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FootballCompetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "quantity_price")
    private int quantityPrice;

    @Column(name = "star_date", columnDefinition = "DATE")
    private LocalDate starDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    //@ManyToMany(targetEntity = Club.class, fetch = FetchType.LAZY)
    //private List<Club> clubList;
}
