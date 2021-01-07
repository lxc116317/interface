package com.yl.fhxy.fund.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="TOrder对象", description="")
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String areaId;

    @ApiModelProperty(value = "订单总数")
    private String num;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal money;

    @ApiModelProperty(value = "账单b")
    @TableField("billB")
    private String billB;

    @ApiModelProperty(value = "账单c")
    @TableField("billC")
    private String billC;

    @TableField("billA")
    private String billA;

    @TableField("billD")
    private String billD;

    @ApiModelProperty(value = "账单类型 0：b,1：c，2：a,3：d")
    private Integer type;

    private String reason;

    @ApiModelProperty(value = "账单状态 0待审批,1审批不通过,2审批通过3.原始")
    private Integer status;

    private Date createTime;


}
