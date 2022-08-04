package com.sportyshoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.model.PurchaseReport;

public interface PurchaseRepo extends JpaRepository<PurchaseReport, Integer> {

    List<PurchaseReport> findAllByDateofpurchase(String date);

}