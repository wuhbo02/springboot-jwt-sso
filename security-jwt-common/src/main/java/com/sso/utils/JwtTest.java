package com.sso.utils;

import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author:
 * @create: 2019-12-03 11:08
 */
public class JwtTest {
    private String privateKey = "c:/tools/auth_key/id_key_rsa";

    private String publicKey = "c:/tools/auth_key/id_key_rsa.pub";

    @Test
    public void test1() throws Exception{
        RsaUtils.generateKey(publicKey,privateKey,"dpb",1024);
    }

}

