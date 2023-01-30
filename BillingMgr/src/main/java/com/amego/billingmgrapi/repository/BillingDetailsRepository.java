package com.amego.billingmgrapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amego.billingmgrapi.entity.BillingDetails;

@Repository
public interface BillingDetailsRepository extends JpaRepository<BillingDetails, Long> {

}
