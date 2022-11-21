package com.lab6.downloaders;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ProxyDownloaderWithCache implements Downloader {

    private final Downloader proxyDownloader;
    private final Map<String, File> cachedFiles;

    public ProxyDownloaderWithCache(Downloader proxyDownloader) {
        this.proxyDownloader = proxyDownloader;
        cachedFiles = new HashMap<String, File>();
    }

    public File downloadFile(String fileName) {
        File resultFile;
        if (cachedFiles.containsKey(fileName)) {
            System.out.println("/_/_/ proxy downloader log: acquiring file from cached memory...: " + fileName + " /_/_/");
            resultFile = cachedFiles.get(fileName);
        } else {
            System.out.println("/_/_/ proxy downloader log: file entitled: '" + fileName + "' isn't cached yet. call proxy and put '" + fileName + "' into cache... /_/_/");
            resultFile = proxyDownloader.downloadFile(fileName);
            cachedFiles.put(fileName, resultFile);
        }
        return resultFile;
    }
}
