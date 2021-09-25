package com.example.demotest.commom;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePagerDTO  {

    //当前页，默认第一页
    private Integer currPage = 1;

    //每页记录数，默认为10
    private Integer size = 10;

    public Page getPager(){
        return new Page(this.getCurrPage(), this.getSize());
    }


}
