package com.rune.new_api.repository;

import com.rune.annotation.SecondaryRepositoryMarker;
import com.rune.new_api.domain.entity.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author yangkf
 * @date 2025-03-14
 * @description new-api Api令牌表接口
 */
@SecondaryRepositoryMarker
public interface TokensRepo extends JpaRepository<Tokens, Long>, QuerydslPredicateExecutor<Tokens> {

}
