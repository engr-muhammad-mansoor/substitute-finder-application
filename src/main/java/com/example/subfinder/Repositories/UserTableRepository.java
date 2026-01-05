package com.example.subfinder.Repositories;

import com.example.subfinder.Entities.UserTable;
import com.example.subfinder.Models.UserModel;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface UserTableRepository extends DynamoDBCrudRepository<UserTable, String> {
    // Define custom query methods if needed
}
