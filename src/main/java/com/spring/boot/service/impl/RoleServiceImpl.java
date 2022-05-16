package com.spring.boot.service.impl;

import com.spring.boot.response.Response;
import com.spring.boot.response.RolePermissionResponse;
import com.spring.boot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RoleServiceImpl implements RoleService {

    private RestTemplate restTemplate;

    private String roleRestUrl;

    @Autowired
    public RoleServiceImpl(RestTemplate theRestTemplate,
                                         @Value("${role.rest.url}") String theUrl) {
        restTemplate = theRestTemplate;
        roleRestUrl = theUrl;
    }

    @Override
    public RolePermissionResponse getRoleById(Long roleId) {
        String url = roleRestUrl + 1;
        System.out.println(url);
        Response resp = restTemplate.getForObject(url, Response.class);
        System.out.println(resp.getData().getRoleName());
        return resp.getData();
    }
}
