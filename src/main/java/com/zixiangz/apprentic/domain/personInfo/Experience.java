package com.zixiangz.apprentic.domain.personInfo;

import com.zixiangz.apprentic.domain.Resume;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zixiangzhu on 5/18/17.
 */
@Entity
@Table(name = "EXPERIENCE")
public class Experience {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "LOCATION", nullable = false)
    private String location;

    @Column(name = "POSITION", nullable = false)
    private String position;

    @Column(name = "START_DATE", nullable = false)
    private Date startDate;

    @Column(name = "END_DATE", nullable = false)
    private Date endDate;

    @Column(name = "CONTENT", nullable = false)
    private String content;
}
