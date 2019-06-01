package net.yangwenxin.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "用户")
@Data
public class User {

    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;

}
