package com.xd.shardingtable.bean.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wind_
 * @date 2019/6/30
 */
@ApiModel(value = "BaseResultBean", description = "响应结果")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResultBean<T> {
    @ApiModelProperty(value = "状态码",  name = "code")
    private Integer code;
    @ApiModelProperty(value = "调用结果消息", name = "msg")
    private String msg;
    @ApiModelProperty(value = "成功时响应数据", name = "data")
    private T data;

}
