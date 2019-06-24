package com.lovo.system.util;

import java.util.UUID;

/**
 * @author che
 * @title: GetUUID
 * @projectName forestpestproject
 * @description: create a UUid
 * @date 2019/6/1 14:41
 */
public class GetUUID {

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
