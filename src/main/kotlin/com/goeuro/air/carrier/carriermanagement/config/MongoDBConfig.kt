package com.goeuro.air.carrier.carriermanagement.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["com.goeuro.air.carrier.carriermanagement.infrastructure.persistence"])
@EnableMongoAuditing
class MongoDBConfig