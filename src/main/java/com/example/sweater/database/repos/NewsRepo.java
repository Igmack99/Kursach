package com.example.sweater.database.repos;

import com.example.sweater.database.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<News, Long> {
    News findByTitle (String title);
    News findByAuthor (String author);
}
