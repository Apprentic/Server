package com.zixiangz.apprentic.domain;

import com.zixiangz.apprentic.domain.personInfo.Education;
import com.zixiangz.apprentic.domain.personInfo.Experience;
import com.zixiangz.apprentic.utils.Identifiable;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by zixiangzhu on 5/17/17.
 */
@Entity
@Table(name = "RESUME")
public class Resume implements Serializable, Identifiable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @OneToMany
    @JoinColumn(name = "FK_EDUCATION")
    private List<Education> educations;

    @ElementCollection
    @JoinTable(name = "SKILL")
    private List<String> skills;

    @OneToMany
    @JoinColumn(name = "FK_EXPERIENCE")
    private List<Experience> experiences;

    @Override
    public Long getId() {
        return id;
    }
}
