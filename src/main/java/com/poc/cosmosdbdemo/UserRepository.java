package com.poc.cosmosdbdemo;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
public interface UserRepository extends ReactiveCosmosRepository<User, String> {

}
