package com.example.spring_postgres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller  //means that this class is a controller
@RequestMapping(path="/demo") //mapping the endpoint

public class MainController {
    @AutoWired //to get the bean called UserRepository(stores the records)

    private UserRepository userRepo;

    @PostMapping(path="/add") // map POST REQUESTS only
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepo.save(n);
    return "User saved successfully";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable <User> getAllUsers(){
        //this method return JSON or an XML withe all the users
        return userRepo.findAll();
    }
    
    
}
