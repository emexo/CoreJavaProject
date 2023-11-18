package com.emexo.designpattern.bridge;

public interface FileDownloadImplementor
{
    public Object downloadFile(String path);

    public boolean storeFile(Object object);

    public boolean delete(String object);
}
