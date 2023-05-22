package com.izumijava.builder;

import com.izumijava.utils.PropertiesUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Properties;

/**
 * 读table
 */
public class BuildTable {
    private static final Logger logger = LoggerFactory.getLogger(BuildTable.class);
    private static Connection conn = null;

    private static String SQL_SHOW_TABLE_STATUS = "show table status";

    static {
        String driverName = PropertiesUtils.getString("db.driver.name");
        String url = PropertiesUtils.getString("db.url");
        String user = PropertiesUtils.getString("db.username");
        String password = PropertiesUtils.getString("db.password");
        try {
            Class.forName(driverName);
            logger.error("驱动加载成功");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            logger.error("数据库连接失败", e);
        }
    }
    public static void getTables() {
        PreparedStatement ps = null;
        ResultSet tableResult = null;
        try {
            ps = conn.prepareStatement(SQL_SHOW_TABLE_STATUS);
            tableResult = ps.executeQuery();
            while(tableResult.next()) {
                String tableName = tableResult.getString("name");
                String comment = tableResult.getString("comment");
                logger.info("tableName:{}, comment: {}", tableName, comment);
            }
        }catch (Exception e) {
            logger.error("读取表失败");
        } finally {
            if(tableResult != null) {
                try {
                    tableResult.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}