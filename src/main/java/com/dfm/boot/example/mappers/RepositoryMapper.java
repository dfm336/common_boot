package com.dfm.boot.example.mappers;

import com.dfm.boot.example.domain.Repository;

import java.util.List;

public interface RepositoryMapper extends IMapper<Repository> {

    List<String> searchTitle(String title);


    List<String> searchTitleIndex(String title);


    List<String> searchTitleFullTextIndex(String title);

    List<String> searchTitleByInstr(String title);
}