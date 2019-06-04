-- 用户表
create  table user(
      ID bigint primary key comment '主键',
      USERNAME varchar(50) comment '用户名',
      REALNAME varchar(50) comment '真实姓名',
      PASSWORD varchar(200) comment '密码',
      CREATE_TIME timestamp comment '创建时间',
      SALT varchar(50) comment '盐值' ,
      AGE int comment '年龄',
      SEX tinyint comment '性别',
      PHONE varchar(20) comment '电话号码',
      LAST_LOGIN_TIME timestamp comment  '最近登陆时间',
      ENABLE tinyint comment '是否可用 1、可用 0、不可用',
      EXPIRE tinyint comment '是否过期 1、过期 0、未过期',
      LOCKED tinyint comment '是否锁定 1、锁定 0、未锁定',
      DELETEED tinyint comment '是否删除'
) engine=InnoDB default charset=utf8;
create index username on user(username);
-- 角色表
create table role(
      ID bigint primary key comment '主键',
      ROLENAME varchar(50) comment '角色名称',
      SUPROLE bigint comment '上级角色',
      ROLECODE varchar(50) comment '角色编码',
      DESCRIPTION varchar(255) comment '角色说明',
      ENABLE tinyint comment '是否可用 1、可用 0、不可用',
      CREATE_TIME timestamp comment '创建时间',
      DELETEED tinyint comment '是否删除',
      CREATOR bigint comment '创建者id'
) engine=InnoDB default charset=utf8;
-- 权限表
create table authority(
      ID bigint primary key comment '主键',
      AUTHNAME varchar(50) comment '权限名称',
      AUTHCODE varchar(50) comment '权限编码',
      DESCRITPION varchar(255) comment '权限说明',
      ENABLE tinyint comment '是否可用 1、可用 0、不可用',
      CREATE_TIME timestamp comment '创建时间',
      DELETEED tinyint comment '是否删除',
      CREATOR bigint comment '创建者id'
) engine=InnoDB default charset=utf8;
-- 用户与角色的关系表
create table user_role(
      ID bigint primary key comment '主键',
      USERID bigint comment '用户id',
      ROLEID bigint comment '角色id',
      ENABLE tinyint comment '是否可用 1、可用 0、不可用',
      CREATE_TIME timestamp comment '创建时间',
      DELETEED tinyint comment '是否删除',
      CREATOR bigint comment '创建者id'
) engine=InnoDB default charset=utf8;
create index userid on user_role(userid);
create index roleid on user_role(roleid);
-- 角色与权限的关系表
create  table role_auth(
      ID bigint primary key comment '主键',
      AUTHID bigint comment '权限id',
      ROLEID bigint comment '角色id',
      ENABLE tinyint comment '是否可用 1、可用 0、不可用',
      CREATE_TIME timestamp comment '创建时间',
      DELETEED tinyint comment '是否删除',
      CREATOR bigint comment '创建者id'
)engine=InnoDB default charset=utf8;
create index roleid1 on role_auth(roleid);
create index authid on role_auth(authid);