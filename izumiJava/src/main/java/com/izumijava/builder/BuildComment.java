package com.izumijava.builder;

import com.izumijava.bean.Constants;
import com.izumijava.utils.DateUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BuildComment {
    public static void createClassComment(BufferedWriter bw, String classComment) throws Exception {
        /**
         * @Description:xxx
         * @author:xxx
         * @date: 2023/5/23
         */
        bw.write("/**");
        bw.newLine();
        bw.write(" * @Description:" + classComment);
        bw.newLine();
        bw.write(" * @author:" + Constants.AUTHOR_COMMENT);
        bw.newLine();
        bw.write(" * @Date:" + DateUtils.format(new Date(), DateUtils._YYYYMMDD));
        bw.newLine();
        bw.write(" */");
        bw.newLine();
    }

    public static void createFieldComment(BufferedWriter bw, String fieldComment) throws Exception {
        bw.write("\t/**");
        bw.newLine();
        bw.write("\t * " + (fieldComment == null ? "" : fieldComment));
        bw.newLine();
        bw.write("\t */");
        bw.newLine();
    }

    public static void createMethodComment() {

    }

}
