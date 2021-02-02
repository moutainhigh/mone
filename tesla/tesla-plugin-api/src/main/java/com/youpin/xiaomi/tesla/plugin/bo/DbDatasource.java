/*
 *  Copyright 2020 Xiaomi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.youpin.xiaomi.tesla.plugin.bo;

import lombok.Data;

/**
 * @author goodjava@qq.com
 */
@Data
public class DbDatasource extends TeslaDatasource {


    public DbDatasource() {
        this.setType("mysql");
    }

    private String driverClass;

    private String dataSourceUrl;

    private String dataSourceUserName;

    private String dataSourcePasswd;

    private int defaultInitialPoolSize;

    private int defaultMaxPoolSize;

    private int defaultMinPoolSize;


}