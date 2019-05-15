package com.example.client;

import com.example.base.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * <p>首页模板</p>
 *
 * @author lizhi
 * @description
 */
@RestController
public class PortalController extends BaseController {

    @RequestMapping(value = {"/", "/index"}, method={RequestMethod.GET})
    String index(ServletRequest req, ServletResponse resp) {
        return "index";
    }
}
