package com.lovo.system.util;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author che
 * @title: UploadUtil 文件上传工具类
 * @projectName forestpestproject
 * @description: 文件上传工具
 * @date 2019/6/18 17:46
 */
public class UploadUtil {
    /**
     * 返回 文件和表单 fileitem
     *
     * @param request
     * @return listFile=文件，listForm=表单
     * @throws FileUploadException
     */
    public Map<String, List<FileItem>> getFileItem(HttpServletRequest request) throws FileUploadException {
        //1、创建一个DiskFileItemFactory工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //2、创建一个文件上传解析器
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解决上传文件名的中文乱码
        upload.setHeaderEncoding("UTF-8");

        //获得页面的上传文件和表单文本
        List<FileItem> list = upload.parseRequest(request);
        //文件数据数组
        List<FileItem> listFile = new ArrayList<>();
        //表单数据数组
        List<FileItem> listForm = new ArrayList<>();

        Map<String, List<FileItem>> map = new HashMap<>();

        for (FileItem item : list) {
            //如果fileitem中封装的是普通输入项的数据
            if (item.isFormField()) {
                listForm.add(item);
            } else {//如果fileitem中封装的是上传文件
                listFile.add(item);
            }
        }
        if (listFile.size() > 0) {
            map.put("listFile", listFile);
        }
        if (listForm.size() > 0) {
            map.put("listForm", listForm);
        }
        return map;
    }
}