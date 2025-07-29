package com.lyl.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.util.UUID;

/**
 *ClassName: FileController
 *Package: com.lyl.springmvc.controller
 *Description:创建于 2025/7/29 12:56
 *文件上传：将文件由浏览器上传至服务器
 *文件下载：将文件由服务器下载至本地
 *@Author lyl
 *@Version 1.0
 */
@Controller
public class FileController {
    @PostMapping ("/fileup")
    public String upload (@RequestParam ("filename") MultipartFile multipartFile ,
                          HttpServletRequest request) throws IOException {
//        System.out.println(multipartFile.getName());
//        System.out.println(multipartFile.getOriginalFilename());

        String originalFilename = multipartFile.getOriginalFilename();
        InputStream in = multipartFile.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(in);
//        System.out.println(request.getServletContext().getRealPath("/uploads"));
        File file = new File(request.getServletContext().getRealPath("/uploads"));
        if (! file.exists())
            file.mkdir();
        System.out.println(file.getPath() + "/photo.png");
        //名字相同的文件直接覆盖了
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getPath() + "/photo.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                file.getPath() + "/" + UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."))
        ));
        byte[] bytes = new byte[1024 * 100];
        int readCount = 0;
        while ((readCount = bis.read(bytes)) != - 1) {
            bos.write(bytes , 0 , readCount);
        }
        bos.flush();
        bos.close();
        bis.close();

        return "ok";
    }

    @GetMapping("/filedown")
    public ResponseEntity<byte[]> download(HttpServletRequest request, HttpServletResponse response) throws IOException {
        File file = new File(
                request.getServletContext().getRealPath("/uploads"+"/9aba140a-5037-4f6b-b9b0-a9701bf41a2d.png")
        );
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment",file.getName());
        return new ResponseEntity<byte[]>(Files.readAllBytes(file.toPath()),headers, HttpStatus.OK);

    }
}
