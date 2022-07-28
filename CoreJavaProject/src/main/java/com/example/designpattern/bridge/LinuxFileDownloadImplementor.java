package com.example.designpattern.bridge;

public class LinuxFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public Object downloadFile(String path) {
        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("File downloaded successfully in LINUX !!");
        return true;
    }

    @Override
    public boolean delete(String object) {
        return false;
    }

}