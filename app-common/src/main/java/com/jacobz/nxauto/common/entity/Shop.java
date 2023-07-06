package com.jacobz.nxauto.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop implements Serializable {
    @Serial
    private static final long serialVersionUID = -2532308030938355926L;
    private int id;
    private String name;
    private String city;
}
