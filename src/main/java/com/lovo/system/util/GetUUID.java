package com.lovo.system.util;

import java.util.UUID;

/**
 * @author che
 * @title: GetUUID
 * @projectName sevelet2
 * @description: create a UUid
 * @date 2019/6/114:41
 */
public class GetUUID {

    public static String getUUid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
