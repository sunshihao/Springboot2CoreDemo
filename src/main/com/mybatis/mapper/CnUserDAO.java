package com.mybatis.mapper;

import com.mybatis.model.CnUser;
import com.mybatis.model.CnUserExample;
import com.mybatis.model.CnUserKey;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.NotEmpty;

public interface CnUserDAO {
    long countByExample(CnUserExample example);

    int deleteByExample(CnUserExample example);

    int deleteByPrimaryKey(CnUserKey key);

    int insert(CnUser record);

    int insertSelective(CnUser record);

    List<CnUser> selectByExample(CnUserExample example);

    CnUser selectByPrimaryKey(CnUserKey key);

    int updateByExampleSelective(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByExample(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByPrimaryKeySelective(CnUser record);

    int updateByPrimaryKey(CnUser record);
}