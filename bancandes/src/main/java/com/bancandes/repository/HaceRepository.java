package com.bancandes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bancandes.entities.HaceEntity;
import com.bancandes.entities.HacePK;

import java.util.Collection;

public interface HaceRepository extends JpaRepository<HaceEntity, HacePK>{

    @Query(value = "SELECT * FROM hace", nativeQuery = true)
    Collection<HaceEntity> darHace();

    @Query(value = "SELECT FROM hace WHERE id_cuenta =: id_cuenta AND id_operacionbancaria =: id_operacionebancaria", nativeQuery = true)
    HaceEntity darHacePorId(@Param("id_cuenta") int id_cuenta, @Param("id_operacionbancaria") int id_operacionbancaria);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM hace WHERE id_cuenta =: id_cuenta AND id_operacionbancaria =: id_operacionebancaria", nativeQuery = true)
    void eliminarHace(@Param("id_cuenta") int id_cuenta, @Param("id_operacionbancaria") int id_operacionbancaria);

    @Modifying
    @Transactional
    @Query(value = "UPDATE hace SET id_cuenta = :id_cuenta_actualizado, id_operacionbancaria = :id_operacionbancaria_actualizado WHERE id_cuenta = :id_cuenta AND id_operacionbancaria = :id_operacionbancaria", nativeQuery = true)
    void actualizarHace(@Param("id_cuenta") int id_cuenta, @Param("id_operacionbancaria") int id_operacionbancaria, @Param("id_cuenta_actualizado") int id_cuenta_actualizado, @Param("id_operacionbancaria_actualizado") int id_operacionbancaria_actualizado);
    

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO hace (id_cuenta, id_operacionbancaria) VALUES (:id_cuenta, :id_operacionbancaria)", nativeQuery = true)
    void insertarHace(@Param("id_cuenta") int id_cuenta, @Param("id_operacionbancaria") int id_operacionbancaria);

}
