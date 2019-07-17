package app.rest;

import app.dto.Home;
import app.dto.Parameters;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompareController {

    @RequestMapping(value = "/compare", method = RequestMethod.POST, consumes = {"application/json"})
    @ResponseBody
    public Parameters compare(@RequestBody Parameters params){

        return params;
    }

    @RequestMapping(value = "/compare/{id}", method = RequestMethod.POST, consumes = {"application/json"})
    @ResponseBody
    public Parameters compareID(@RequestBody Parameters params, @PathVariable("id") String id){

        return params;
    }
}
