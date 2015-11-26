package com.nice.dal.dao;

import com.nice.dal.model.TSttSettleScheme;

public interface TSttSettleSchemeMapper {
    int deleteByPrimaryKey(Long schemeId);

    int insert(TSttSettleScheme record);

    int insertSelective(TSttSettleScheme record);

    TSttSettleScheme selectByPrimaryKey(Long schemeId);

    int updateByPrimaryKeySelective(TSttSettleScheme record);

    int updateByPrimaryKey(TSttSettleScheme record);
}