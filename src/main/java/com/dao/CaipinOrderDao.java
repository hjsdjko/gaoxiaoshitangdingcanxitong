package com.dao;

import com.entity.CaipinOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinOrderView;

/**
 * 菜品订单 Dao 接口
 *
 * @author 
 * @since 2021-04-15
 */
public interface CaipinOrderDao extends BaseMapper<CaipinOrderEntity> {

   List<CaipinOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
