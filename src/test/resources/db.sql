/*
Navicat MySQL Data Transfer

Source Server         : cunyun
Source Server Version : 50555
Source Host           : 101.132.186.63:3306
Source Database       : cy-neican

Target Server Type    : MYSQL
Target Server Version : 50555
File Encoding         : 65001

Date: 2018-01-01 11:43:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cy_banner
-- ----------------------------
DROP TABLE IF EXISTS `cy_banner`;
CREATE TABLE `cy_banner` (
  `banner_id` varchar(32) NOT NULL,
  `content` text,
  `click_url` text,
  `created_time` datetime DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `delivery_topic_class` text,
  `delivery_topic` text COMMENT '适用多个话题,用逗号分割',
  `delivery_vip_level` varchar(32) DEFAULT NULL,
  `delivery_rule_ext` text COMMENT '其他规则,json 方式存储',
  PRIMARY KEY (`banner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子顶部的轮播广告 banner';

-- ----------------------------
-- Table structure for cy_banner_click_log
-- ----------------------------
DROP TABLE IF EXISTS `cy_banner_click_log`;
CREATE TABLE `cy_banner_click_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `banner_id` varchar(32) DEFAULT NULL COMMENT '哪一个banner',
  `twitter_id` varchar(32) DEFAULT NULL COMMENT '在哪一个帖子上点的',
  `uid` varchar(32) DEFAULT NULL COMMENT '什么人点的',
  `created_time` datetime DEFAULT NULL COMMENT '什么时候点的',
  `has_fee` varchar(32) DEFAULT NULL COMMENT '是否有转化,fee 转化成功,not_fee 未转化',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='轮播广告的点击效果';

-- ----------------------------
-- Table structure for cy_topic
-- ----------------------------
DROP TABLE IF EXISTS `cy_topic`;
CREATE TABLE `cy_topic` (
  `topic_id` varchar(32) NOT NULL COMMENT '32位的唯一索引id',
  `topic_name` varchar(256) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL COMMENT 'created_time ',
  `uid` varchar(32) DEFAULT NULL COMMENT '话题创建人员',
  `topic_class` varchar(50) DEFAULT NULL COMMENT '分类',
  PRIMARY KEY (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='话题';

-- ----------------------------
-- Table structure for cy_topic_class
-- ----------------------------
DROP TABLE IF EXISTS `cy_topic_class`;
CREATE TABLE `cy_topic_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_class` varchar(32) DEFAULT NULL,
  `topic_class_name` varchar(50) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `upper_topic_class` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子板块列表';

-- ----------------------------
-- Table structure for cy_twitter
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter`;
CREATE TABLE `cy_twitter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL COMMENT '业务id',
  `uid` varchar(32) DEFAULT NULL COMMENT '发帖人',
  `title` varchar(256) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容,富文本',
  `show_content` text COMMENT '显示的内容',
  `from_url` text COMMENT '来源url',
  `twitter_type` varchar(32) DEFAULT NULL COMMENT '取值：default 默认的普通贴 joint-work 协作贴  activity  活动贴  vote 投票贴',
  `read_rule` varchar(32) DEFAULT NULL COMMENT '1、好友可读、可评论   2、指定好友可读、可评论   3、协作者可读（协作贴默认权限） 4、全部可读、可评论（普通贴默认权限）',
  `reply_rule` varchar(32) DEFAULT NULL COMMENT '回帖权限',
  `has_atts` varchar(32) DEFAULT NULL COMMENT '是否有附件',
  `created_time` datetime DEFAULT NULL COMMENT 'created_time',
  `topic_class` varchar(32) DEFAULT NULL COMMENT '所属板块code',
  `vote_can_add_option` int(11) DEFAULT '1' COMMENT '0 不可以 1可以（默认1）',
  `vote_multiple_choice` int(11) DEFAULT '0' COMMENT '0 单选 1多选（默认0）',
  `push_status` int(11) DEFAULT NULL COMMENT '0已发布 1已隐藏 2草稿  3已删除',
  `icon` varchar(256) DEFAULT NULL COMMENT '简约显示的图标',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户发的帖子';

-- ----------------------------
-- Table structure for cy_twitter_activity_detail
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_activity_detail`;
CREATE TABLE `cy_twitter_activity_detail` (
  `twitter_id` varchar(32) NOT NULL,
  `activity_area` varchar(256) DEFAULT NULL,
  `activity_time` datetime DEFAULT NULL,
  `x_coordinates` varchar(200) DEFAULT NULL COMMENT '地图坐标',
  `map_type` varchar(50) DEFAULT NULL COMMENT '地图提供商,baidu. google, soso',
  `created_time` datetime DEFAULT NULL,
  PRIMARY KEY (`twitter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动贴专属表';

-- ----------------------------
-- Table structure for cy_twitter_activity_user
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_activity_user`;
CREATE TABLE `cy_twitter_activity_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL,
  `uid` varchar(32) DEFAULT NULL,
  `user_avatar` varchar(256) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL COMMENT '0 正常,1取消',
  `created_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动参与的人';

-- ----------------------------
-- Table structure for cy_twitter_atts
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_atts`;
CREATE TABLE `cy_twitter_atts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL,
  `atts_type` varchar(32) DEFAULT NULL COMMENT 'img、音频、word、ppt、excel、pdf',
  `atts_url` text,
  `created_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子的附件列表';

-- ----------------------------
-- Table structure for cy_twitter_fabulous
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_fabulous`;
CREATE TABLE `cy_twitter_fabulous` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL,
  `uid` varchar(32) DEFAULT NULL,
  `user_avatar` varchar(256) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子的点赞记录';

-- ----------------------------
-- Table structure for cy_twitter_reply
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_reply`;
CREATE TABLE `cy_twitter_reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL,
  `uid` varchar(32) DEFAULT NULL COMMENT '评论人',
  `pid` varchar(32) DEFAULT NULL,
  `content` text COMMENT '评论内容',
  `viewpoint_int` int(11) DEFAULT NULL COMMENT '意见倾向性,同意0,不同意100,每一个评论都需要有这个参数,如果没填则留空',
  `user_avatar` varchar(256) DEFAULT NULL COMMENT '评论人头像',
  `created_time` datetime DEFAULT NULL COMMENT '评论时间',
  `status` int(11) DEFAULT NULL COMMENT '0正常 1已删除 2已禁言（****代替）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帖子的回复';

-- ----------------------------
-- Table structure for cy_twitter_vote_option
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_vote_option`;
CREATE TABLE `cy_twitter_vote_option` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `vote_text` varchar(256) DEFAULT NULL,
  `vote_percent` int(11) DEFAULT NULL COMMENT '百分比,事后更新',
  `uid` varchar(32) DEFAULT NULL COMMENT '一般默认是创建人,但是可以允许其他投票人添加新的选项,发起人同意后展示',
  `status` varchar(20) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投票贴的投票选项';

-- ----------------------------
-- Table structure for cy_twitter_vote_record
-- ----------------------------
DROP TABLE IF EXISTS `cy_twitter_vote_record`;
CREATE TABLE `cy_twitter_vote_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` varchar(32) DEFAULT NULL,
  `vote_record` text COMMENT '投票记录,如果可以多选多个选项之间逗号隔开',
  `created_time` datetime DEFAULT NULL,
  `uid` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投票记录表';

-- ----------------------------
-- Table structure for cy_user
-- ----------------------------
DROP TABLE IF EXISTS `cy_user`;
CREATE TABLE `cy_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(32) DEFAULT NULL COMMENT '物理主键',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '平台昵称',
  `user_avatar` varchar(256) DEFAULT NULL COMMENT '平台头像',
  `user_sign` varchar(32) DEFAULT NULL COMMENT '平台签名',
  `user_mobile` varchar(32) DEFAULT NULL COMMENT '用户手机号码',
  `user_type` varchar(32) DEFAULT NULL COMMENT '游客,验证客户,付费会员',
  `wc_user_name` varchar(32) DEFAULT NULL COMMENT '微信账号',
  `wc_nick_name` varchar(32) DEFAULT NULL COMMENT '微信名',
  `invite_uid` varchar(32) DEFAULT NULL COMMENT '邀请人uid',
  `wc_qr_code` varchar(256) DEFAULT NULL COMMENT '微信二维码',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` varchar(32) DEFAULT NULL COMMENT '是否可用，0是正常，1是已删除，2冻结，3禁言',
  `ali_user_name` varchar(50) DEFAULT NULL COMMENT '支付宝账号(预留以后用到)',
  `ali_nick_name` varchar(50) DEFAULT NULL COMMENT '支付宝昵称(预留以后用到)',
  `ali_userid` varchar(50) DEFAULT NULL COMMENT '支付宝用户id,pid',
  `vip_level` varchar(12) DEFAULT NULL COMMENT 'vip等级',
  `cy_score_count` int(11) DEFAULT NULL COMMENT '累计积分',
  `cy_score_balance` int(11) DEFAULT NULL COMMENT '剩余积分',
  `balance` int(11) DEFAULT NULL COMMENT 'int类型存放的余额',
  `name` varchar(50) DEFAULT NULL,
  `cid` text COMMENT '身份证加密存储',
  `is_real_name` int(11) DEFAULT NULL COMMENT '0 未验证手机 1已验证',
  `is_real_mobile` int(11) DEFAULT NULL COMMENT '0 未验证手机 1已验证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for cy_user_friends
-- ----------------------------
DROP TABLE IF EXISTS `cy_user_friends`;
CREATE TABLE `cy_user_friends` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '物理主键',
  `uid` varchar(32) DEFAULT NULL COMMENT '用户id',
  `friend_uid` varchar(32) DEFAULT NULL COMMENT '朋友的uid',
  `created_time` datetime DEFAULT NULL COMMENT 'created_time ',
  `status` varchar(32) DEFAULT NULL COMMENT '0是正常，1是已删除',
  `group_name` varchar(50) DEFAULT NULL COMMENT '用户分组名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='和 cy_user 多对一关系';

-- ----------------------------
-- Table structure for cy_user_hobbie_topic
-- ----------------------------
DROP TABLE IF EXISTS `cy_user_hobbie_topic`;
CREATE TABLE `cy_user_hobbie_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(32) DEFAULT NULL COMMENT '用户id',
  `topic_name` varchar(256) DEFAULT NULL COMMENT '话题名称',
  `topic_id` varchar(32) DEFAULT NULL COMMENT '话题的id',
  `created_time` datetime DEFAULT NULL COMMENT 'created_time ',
  `push_model` varchar(32) DEFAULT NULL COMMENT '信息推送的模式',
  `push_times` varchar(32) DEFAULT NULL COMMENT '信息推送的频率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='至少通过5个话题来标注每个用户。用于话题推荐';

-- ----------------------------
-- Table structure for cy_user_invite_record
-- ----------------------------
DROP TABLE IF EXISTS `cy_user_invite_record`;
CREATE TABLE `cy_user_invite_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '物理主键',
  `uid` varchar(32) DEFAULT NULL COMMENT '用户id',
  `invited_uid` varchar(32) DEFAULT NULL COMMENT '被邀请人uid',
  `invited_name` varchar(32) DEFAULT NULL COMMENT '被邀请人姓名',
  `created_time` datetime DEFAULT NULL COMMENT 'created_time ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='邀请记录表';

-- ----------------------------
-- Table structure for cy_user_invite_url
-- ----------------------------
DROP TABLE IF EXISTS `cy_user_invite_url`;
CREATE TABLE `cy_user_invite_url` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `uid` varchar(32) DEFAULT NULL COMMENT '用户id',
  `invite_model` varchar(32) DEFAULT NULL COMMENT '邀请模式,预留',
  `created_time` datetime DEFAULT NULL COMMENT 'created_time ',
  `invite_url` varchar(256) DEFAULT NULL COMMENT '邀请的url，可生成二维码',
  `invite_code` varchar(32) DEFAULT NULL COMMENT '随机生成的32位邀请码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='邀请链接记录表';

-- ----------------------------
-- Table structure for cy_user_message
-- ----------------------------
DROP TABLE IF EXISTS `cy_user_message`;
CREATE TABLE `cy_user_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `icon` varchar(256) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0 未读 1删除 2已读',
  `udi` varchar(32) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `read_time` datetime DEFAULT NULL,
  `drop_time` datetime DEFAULT NULL,
  `msg_type` varchar(32) DEFAULT NULL COMMENT '提示的类型：twitter-reply 帖子回复, @ 有人@, add-friend 新好友, topic-news 新话题, invited-news 邀请消息（包括主邀请和被邀请）',
  `show_url` varchar(500) DEFAULT NULL COMMENT '点击详情时候跳转的url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='消息提示表';

-- ----------------------------
-- Table structure for cy_user_score_recode
-- ----------------------------
DROP TABLE IF EXISTS `cy_user_score_recode`;
CREATE TABLE `cy_user_score_recode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(32) DEFAULT NULL,
  `twitter_id` varchar(32) DEFAULT NULL,
  `score_type` varchar(32) DEFAULT NULL COMMENT '积分的类型,create_twitter 创建贴,  reply 回复  system 其他奖励',
  `created_time` datetime DEFAULT NULL COMMENT 'created_time ',
  `score` int(11) DEFAULT NULL COMMENT '积分数量',
  `count_score` int(11) DEFAULT NULL COMMENT '积分后合计多少分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发帖、回帖、评论、点赞积分记录表';
