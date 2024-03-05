package ru.ponomarev.marketstorage.application.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.ponomarev.marketstorage.application.core.models.common.Ident;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Belongings extends Ident {
        @Column
        private String color;
}
