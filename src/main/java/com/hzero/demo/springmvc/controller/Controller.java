package com.hzero.demo.springmvc.controller;

import com.hzero.demo.springmvc.model.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 3、一旦选择了合适的控制器， DispatcherServlet 会将请求发送给选中的控制器
 * 到了控制器，请求会卸下其负载（用户提交的请求）等待控制器处理完这些信息
 */
@org.springframework.stereotype.Controller
public class Controller {

    //value：请求路径 可以为空或者/  例如： http://.../ihome 和 http://.../ihome/
    //method：  指定请求的method类型， GET、POST、PUT、DELETE等；
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goHome(ModelMap modelMap) {

        modelMap.addAttribute("message", "This message is come from controller.");
        modelMap.put("user", new User("Aesop", "123"));

        System.out.println("submit");

//   4、当控制器在完成逻辑处理后，通常会产生一些信息，这些信息就是需要返回给用户并在浏览器上显示的信息，它们被称为模型（Model）。
//   仅仅返回原始的信息时不够的——这些信息需要以用户友好的方式进行格式化，一般会是 HTML，所以，信息需要发送给一个视图（view），通常会是 JSP。

        return "index";//非重定向的方式跳转，可能会造成数据重复提交

//    5、控制器所做的最后一件事就是将模型数据打包，并且表示出用于渲染输出的视图名（逻辑视图名）。
//    它接下来会将请求连同模型和视图名发送回 DispatcherServlet

    }


}
