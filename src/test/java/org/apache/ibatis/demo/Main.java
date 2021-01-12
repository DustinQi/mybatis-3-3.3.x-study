/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.demo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Description
 * @auther qimy
 * @date 2020/12/21
 */
public class Main {
    public static void main(String[] args) {
        try {
            String resource = "resources/mybatis-config.xml";
            // InputStream是java的类，和mybatis关系不大
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = sqlSessionFactory.openSession();
            // 获取mapper代理类
            FsiptUserMapper mapper = session.getMapper(FsiptUserMapper.class);
            // 执行代理类invoke方法
//            FsiptUser fsiptUser = mapper.selectUser("S67190");
//            System.out.println(fsiptUser.toString());
            FsiptUser fsiptBaseUser = mapper.selectBaseUser("S67190");
            System.out.println(fsiptBaseUser.toString());
        }catch (Exception e){
            System.out.println("error: "+ e);
        }
    }
}
