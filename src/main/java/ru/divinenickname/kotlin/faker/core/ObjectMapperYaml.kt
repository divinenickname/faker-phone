package ru.divinenickname.kotlin.faker.core

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

class ObjectMapperYaml() : ObjectMapper(YAMLFactory()) {
    init {
        registerKotlinModule()
    }
}