package com.example.sweater.database.Service;

import com.example.sweater.database.entities.News;
import com.example.sweater.database.repos.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    @Autowired
    NewsRepo newsRepo;

    void delete(long id) {
        newsRepo.deleteById(id);
    }

    News detected (String title) { return  newsRepo.findByTitle(title);
    }

    News detectedA (String author) { return  newsRepo.findByAuthor(author);
    }

    void editNews(Long id, String title) {
        News news = newsRepo.getOne(id);
        news.setTitle(title);
        newsRepo.saveAndFlush(news);
    }
}