package com.chunlink;

import java.sql.Connection;

public abstract class DBUtil {
    public abstract Connection getConnection();
    public abstract void tip();
}
