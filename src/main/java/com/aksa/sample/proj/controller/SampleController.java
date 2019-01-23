package com.aksa.sample.proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aksa.exceptions.utility.controller.BaseExceptionController;
import com.aksa.sample.proj.test.BSTree;
import com.aksa.sample.proj.test.QueueTest;
@RestController
public class SampleController extends  BaseExceptionController{
	static QueueTest bst;
	
	@GetMapping(path="/sample/test")
	public String sampleMethod(@RequestParam String req) throws Exception
	{
		req.length();
		//if(req.length()>0)
		//throw new Exception("Test Exception A k s ###");
		for(int i=0;i<50;i++) {
			 bst=new QueueTest();
		}
		return "Result";
	}

}
