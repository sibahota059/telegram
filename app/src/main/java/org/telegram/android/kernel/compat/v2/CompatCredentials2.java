package org.telegram.android.kernel.compat.v2;

import org.telegram.android.kernel.compat.v1.CompatContextPersistence;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ex3ndr
 * Date: 18.09.13
 * Time: 2:02
 * To change this template use File | Settings | File Templates.
 */
public class CompatCredentials2 extends CompatContextPersistence implements Serializable {
    private TLUserCompat2 user;
    private int expires;

    public TLUserCompat2 getUser() {
        return user;
    }

    public int getExpires() {
        return expires;
    }
}