package com.example.company.解析XML;

import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;

import java.io.File;

public class Hello {


    public static void main(String[] args) {


        Document document = XmlUtil.readXML(new File("E:\\oes\\oes-bc\\oes-bc-dispatcher\\src\\test\\java\\com\\wondertek\\oes\\bc\\dispatcher\\xml\\beginBc4G-many.xml"));

        String s = XmlUtil.toStr(document);

        System.out.println(s);

    }
}
