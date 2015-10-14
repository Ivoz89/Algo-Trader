package com.gft.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.model.db.StockHistory;


/**
 * Created by iozi on 06/10/2015.
 */
@RestController
public class ExampleRest {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get()  {
    	
    	
        return "Hello GFT";
    }

}
