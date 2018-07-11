package com.ctfo.zgcbank.dao;

import com.ctfo.zgcbank.enjo.ZgcbankTrusttransaction;
import com.ctfo.zgcbank.enjo.ZgcbankTrusttransactionExample;
import com.ctfo.zgcbank.enjo.ZgcbankTrusttransactionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZgcbankTrusttransactionMapper {
    long countByExample(ZgcbankTrusttransactionExample example);

    int deleteByExample(ZgcbankTrusttransactionExample example);

    int deleteByPrimaryKey(Integer transId);

    int insert(ZgcbankTrusttransactionWithBLOBs record);

    int insertSelective(ZgcbankTrusttransactionWithBLOBs record);

    List<ZgcbankTrusttransactionWithBLOBs> selectByExampleWithBLOBs(ZgcbankTrusttransactionExample example);

    List<ZgcbankTrusttransaction> selectByExample(ZgcbankTrusttransactionExample example);

    ZgcbankTrusttransactionWithBLOBs selectByPrimaryKey(Integer transId);

    int updateByExampleSelective(@Param("record") ZgcbankTrusttransactionWithBLOBs record, @Param("example") ZgcbankTrusttransactionExample example);

    int updateByExampleWithBLOBs(@Param("record") ZgcbankTrusttransactionWithBLOBs record, @Param("example") ZgcbankTrusttransactionExample example);

    int updateByExample(@Param("record") ZgcbankTrusttransaction record, @Param("example") ZgcbankTrusttransactionExample example);

    int updateByPrimaryKeySelective(ZgcbankTrusttransactionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZgcbankTrusttransactionWithBLOBs record);

    int updateByPrimaryKey(ZgcbankTrusttransaction record);
}