package com.mjm.student.dal.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "studenttab")
@Data
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "sname")
    private String name;
    @Column(name="scourse")
    private String course;
    @Column(name = "sfee")
    private Double fee;
}
