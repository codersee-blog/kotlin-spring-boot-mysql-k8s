package com.codersee.k8smysql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sMysqlApplication

fun main(args: Array<String>) {
    runApplication<K8sMysqlApplication>(*args)
}