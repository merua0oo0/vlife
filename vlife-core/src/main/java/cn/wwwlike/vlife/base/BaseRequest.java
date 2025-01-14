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

package cn.wwwlike.vlife.base;

import cn.wwwlike.base.model.IModel;
import cn.wwwlike.vlife.utils.GenericsUtils;

/**
 * 查询条件Query的模型的接口，支持排序
 */
public interface BaseRequest<E extends Item> extends IOrder  , IModel {
    /**
     * 返回泛型里的对应的实体类clz信息
     *
     * @return
     */
    default Class<E> getEntity() {
        return GenericsUtils.getGenericType(getClass());
    }
}
