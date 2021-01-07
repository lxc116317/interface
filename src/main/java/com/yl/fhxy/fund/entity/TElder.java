package com.yl.fhxy.fund.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxc
 * @since 2020-12-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TElder对象", description="")
public class TElder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String orderId;

    private String areaId;

    private String serviceId;

    private String name;

    private String cardNumber;

    private String address;

    @ApiModelProperty(value = "户籍")
    private String domicile;

    @ApiModelProperty(value = "消费地址")
    private String consumeAddress;

    @ApiModelProperty(value = "消费金额")
    private BigDecimal consumeMoney;

    @ApiModelProperty(value = "评估分数")
    private String score;

    @ApiModelProperty(value = "补贴金额")
    private BigDecimal subsidy;

    @ApiModelProperty(value = "发放状态 0未发放，1已发放")
    private Integer sendStatus;

    @ApiModelProperty(value = "补贴审核状态 0待审核，1已审核")
    private Integer status;

    @ApiModelProperty(value = "不通过原因")
    private String reason;

    private Date createTime;

    private Date updateTime;


}
