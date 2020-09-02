package com.example.company.解析XML;

import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class Dom4jTextTest {

    @Test
    void creatXML() {

        Document document = Dom4jText.CreatXML();
        String s = document.asXML();

        log.info(s);

    }

    /**
     * 解析xml
     */
    @Test
    void parsingXML() {

        Document document = Dom4jText.ParsingXML();
        System.out.println();

        log.info(document.asXML());


    }

    @Test
    void iteratorsXML() {
    }

    @Test
    void XPathXML() throws DocumentException {

        Dom4jText.XPathXML();

//        Dom4jText.XPathXMLHuTool();
    }

    @Test
    void treeWalk() {
    }

    @Test
    void treeWalk_E() {
    }

    @Test
    void string_XML() {
    }
}