package com.laioffer.tinnews.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.laioffer.tinnews.model.Article;

import java.util.List;

@Dao
public interface RoomDao { //here RoomDao is an interface
    @Insert
    void saveArticle(Article news);

    @Query("SELECT * FROM article") //get all the news you liked
    LiveData<List<Article>> getAllArticles();

    @Delete
    void deleteArticle(Article... article);//... means the input can be multiple, separated with comma
}
