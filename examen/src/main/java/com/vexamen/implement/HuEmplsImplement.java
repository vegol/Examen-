package com.vexamen.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vexamen.entity.HuEmpls;
import com.vexamen.repository.HuEmplsRepository;
import com.vexamen.service.HuEmplsService;

@Service
public class HuEmplsImplement implements HuEmplsService {

    @Autowired
    HuEmplsRepository dao;

    @Override
    public List<HuEmpls> buscarPorCia(int cia) {
        return dao.buscarPorCia(cia);
    }

    @Override
    public Optional<HuEmpls> buscarPorEmpl(int emp) {
        return dao.buscarPorEmpl(emp);
    }

    @Override
    public List<HuEmpls> buscarPorCiaEmpl(int cia, int emp) {
        return dao.buscarPorCiaEmpl(cia, emp);
    }
}