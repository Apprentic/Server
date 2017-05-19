package com.zixiangz.apprentic.domain;

import com.zixiangz.apprentic.utils.Identifiable;
import org.hibernate.search.annotations.Latitude;
import org.hibernate.search.annotations.Longitude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zixiangzhu on 5/17/17.
 */
@Entity
@Table(name = "USER")
public class User implements Serializable, Identifiable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "FIRST_NAME", nullable = true)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = true)
    private String lastName;

    @Column(name = "DOB", nullable = false)
    private Date dob;

    @Latitude
    @Column(name = "LATITUDE", nullable = false)
    private Double latitude;

    @Longitude
    @Column(name = "LONGITUDE", nullable = false)
    private Double longitude;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Portfolio portfolio;

    protected User() {}

    @Override
    public Long getId() {
        return id;
    }
}
