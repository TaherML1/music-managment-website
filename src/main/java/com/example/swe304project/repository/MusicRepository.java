package com.example.swe304project.repository;

import com.example.swe304project.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {

    @Query("SELECT m FROM Music m WHERE " +
            "LOWER(m.name) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "LOWER(m.singer) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
            "CAST(m.year AS string) LIKE CONCAT('%', :query, '%')")
    List<Music> search(String query);
}