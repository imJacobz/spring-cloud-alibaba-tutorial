package com.jacobz.nxauto.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    @Serial
    private static final long serialVersionUID = -2797392846013528597L;
    private int id;
    private String name;
    private String city;
}
