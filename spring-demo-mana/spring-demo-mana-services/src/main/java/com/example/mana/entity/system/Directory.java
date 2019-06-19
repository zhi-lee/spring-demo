package com.example.mana.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.base.entity.Entity;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@TableName("directory")
@Data
public class Directory extends Entity implements Serializable {
    @TableId
    protected Long id;
    protected String name;
    protected String category;
    @TableField(value = "sup_category")
    protected String supCategory;
    protected String categoryName;
}
