package com.example.demotest.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demotest.dto.LoginLogDTO;
import com.example.demotest.entity.LoginInfo;
import com.example.demotest.vo.LoginLogVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 */


@Mapper
public interface LoginLogMapper extends BaseMapper<LoginInfo> {


    Page<LoginLogVO> findPage(Page<LoginLogDTO> page, @Param("dto") LoginLogDTO dto);

}
