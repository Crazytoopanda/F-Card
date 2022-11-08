package com.lzj.demo.dao;

import com.lzj.demo.entity.PersonalCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
@Mapper
@Repository
public interface PersonalCardDao {
    List<PersonalCard> queryPersonalCard();
    PersonalCard queryPersonalCardByName(String UID);
    int insertPersonalCard(PersonalCard personalcard);
    int updatePersonalCard(PersonalCard personalcard);
    int deletePersonalCard(PersonalCard personalcard);
}
