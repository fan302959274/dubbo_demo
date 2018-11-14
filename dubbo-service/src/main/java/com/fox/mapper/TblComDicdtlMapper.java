package com.fox.mapper;

import com.fox.model.TblComDicdtl;
import com.fox.model.TblComDicdtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblComDicdtlMapper {
    int countByExample(TblComDicdtlExample example);

    int deleteByExample(TblComDicdtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblComDicdtl record);

    int insertSelective(TblComDicdtl record);

    List<TblComDicdtl> selectByExample(TblComDicdtlExample example);

    TblComDicdtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblComDicdtl record, @Param("example") TblComDicdtlExample example);

    int updateByExample(@Param("record") TblComDicdtl record, @Param("example") TblComDicdtlExample example);

    int updateByPrimaryKeySelective(TblComDicdtl record);

    int updateByPrimaryKey(TblComDicdtl record);
}