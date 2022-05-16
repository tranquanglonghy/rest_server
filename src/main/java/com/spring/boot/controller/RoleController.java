package com.spring.boot.controller;

import com.spring.boot.response.RolePermissionResponse;
import com.spring.boot.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.Arrays;


@RestController
@AllArgsConstructor
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public RolePermissionResponse GetHome(Model theModel) throws NoSuchFieldException, IllegalAccessException {
        RolePermissionResponse resp =  roleService.getRoleById((long)1);
        Class<RolePermissionResponse> test = RolePermissionResponse.class;
        Field[] fields = test.getFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));
        return  resp;
    }
}
