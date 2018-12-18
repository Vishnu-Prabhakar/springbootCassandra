package com.example.springbootCassandra.repository;

import org.springframework.data.cassandra.core.mapping.MapId;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootCassandra.model.Employee;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, MapId>{

}
