package com.keming.invasion.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MybatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://mysql.keming.co:3306/invasion?useUnicode=true&characterEncoding=UTF-8", "root", "eae3710keming")
                .globalConfig(builder -> {
                    builder.author("keming") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Users\\u1256\\IdeaProjects\\invasion\\src\\main\\java\\com\\keming\\invasion"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.keming") // 设置父包名
                            .moduleName("invasion") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "C:\\Users\\u1256\\IdeaProjects\\invasion\\src\\main\\java\\com\\keming\\invasion")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user_rank"); // 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
