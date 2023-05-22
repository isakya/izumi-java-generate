package com.izumijava;

import com.izumijava.bean.TableInfo;
import com.izumijava.builder.BuildTable;

import java.util.List;

public class RunApplication {
    public static void main(String[] args) {
        List<TableInfo> tableInfoList = BuildTable.getTables();

    }
}
