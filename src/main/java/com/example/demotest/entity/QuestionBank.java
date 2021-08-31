package com.example.demotest.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author zxl
 * @date 2021/8/30
 */

@Data
@Accessors(chain = true)
@TableName(value = "ssyy_biz_question_bank")
@ApiModel(value = "BizOrder对象", description = "")
public class QuestionBank {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "赛事名称")
    private String descriptionChi;

    @ApiModelProperty(value = "中文标题")
    private String titleChi;

    @ApiModelProperty(value = "题目类型：单选1，多选2")
    private String type;

    @ApiModelProperty(value = "答案选项(中文)")
    //@TableField(typeHandler = ArrayTypeHandler.class)
    private String[] contentChi;

    @ApiModelProperty(value = "问题答案列表")
    //@TableField(ypeHandler = ArrayTypeHandler.class)
    private String[] answer;

    @ApiModelProperty(value = "阅读量")
    private String readNum;

}
