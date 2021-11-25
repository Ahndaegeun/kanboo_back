package com.kanboo.www.domain.repository.project;

import com.kanboo.www.domain.entity.project.Chatting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChattingRepository extends JpaRepository<Chatting, Long> {
}
