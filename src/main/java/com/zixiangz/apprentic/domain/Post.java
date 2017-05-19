package com.zixiangz.apprentic.domain;

import com.zixiangz.apprentic.utils.Identifiable;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.time.Instant;

/**
 * Created by zixiangzhu on 5/17/17.
 */
@Entity
@Table(name = "POST")
public class Post implements Comparable<Post>, Identifiable<Long> {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TEXT", nullable = false, length = 255)
    private String text;

    @Column(name = "CREATED_AT", nullable = false)
    private Instant createdAt;

    private User owner;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public int compareTo(Post o) {
        return 0;
    }
}
