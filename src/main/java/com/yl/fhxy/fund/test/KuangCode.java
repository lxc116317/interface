package com.yl.fhxy.fund.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;


/**
 * 代码自动生成器
 */
public class KuangCode {
     public static void main(String[] args){
//           需要构建一个 代码自动生成器 对象
         AutoGenerator mpg = new AutoGenerator();
//           配置策略
//           1、全局配置
         GlobalConfig gc = new GlobalConfig();
         String projectPath = System.getProperty("user.dir");
         gc.setOutputDir(projectPath+"/src/main/java");
         gc.setAuthor("lxc");
         gc.setOpen(false);
//           是否覆盖
         gc.setFileOverride(false);
//           去Service的I前缀
         gc.setServiceName("%sService");
         gc.setIdType(IdType.AUTO);
         gc.setDateType(DateType.ONLY_DATE);
         gc.setSwagger2(true);
         mpg.setGlobalConfig(gc);
 
//          2、设置数据源
         DataSourceConfig dsc = new DataSourceConfig();
         dsc.setUrl("jdbc:mysql://yl.fhxynet.com:3306/fund?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai");
         dsc.setDriverName("com.mysql.jdbc.Driver");
         dsc.setUsername("root");
         dsc.setPassword("root_123456");
         dsc.setDbType(DbType.MYSQL);
         mpg.setDataSource(dsc);
 
//          3、包的配置
         PackageConfig pc = new PackageConfig();
         pc.setModuleName("fund");
         pc.setParent("com.yl.fhxy");
         pc.setEntity("entity");
         pc.setMapper("mapper");
         pc.setService("service");
         pc.setController("controller");
         mpg.setPackageInfo(pc);
 
//          4、策略配置
         StrategyConfig strategy = new StrategyConfig();
//           设置要映射的表名
         strategy.setInclude("t_elder","t_order");
         strategy.setEntityLombokModel(true);
         strategy.setRestControllerStyle(true);
         strategy.setControllerMappingHyphenStyle(true);// 驼峰转连字符
         strategy.setNaming(NamingStrategy.underline_to_camel);
         strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//           自动lombok；
         strategy.setEntityLombokModel(true);
 
         strategy.setLogicDeleteFieldName("deleted");
//           自动填充配置
         TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
         TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
         ArrayList<TableFill> tableFills = new ArrayList<>();
         tableFills.add(gmtCreate);
         tableFills.add(gmtModified);
         strategy.setTableFillList(tableFills);
//           乐观锁
         strategy.setVersionFieldName("version");
         strategy.setRestControllerStyle(true);
         strategy.setControllerMappingHyphenStyle(true);
         mpg.setStrategy(strategy);
//          执行
         mpg.execute();
     }
 }
