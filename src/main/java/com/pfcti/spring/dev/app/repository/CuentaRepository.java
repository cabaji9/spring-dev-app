package com.pfcti.spring.dev.app.repository;

import com.pfcti.spring.dev.app.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>, JpaSpecificationExecutor<Cuenta> {
    void deleteAllByCliente_Id(int clienteId);
}
