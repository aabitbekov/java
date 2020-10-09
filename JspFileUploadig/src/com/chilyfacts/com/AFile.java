package com.chilyfacts.com;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AFile extends File{
	private File file;
	public AFile(){
        super("null");
        this.file = null;
    }
	
	 public AFile(File file){
	        super(file.getPath());
	        this.file = file;
	}
	 public String getDate(){
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
         return simpleDateFormat.format(file.lastModified());
     }

     public double getSize(){
         return Math.round((double)file.length()/(1024));
     }
    @Override
     public String getPath(){
        return file.getPath();
     }
    @Override
     public String getName(){
        return file.getName();
     }
    @Override
     public boolean isFile(){
        return file.isFile();
     }
     @Override
     public boolean isDirectory(){
        return file.isDirectory();
     }
     
     public  ArrayList<AFile> getFiles(File rootFile,String filename) {
         ArrayList<AFile> fileList = new ArrayList<>();
         if (rootFile.isDirectory()) {
             System.out.println("searching: " + rootFile.getAbsolutePath());
             File[] directoryFiles = rootFile.listFiles();
             if (directoryFiles != null) {
                 for (File file: directoryFiles) {
                     if (file.isDirectory()) {
                         getFiles(file,filename);
                     } else {
                         if (file.getName().equalsIgnoreCase(filename)) {
                             fileList.add(new AFile(file));
                         }
                     }
                 }
             }
         }
         return fileList;
     }


	

}
