package com.job_portal.job_portal.service;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Employee;

public interface AdminService
{
    Admin add(Admin admin);
    Admin findByUsername(String username);
}