package com.dfm.boot.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 1:川仪 2:国复 3:宗申 4:机电
 * @author daifengming
 */
@AllArgsConstructor
@Getter
public enum CoreEntEnums {
    CY((byte)1,"川仪"),
    GF((byte)2,"国复"),
    ZS((byte)3,"宗申"),
    JD((byte)4,"机电")

    ;
    final Byte code;
    final String entName;
}
