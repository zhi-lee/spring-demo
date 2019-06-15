package com.example.mana.entity.system;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.joda.time.DateTime;

@TableName("code")
@Data
public class EncodeSystem {
    protected int id;
    protected String name;
    protected String category;
    protected String supcategory;
    protected String categoryName;
    protected DateTime createTime;
    protected int deleted;
    protected int creator;
}
