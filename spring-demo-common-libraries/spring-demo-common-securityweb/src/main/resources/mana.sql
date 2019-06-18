-- 用户表
create table user
(
    ID              bigint primary key comment '主键',
    NAME            varchar(50) unique comment '用户名',
    REALNAME        varchar(50) comment '真实姓名',
    PASSWORD        varchar(200) comment '密码',
    CREATE_TIME     timestamp comment '创建时间',
    SALT            varchar(50) comment '盐值',
    AGE             int comment '年龄',
    SEX             tinyint comment '性别',
    PHONE           varchar(20) comment '电话号码',
    LAST_LOGIN_TIME timestamp default current_timestamp comment '最近登陆时间',
    ENABLE          tinyint comment '是否可用 1、可用 0、不可用',
    EXPIRE          tinyint comment '是否过期 1、过期 0、未过期',
    LOCKED          tinyint comment '是否锁定 1、锁定 0、未锁定',
    DELETED         tinyint comment '是否删除'
) engine = InnoDB
  default charset = utf8;
create index username on user (name);
-- 角色表
create table role
(
    ID          bigint primary key comment '主键',
    NAME        varchar(50) comment '角色名称',
    CODE        varchar(50) comment '角色编码',
    SUP_ROLE    bigint comment '上级角色',
    DESCRIPTION varchar(255) comment '角色说明',
    ENABLE      tinyint comment '是否可用 1、可用 0、不可用',
    CREATE_TIME timestamp comment '创建时间',
    UPDATE_TIME timestamp default current_timestamp comment '更新时间',
    DELETED     tinyint comment '是否删除',
    CREATOR     bigint comment '创建者id'
) engine = InnoDB
  default charset = utf8;
-- 权限表
create table authority
(
    ID          bigint primary key comment '主键',
    NAME        varchar(50) comment '权限名称',
    CODE        varchar(50) comment '权限编码',
    TYPE        int(4) comment '权限类型',
    DESCRITPION varchar(255) comment '权限说明',
    ENABLE      tinyint comment '是否可用 1、可用 0、不可用',
    CREATE_TIME timestamp comment '创建时间',
    UPDATE_TIME timestamp default current_timestamp comment '更新时间',
    DELETED     tinyint comment '是否删除',
    CREATOR     bigint comment '创建者id'
) engine = InnoDB
  default charset = utf8;
-- 用户与角色的关系表
create table user_role
(
    ID          bigint primary key comment '主键',
    USERID      bigint comment '用户id',
    ROLEID      bigint comment '角色id',
    CREATE_TIME timestamp default current_timestamp comment '创建时间',
    DELETED     tinyint comment '是否删除',
    CREATOR     bigint comment '创建者id'
) engine = InnoDB
  default charset = utf8;
create index userid on user_role (userid);
create index roleid on user_role (roleid);
-- 角色与权限的关系表
create table role_auth
(
    ID          bigint primary key comment '主键',
    AUTHID      bigint comment '权限id',
    ROLEID      bigint comment '角色id',
    CREATE_TIME timestamp default current_timestamp comment '创建时间',
    DELETED     tinyint comment '是否删除',
    CREATOR     bigint comment '创建者id'
) engine = InnoDB
  default charset = utf8;
create index roleid1 on role_auth (roleid);
create index authid on role_auth (authid);
-- 码表
create table directory
(
    ID            bigint primary key comment '主键',
    NAME          varchar(50) comment '名称',
    CATEGORY      varchar(50) comment '类别',
    SUP_CATEGORY  varchar(50) comment '上级类别',
    CATEGORY_NAME varchar(50) comment '类别名称',
    CREATE_TIME   timestamp default current_timestamp comment '创建时间',
    UPDATE_TIME   timestamp default current_timestamp comment '更新时间',
    DELETED       tinyint comment '是否删除',
    CREATOR       bigint comment '创建者id'
) engine = InnoDB
  default charset = utf8;
create index category on directory (CATEGORY);
create index sup_category on directory (SUP_CATEGORY);
