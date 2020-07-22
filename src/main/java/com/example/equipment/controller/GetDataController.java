package com.example.equipment.controller;

import com.example.equipment.util.HttpClientUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/getdate")
public class GetDataController {


    @PostMapping("/getBy")
    public String getData(String dev_uid,String sel_io) {
        HttpClientUtil c=new HttpClientUtil();
        String url="http://get.iot.o8y.net/Pro_Get/?type=4&way=&dev_uid="+dev_uid+"&api_key=B895C0F76C9D18DDBC52F819B0302A85&sel_io="+sel_io+"";
        try {
            return HttpClientUtil.httpGetOperation(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
