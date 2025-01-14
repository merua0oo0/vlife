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

package cn.wwwlike.vlife.objship.read.tag;

import lombok.Data;

/**
 * 字段注释信息
 */
@Data
public class FieldTag {
    /**
     * 字段名
     */
    public String fieldName;
    /**
     * 字段类型
     */
    public String fieldType;
    /**
     * 继承的字段
     */
    public Boolean extendsField;
    /**
     * 包装类型
     */
    public String warperType;
    /**
     * 说明
     */
    public String title;
}
