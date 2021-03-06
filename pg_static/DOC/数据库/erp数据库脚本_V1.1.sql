	
	DROP TABLE IF EXISTS `CUSTOMER`;
	CREATE TABLE `CUSTOMER` (
	  `CUS_CODE` int  NOT NULL AUTO_INCREMENT COMMENT '用户编码',
	  `CUS_NAME` varchar(50) DEFAULT '' COMMENT '用户名',
	  `PASSWORD` varchar(20) DEFAULT '' COMMENT '用户密码',
	  `NICKNAME` varchar(100) DEFAULT '' COMMENT '昵称',
	  `IDN` varchar(50) DEFAULT '' COMMENT '身份证号',
	  `STATUS` varchar(1) DEFAULT '' COMMENT '用户状态',
	  `MPHONE` varchar(20) DEFAULT '' COMMENT '手机',
	  `ADDR` varchar(100) DEFAULT '' COMMENT '联系地址',
	  `EMAIL` varchar(50) DEFAULT '' COMMENT '邮箱',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '注册时间',
	  PRIMARY KEY (`CUS_CODE`)
	)  ENGINE=INNODB DEFAULT CHARSET=UTF8 AUTO_INCREMENT=100000 COMMENT='用户';
	
	CREATE UNIQUE INDEX `IDX_MPHONE` ON  `CUSTOMER` (`MPHONE`);
	
	
	
	DROP TABLE IF EXISTS `ERP_CUS_ROLE_MAPPING`;
	CREATE TABLE `ERP_CUS_ROLE_MAPPING` (
	  `ID` int NOT NULL AUTO_INCREMENT,
	  `CUS_CODE` int NOT NULL COMMENT '用户CODE',
	  `ROLE_ID` int NOT NULL COMMENT '角色ID',
	  `DESCRIPT` varchar(500) DEFAULT ''  COMMENT '描述',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '角色创建时间',
	  `CREATE_BY` varchar(20) DEFAULT ''  COMMENT '角色创建者',
	  PRIMARY KEY (`ID`)
	) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='用户&角色关联表';
	
	DROP TABLE IF EXISTS `ERP_MENU`;
	CREATE TABLE `ERP_MENU` (
	  `MENU_ID` int NOT NULL AUTO_INCREMENT COMMENT '权限编码',
	  `MENU_PID` int NOT NULL COMMENT '父级CODE',
	  `MENU_NAME` varchar(50) DEFAULT '' COMMENT '权限名称',
	  `DESCRIPT` varchar(500) DEFAULT '' COMMENT '权限备注',
	  `MENU_URL` varchar(500) DEFAULT '' COMMENT '菜单URL',
	  `IMAGE` varchar(50) DEFAULT '' COMMENT '菜单图标',
	  `SHOW_ORDER` int DEFAULT NULL COMMENT '排序',
	  `STATUS` varchar(1) DEFAULT '' COMMENT '有效性',
	  `CREATE_BY` varchar(50) DEFAULT '' COMMENT '创建人',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '创建时间',
	  PRIMARY KEY (`MENU_ID`)
	) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='菜单权限表';
	
	DROP TABLE IF EXISTS `ERP_PROG_MENU_ROLE`;
	CREATE TABLE `ERP_PROG_MENU_ROLE` (
	  `ID` int NOT NULL AUTO_INCREMENT ,
	  `MENU_ID` int NOT NULL COMMENT '父级菜单CODE',
	  `ROLE_ID` int NOT NULL COMMENT '角色ID',
	  `STATUS` varchar(1) DEFAULT '' COMMENT '有效性',
	  `CREATE_BY` varchar(50) DEFAULT '' COMMENT '创建人',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '创建时间',
	  PRIMARY KEY (`ID`)
	) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='角色菜单按钮关联表';
	
	DROP TABLE IF EXISTS `ERP_PROG`;
	CREATE TABLE `ERP_PROG` (
	  `PROG_ID` int NOT NULL AUTO_INCREMENT COMMENT '权限编码',
	  `PROG_NAME` varchar(50) DEFAULT '' COMMENT '权限名称',
	  `DESCRIPT` varchar(500) DEFAULT '' COMMENT '权限备注',
	  `URL` varchar(500) DEFAULT '' COMMENT '权限URL',
	  `SHOW_ORDER` int DEFAULT NULL COMMENT '排序',
	  `STATUS` varchar(1) DEFAULT '' COMMENT '有效性',
	  `CREATE_BY` varchar(50) DEFAULT '' COMMENT '创建人',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '创建时间',
	  PRIMARY KEY (`PROG_ID`)
	) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='按钮权限表';
	
	DROP TABLE IF EXISTS `ERP_ROLE`;
	CREATE TABLE `ERP_ROLE` (
	  `ROLE_ID` int  NOT NULL AUTO_INCREMENT COMMENT '角色编码',
	  `ROLE_NAME` varchar(50) DEFAULT '' COMMENT '角色名称',
	  `DESCRIPT` varchar(20) DEFAULT '' COMMENT '角色备注',
	  `ROLE_STATUS` varchar(1) DEFAULT '' COMMENT '角色状态',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '角色创建时间',
	  `CREATE_BY` varchar(20) DEFAULT '' COMMENT '角色创建者',
	  PRIMARY KEY (`ROLE_ID`)
	) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='角色';
	CREATE UNIQUE INDEX `IDX_ROLE_ID` ON  `ERP_ROLE` (`ROLE_ID`);
	CREATE UNIQUE INDEX `IDX_ROLE_NAME` ON  `ERP_ROLE` (`ROLE_NAME`);
	
	
	DROP TABLE IF EXISTS `ERP_ROLE_PROG_MAPPING`;
	CREATE TABLE `ERP_ROLE_PROG_MAPPING` (
	  `ID` int NOT NULL AUTO_INCREMENT,
	  `ROLE_ID` int NOT NULL COMMENT '角色ID',
	  `PROG_ID` int NOT NULL COMMENT '权限ID',
	  `DESCRIPT` varchar(500) DEFAULT '' COMMENT '描述',
	  `CREATE_DT` datetime DEFAULT NULL COMMENT '角色创建时间',
	  PRIMARY KEY (`ID`)
	) ENGINE=INNODB DEFAULT CHARSET=UTF8 COMMENT='角色&权限关联表';
