package com.liroa.budget.entity.budget;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Budget")
@Table(name = "budgets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idBudget")
public class Budget {

    @Id
    @Column(name = "id_budget")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBudget;
    private LocalDate day;
    private double amount;
    private String description;



}
