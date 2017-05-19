package com.zixiangz.apprentic.domain;

import com.zixiangz.apprentic.utils.Identifiable;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zixiangzhu on 5/17/17.
 */
@Entity
@Table(name = "PORTF")
public class Portfolio implements Identifiable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @OneToMany
    @JoinColumn(name = "FK_ARTWORK")
    private List<ArtWork> artWork;
}
