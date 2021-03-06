create table foolcat_sys_user_info
(
    id            varchar(32)  not null comment '用户ID',
    union_id      varchar(28)  not null DEFAULT '' comment '微信唯一ID',
    open_id      varchar(28)  not null comment '微信开放ID',
    nick_name     varchar(36)  not null DEFAULT '' comment '昵称',
    avatar_url  varchar(255) not null DEFAULT '' comment '头像地址',
    user_identity int          not null DEFAULT 0 comment '用户类型',
    phone         varchar(11)  not null DEFAULT '' comment '电话',
    sex           varchar(8)   not null DEFAULT '' comment '性别',
    create_time   timestamp    not null DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    update_time   timestamp    not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    primary key (id),
    unique key (union_id)
);

create table foolcat_shop_info
(
    id                        varchar(32)  not null comment '商店ID',
    user_id                   varchar(28)  not null comment '用户微信ID',
    shop_name                 varchar(36)  not null comment '商店名称',
    shop_background_image_url varchar(255) not null DEFAULT '' comment '商店背景图片地址',
    shop_portrait_url         varchar(255) not null DEFAULT '' comment '商店头像图片地址',
    state                     int          not null DEFAULT 0 comment '商店状态',
    shop_description          varchar(60)  not null DEFAULT '' comment '商店简介',
    create_time               timestamp    not null DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    update_time               timestamp    not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    primary key (id)
);

create table foolcat_goods_info
(
    id                varchar(32)  not null comment '商品ID',
    shop_id           varchar(32)  not null comment '商店ID',
    goods_name        varchar(36)  not null comment '商品名称',
    goods_description varchar(60)  not null DEFAULT '' comment '商品描述',
    goods_type        int          not null DEFAULT 0 comment '商品类型',
    goods_url         varchar(255) not null DEFAULT '' comment '商品地址',
    price             bigint       not null DEFAULT 0 comment '价格',
    click_count       bigint       not null DEFAULT 0 comment '点击数',
    sale_volume       bigint       not null DEFAULT 0 comment '销售量',
    stock_count       bigint       not null DEFAULT 0 comment '库存',
    create_time       timestamp    not null DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    update_time       timestamp    not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    primary key (id)
);

create table foolcat_swiper
(
    id               varchar(32)  not null comment '主键',
    shop_id          varchar(32)  not null comment '商店ID',
    swiper_image_url varchar(255) not null DEFAULT '' comment '轮播图片地址',
    title            varchar(16)  not null comment '标题',
    create_time      timestamp    not null DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    update_time      timestamp    not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    primary key (id)
);

create table foolcat_theme
(
    id              varchar(32)  not null comment '主题活动ID',
    theme_name      varchar(36)  not null comment '活动名称',
    theme_image_url varchar(255) not null DEFAULT '' comment '活动图片地址',
    state           int          not null DEFAULT 0 comment '活动状态',
    create_time     timestamp    not null DEFAULT CURRENT_TIMESTAMP comment '创建时间',
    update_time     timestamp    not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新时间',
    primary key (id)
);