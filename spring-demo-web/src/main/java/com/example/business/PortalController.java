package com.example.business;

import com.example.base.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = {"/", "/index"})
    ModelAndView index(ServletRequest req, ServletResponse resp) {
        return new ModelAndView("index");
    }
}
