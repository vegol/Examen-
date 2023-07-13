package com.vexamen.service;

import java.util.List;
import java.util.Optional;

import com.vexamen.entity.HuEmpls;

public interface HuEmplsService {
    
    List<HuEmpls> buscarPorCia(int cia);
    List<HuEmpls> buscarPorCiaEmpl(int cia, int emp);
    Optional<HuEmpls> buscarPorEmpl(int emp);
}