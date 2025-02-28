package com.dfm.boot.example.controllers.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.List;

/**
 * 通用分页结果对象 包含total和list，删除前端无用的page、pageSize等，并采用链式set方便组装
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class BasePage<T> {
    private long total;
    private List<T> list;

    public static BasePage emptyPage (long total) {
        return new BasePage<>(total, Collections.emptyList());
    }
}
