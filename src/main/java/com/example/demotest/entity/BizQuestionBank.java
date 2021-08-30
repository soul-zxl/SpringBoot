package com.example.demotest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.ArrayTypeHandler;
import org.apache.ibatis.type.TypeHandler;

/**
 * @author zxl
 * @date 2021/6/7
 */
// todo redis先查redis没有在查sql,更新、删除、新增
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName(value = "ssyy_biz_question_bank")
@ApiModel(value = "BizOrder对象", description = "")
public class BizQuestionBank extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "赛事名称")
    private String descriptionChi;

    @ApiModelProperty(value = "中文标题")
    private String titleChi;

    @ApiModelProperty(value = "英文标题")
    private String titleEng;

    @ApiModelProperty(value = "题目类型：单选1，多选2")
    private String type;

    @ApiModelProperty(value = "答案选项(中文)")
    //@TableField(typeHandler = ArrayTypeHandler.class)
    private String[] contentChi;

    @ApiModelProperty(value = "答案选项(英文)")
    //@TableField(typeHandler = ArrayTypeHandler.class)
    private String[] contentEng;

    @ApiModelProperty(value = "问题答案列表")
    //@TableField(ypeHandler = ArrayTypeHandler.class)
    private String[] answer;

    @ApiModelProperty(value = "赛事和题目关联id")
    private String competitionId;



}
