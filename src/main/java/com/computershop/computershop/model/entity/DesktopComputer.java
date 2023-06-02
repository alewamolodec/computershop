package com.computershop.computershop.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "desktop_computer")
public class DesktopComputer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "series")
    private Long series;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private Double price;
    @Column(name = "count")
    private Long count;
    @Column(name = "category")
    private String category;
}
