/*
 *  vlife http://github.com/wwwlike/vlife
 *
 *  Copyright (C)  2018-2022 vlife
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package cn.wwwlike.auth.config;

import javax.inject.Named;

/**
 * 业务字典，用户可以对该字典进行维护
 */
public class AuthDict {
    @Named("用户类型")
    public static final class USER_TYPE {
    }
    @Named("项目阶段")
    public static final class PROJECT_STATE {
    }

    @Named("地区类型")
    public static final class AREA_LEVEL {
        @Named("省")
        public final static String PROVINCE = "1";
        @Named("市/州")
        public final static String CITY = "2";
        @Named("县/区")
        public final static String COUNTY = "3";
        @Named("乡镇/街")
        public final static String TOWN = "4";
        @Named("村/社区")
        public final static String VILLAGE = "5";
    }

    @Named("机构分类")
    public static final class ORG_TYPE {

    }

    @Named("数据维度")
    public static final class GROUP_SCOPE {
        @Named("查看本地区和下级地区数据")
        public final static Integer AREAS = 6;
        @Named("查看本地区数据")
        public final static Integer AREA = 5;
        @Named("查看本机构和下级机构数据")
        public final static Integer ORGS = 4;
        @Named("查看本机构数据")
        public final static Integer ORG = 3;
        @Named("查看本部门和下级部门数据")
        public final static Integer DEPTS = 2;
        @Named("查看本部门数据")
        public final static Integer DEPT = 1;
        @Named("查看本人数据")
        public final static Integer SELF = 0;
    }
//    VOID,
//    eq,
//    like,
//    notLike,
//    startsWith,
//    endsWith,
//    between,
//    notBetween,
//    gt,
//    goe,
//    lt,
//    loe,
//    in,
//    ne,
//    isNotNull,
//    isNull,
//    notIn;

    @Named("表单触发事件")
    public static final class EVENT_TYPE {
        @Named("值域等于设定的值")
        public final static String Equal = "equal";
        @Named("指定在指定几个值内")
        public final static String In = "in";
        @Named("目标值不为空")
        public final static String NotEmpty = "notEmpty";
        @Named("目标值为空")
        public final static String Empty = "Empty";
    }

}