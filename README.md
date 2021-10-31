github项目常见徽章如何生成？
---
[![build](https://github.com/luckyQing/ci-badge/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/luckyQing/ci-badge/actions/workflows/build.yml)
[![codecov](https://codecov.io/gh/luckyQing/ci-badge/branch/main/graph/badge.svg)](https://codecov.io/gh/luckyQing/ci-badge)
[![license](https://img.shields.io/badge/license-Apache%202-green)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![jdk version](https://img.shields.io/badge/jdk-1.8+-blue.svg)](https://docs.oracle.com/javase/8/docs/api/)
![](https://img.shields.io/badge/spring--boot-2.5.4.RELEASE-blue.svg)
![](https://img.shields.io/badge/spring--cloud-2020.0.3-blue.svg)
![](https://img.shields.io/github/stars/luckyQing/ci-badge?label=Star&color=brightgreen)
![](https://img.shields.io/github/forks/luckyQing/ci-badge?label=Fork&color=brightgreen)
# 一、build passing
github项目——>Actions——>New workflow——>Java with Maven
![](images/build.png)
# 二、codecov
codecov是一个测试结果分析工具
- 去codecov官网（https://app.codecov.io/gh）用github账号登陆并授权，选择要分析的仓库
- pom.xml中添加jacoco插件
  ```
    <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>${jacoco-maven-plugin.version}</version>
        <executions>
            <execution>
                <goals>
                    <goal>prepare-agent</goal>
                </goals>
            </execution>
            <execution>
                <id>report</id>
                <phase>test</phase>
                <goals>
                    <goal>report</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
  ```
- 添加codecov.yml（参考：https://docs.codecov.com/docs/codecovyml-reference）
  ```
    codecov:
    require_ci_to_pass: yes
    coverage:
    status:
    patch: no
    project:
    default:
    threshold: 1%
    if_not_found: success
    changes: no
    precision: 2
    range: "50...100"
    ignore:
    - "test/.*"
    - ".github/.*"
    - ".mvn/.*"
    - ".style/.*"
    - "*.md"
      comment:
      layout: "reach,diff,flags,tree"
      behavior: default
      require_changes: no
  ```
- 修改.github/workflows/build.yml
  ```dtd
    - name: Codecov
      uses: codecov/codecov-action@v1.5.0
  ```
  
# 三、其他
https://shields.io/
