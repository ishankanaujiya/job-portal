package com.job_portal.job_portal.service.impl;

import com.job_portal.job_portal.model.Admin;
import com.job_portal.job_portal.model.Employee;
import com.job_portal.job_portal.model.LoginInfo;
import com.job_portal.job_portal.repository.AdminRepository;
import com.job_portal.job_portal.repository.EmployeeRepository;
import com.job_portal.job_portal.repository.LoginInfoRepository;
import com.job_portal.job_portal.service.AdminService;
import com.job_portal.job_portal.service.LoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginInfoServiceImpl implements LoginInfoService
{
    @Autowired
    private LoginInfoRepository loginInfoRepository;


    @Override
    public LoginInfo add(LoginInfo loginInfo) {
        return loginInfoRepository.save(loginInfo);
    }

    @Override
    public void delete(int id) {
        getById(id);
        loginInfoRepository.deleteById(id);
    }

    @Override
    public void getById(int id) {
        Optional<LoginInfo> optionalUser = loginInfoRepository.findById(id);
        optionalUser.orElseThrow((() -> new RuntimeException("User not Found")));

    }

    @Override
    public List<LoginInfo> getAll() {
        return loginInfoRepository.findAll();
    }
}
