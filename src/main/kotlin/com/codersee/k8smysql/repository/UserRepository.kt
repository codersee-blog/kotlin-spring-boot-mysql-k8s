package com.codersee.k8smysql.repository

import com.codersee.k8smysql.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>