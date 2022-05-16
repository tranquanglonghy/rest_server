package com.spring.boot.service;

import com.spring.boot.response.RolePermissionResponse;

public interface RoleService {
    RolePermissionResponse getRoleById(Long roleId);
}
