package com.dfm.boot.example.controllers.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: xinhao.hu
 * @date: 2022/6/15 10:18 上午
 * @description:
 **/
@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean success = true;
    private int code = 200;
    private String message;
    private T data;

    public Response() {
    }

    public static <T> Response<T> success(T data) {
        Response<T> response = new Response();
        response.success = true;
        response.data = data;
        response.code = 200;
        response.message = "操作成功";
        return response;
    }

    public static <T> Response<T> success(T data, String message) {
        Response<T> response = new Response();
        response.success = true;
        response.data = data;
        response.code = 200;
        response.message = message;
        return response;
    }

    public static <T> Response<T> success() {
        return success(null);
    }

    public static <T> Response<T> noData(){
        Response<T> response = new Response<>();
        response.success = false;
        response.data = null;
        response.code = 200;
        return response;
    }

    public static <T> Response<T> error(String message) {
        Response<T> response = new Response();
        response.success = false;
        response.data = null;
        response.code = -1;
        response.message = message;
        return response;
    }

    public static <T> Response<T> error(Integer status, String message) {
        Response<T> response = new Response();
        response.success = false;
        response.data = null;
        response.code = status;
        response.message = message;
        return response;
    }

    public static <T> Response<T> error(StatusCode statusCode) {
        Response<T> response = new Response();
        response.success = false;
        response.data = null;
        response.code = statusCode.getCode();
        response.message = statusCode.getMessage();
        return response;
    }

    public static <T> Response<T> error(StatusCode statusCode, String message) {
        Response<T> response = new Response();
        response.success = false;
        response.data = null;
        response.code = statusCode.getCode();
        response.message = message;
        return response;
    }

}
