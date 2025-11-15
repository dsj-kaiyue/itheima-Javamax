package com.itehima.demo14_commonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

public class commonsIoDemo1 {
    public static void main(String[] args) {
        try {
            FileUtils.copyFile(new File("day03-file-io/src/kaiyue.txt"),new File("day03-file-io/src/kaiyue1.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
