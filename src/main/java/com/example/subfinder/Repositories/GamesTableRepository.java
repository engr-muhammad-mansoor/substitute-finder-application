package com.example.subfinder.Repositories;

import com.example.subfinder.Entities.GamesTable;
import com.example.subfinder.Models.GameModel;
import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;


@EnableScan
public interface GamesTableRepository extends DynamoDBCrudRepository<GamesTable, String> {
    // Define custom query methods if needed
}
