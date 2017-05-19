package com.zixiangz.apprentic.domain;

import com.zixiangz.apprentic.utils.Identifiable;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by zixiangzhu on 5/17/17.
 */
@Entity
@Table(name = "GROUP")
public class Group implements Serializable, Identifiable<Long> {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }
}
