package com.zixiangz.apprentic.domain;

import com.zixiangz.apprentic.utils.Identifiable;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zixiangzhu on 5/17/17.
 */
@Entity
@Table(name = "ARTWORK")
public class ArtWork implements Serializable, Identifiable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FileType type;

    @Override
    public Long getId() {
        return id;
    }
}
