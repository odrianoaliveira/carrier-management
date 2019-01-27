package com.goeuro.air.carrier.carriermanagement.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.MongoDbFactory
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver
import org.springframework.data.mongodb.core.convert.MappingMongoConverter
import org.springframework.data.mongodb.core.mapping.MongoMappingContext
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@Configuration
@EnableMongoRepositories(basePackages = ["com.goeuro.air.carrier.carriermanagement.infrastructure.persistence"])
@EnableMongoAuditing
class MongoDBConfig(private val mongoFactory: MongoDbFactory,
                    private val mongoMappingContext: MongoMappingContext) {
    @Bean
    @Throws(Exception::class)
    fun mongoConverter(): MappingMongoConverter {
        val dbRefResolver = DefaultDbRefResolver(mongoFactory)
        val mongoConverter = MappingMongoConverter(dbRefResolver, mongoMappingContext)
        // see: https://stackoverflow.com/questions/35598595/how-to-customize-mappingmongoconverter-setmapkeydotreplacement-in-spring-boot
        mongoConverter.setMapKeyDotReplacement("_")
        mongoConverter.afterPropertiesSet()
        return mongoConverter
    }

}