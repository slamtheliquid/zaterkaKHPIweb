package com.lab2.fileManagement;

import java.io.File;

public interface FileManager {
    File downloadFile(String fileIdentifier);
    void uploadFile(String fileIdentifier, File file);
}
