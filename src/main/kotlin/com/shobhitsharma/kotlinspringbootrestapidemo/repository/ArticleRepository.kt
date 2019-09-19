package com.shobhitsharma.kotlinspringbootrestapidemo.repository

import com.shobhitsharma.kotlinspringbootrestapidemo.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long>