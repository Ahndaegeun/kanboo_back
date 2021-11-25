package com.kanboo.www.domain.repository.board;

import com.kanboo.www.domain.entity.board.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
}
