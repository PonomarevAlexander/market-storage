package ru.ponomarev.marketstorage.application.core.models.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Ident {

    @Id
    @GeneratedValue()
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private LocalDateTime manufacturedDate;
}
