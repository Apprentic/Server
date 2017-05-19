package com.zixiangz.apprentic.domain.personInfo;

import com.zixiangz.apprentic.domain.Resume;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

/**
 * Created by zixiangzhu on 5/18/17.
 */
@Entity
@Table(name = "EDUCATION")
public class Education {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "SCHOOL", nullable = true)
    private String school;

    @Enumerated(EnumType.STRING)
    private Degree degree;

    @Column(name = "GPA", nullable = true)
    private double gpa;

}
