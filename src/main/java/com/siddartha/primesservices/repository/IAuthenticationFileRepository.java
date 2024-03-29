package com.siddartha.primesservices.repository;

import com.siddartha.primesservices.model.Customer;

import java.io.IOException;

public interface IAuthenticationFileRepository {

    boolean save (Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;

}
