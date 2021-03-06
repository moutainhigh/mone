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

package com.xiaomi.youpin.tesla.billing.dataobject;

import lombok.Data;
import org.nutz.dao.entity.annotation.*;

import java.util.List;

/**
 * @author goodjava@qq.com
 * @date 2020/8/4
 * 账户表
 * 一个project 一个 账户
 */
@Data
@Table("tesla_billing_acount")
public class Account {

    @Id
    private int id;

    /**
     * projectId
     */
    @Column("biz_id")
    private long bizId;

    /**
     * 比如envId 列表
     */
    @Column("sub_biz_id_list")
    @ColDefine(type = ColType.MYSQL_JSON)
    private List<Long> subBizIdList;

    @Column
    private long ctime;

    @Column
    private long utime;

    @Column
    private int status;

    @Column
    private int version;

    @Column("account_group")
    private int accountGroup;

}
