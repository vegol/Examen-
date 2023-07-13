package com.vexamen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vexamen.entity.HuEmpls;
import com.vexamen.implement.HuEmplsImplement;

@RestController
@RequestMapping("employees/")
public class HuEmplsController {

    @Autowired
    HuEmplsImplement service;

    @GetMapping("buscar-por-cia/{id}")
    public ResponseEntity<List<HuEmpls>> buscarPorCia(@PathVariable int id) {
        List<HuEmpls> objeto = service.buscarPorCia(id);
        if (!objeto.isEmpty()) {
            return new ResponseEntity<List<HuEmpls>>(objeto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("buscar-por-cia-emp/{cia}/emp/{emp}")
    public ResponseEntity<List<HuEmpls>> buscarPorCiaEmp(@PathVariable int cia, @PathVariable int emp) {
        List<HuEmpls> objeto = service.buscarPorCiaEmpl(cia, emp);
        if (!objeto.isEmpty()) {
            return new ResponseEntity<List<HuEmpls>>(objeto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}