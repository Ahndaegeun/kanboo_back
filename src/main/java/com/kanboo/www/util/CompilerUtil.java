package com.kanboo.www.util;


import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompilerUtil {

    public Map<String, String[]> createCmd(Map<String, String> pathList) {
        Map<String, String[]> resultList = new HashMap<>();
        String[] compileCmd = {"/bin/sh", "-c", " javac -cp . -d " + pathList.get("classPath") + " $(find " + pathList.get("srcPath") + " -name \"*.java\")"};
        String[] createManifestCmd = {"/bin/sh", "-c", " jar -cfvm " + pathList.get("jarNameAndPath") + " " + pathList.get("manifestNameAndPath") + " " + pathList.get("classPath")};
        String[] setJarCmd = {"/bin/sh", "-c", " jar -xvf " + pathList.get("jarNameAndPath") + " " + pathList.get("topPath")};
        String[] setManifestCmd = {"/bin/sh", "-c", " jar -cfvm " + pathList.get("jarNameAndPath") + " " + pathList.get("manifestNameAndPath") + " " + pathList.get("classPath")};
        String[] runJarCmd = {"/bin/sh", "-c",  " java -jar " + pathList.get("jarNameAndPath")};

        resultList.put("compileCmd", compileCmd);
        resultList.put("createManifestCmd", createManifestCmd);
        resultList.put("setJarCmd", setJarCmd);
        resultList.put("setManifestCmd", setManifestCmd);
        resultList.put("runJarCmd", runJarCmd);

        return resultList;
    }

    public String terminalCompile(String[] cmd) {
        StringBuffer output = new StringBuffer();
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            List<String> result = IOUtils.readLines(process.getInputStream());
            result.forEach(output::append);
        } catch(Exception e) {
            output.append(e.getMessage());
        }

        return output.toString();
    }

//    public static void main(String[] args) {
//        String classPath = "/Users/andaegeun/Desktop/manifestTest/www/test/class";
//        String srcPath = "/Users/andaegeun/Desktop/manifestTest/www/test/src";
//        String jarNameAndPath = "/Users/andaegeun/Desktop/manifestTest/www/test/lib/test.jar";
//        String manifestNameAndPath = "/Users/andaegeun/Desktop/manifestTest/www/test/META-INF/Manifest.txt";
//        String topPath = "/Users/andaegeun/Desktop/manifestTest/www/test";
//
//        Map<String, String> pathList = new HashMap<>();
//        pathList.put("classPath", classPath);
//        pathList.put("srcPath", srcPath);
//        pathList.put("jarNameAndPath", jarNameAndPath);
//        pathList.put("manifestNameAndPath", manifestNameAndPath);
//        pathList.put("topPath", topPath);
//
//        Map<String, String[]> cmdMap = createCmd(pathList);
//
//        terminalCompile(cmdMap.get("compileCmd"));
//        terminalCompile(cmdMap.get("createManifestCmd"));
//        terminalCompile(cmdMap.get("setJarCmd"));
//        terminalCompile(cmdMap.get("setManifestCmd"));
//        String result = terminalCompile(cmdMap.get("runJarCmd"));
//
//        System.out.println("result --> " + result);
//    }

}
