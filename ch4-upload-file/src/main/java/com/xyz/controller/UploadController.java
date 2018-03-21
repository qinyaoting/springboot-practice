package com.xyz.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/19/18
 * Time: 9:23 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("/home/chin/company/" +
            file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "err";
        }
    }
}
