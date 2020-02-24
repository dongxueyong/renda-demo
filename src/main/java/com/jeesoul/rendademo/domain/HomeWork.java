package com.jeesoul.rendademo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *@author：dxy
 *@date : 2020-02-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "r_home_work")
public class HomeWork implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "home_name")
    private String homeName;

    @TableField(value = "home_url")
    private String homeUrl;

    @TableField(value = "remark")
    private String remark;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}