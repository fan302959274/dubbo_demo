package com.fox.mapper;

import com.fox.model.TblSecKill;
import com.fox.model.TblSecKillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSecKillMapper {
    int countByExample(TblSecKillExample example);

    int deleteByExample(TblSecKillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblSecKill record);

    int insertSelective(TblSecKill record);

    List<TblSecKill> selectByExample(TblSecKillExample example);

    TblSecKill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblSecKill record, @Param("example") TblSecKillExample example);

    int updateByExample(@Param("record") TblSecKill record, @Param("example") TblSecKillExample example);

    int updateByPrimaryKeySelective(TblSecKill record);

    int updateByPrimaryKey(TblSecKill record);
}