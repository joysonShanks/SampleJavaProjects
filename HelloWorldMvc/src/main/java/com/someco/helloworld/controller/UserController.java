package com.someco.helloworld.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.someco.helloworld.exception.HelloWorldException;
import com.someco.helloworld.model.User;
import com.someco.helloworld.model.UserProfile;
import com.someco.helloworld.model.UserProfileType;
import com.someco.helloworld.service.UserProfileService;
import com.someco.helloworld.service.UserService;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
    AuthenticationTrustResolver authenticationTrustResolver;
	
	@Autowired
    UserProfileService userProfileService;
	
	@RequestMapping(value={"/registration"}, method = RequestMethod.GET)
	public String register(Model model) throws Exception{
		return "registration";
	}
	
	/*public void setUserService(UserService userService) {
		this.userService = userService;
	}*/
	
	/**
     * This method will provide UserProfile list to views
     */
    @ModelAttribute("roles")
    public List<UserProfile> initializeProfiles() {
        return userProfileService.findAll();
    }
     
    /**
     * This method handles Access-Denied redirect.
     */
    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("loggedinuser", getPrincipal());
        return "accessDenied";
    }
 
    /**
     * This method handles login GET requests.
     * If users is already logged-in and tries to goto login page again, will be redirected to list page.
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        if (isCurrentAuthenticationAnonymous()) {
            return "login";
        } else {
        	return "home";
        }
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "login";
    }
    
    /**
     * This method returns the principal[user-name] of logged-in user.
     */
    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
    
    /**
     * This method returns true if users is already authenticated [logged-in], else false.
     */
    private boolean isCurrentAuthenticationAnonymous() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authenticationTrustResolver.isAnonymous(authentication);
    }
    
    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public String newUser(User user)  throws HelloWorldException {
    	if(user.getUserName().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
    		throw new HelloWorldException("Please provide required user details");
    	}
    	try {
    		UserProfile userProfile = userProfileService.findById(1);
    		Set<UserProfile> userProfiles = new HashSet<>();
    		userProfiles.add(userProfile);
    		user.setUserProfiles(userProfiles);
    		userService.saveUser(user);
    	} catch(Exception ex) {
    		throw new HelloWorldException(ex.getMessage());
    	}
        return "registration";
    }
    
    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo() {
        return "userInfo";
    }
    
    @RequestMapping(value = "/getAllUsersByRole", method = RequestMethod.GET)
    public void getAllUsersByRole() throws HelloWorldException {
    	try {
    		UserProfile userProfile = userProfileService.findByType(UserProfileType.ADMIN);
        	userProfile.toString();
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }

}
