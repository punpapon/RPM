package com.rpmfood.rpm.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResponse {

    private String status;
    private Object object;
}
