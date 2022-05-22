package hu.bme.aut.afk.thefutureofanonymus.webshop.Controller;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data.UserRepository;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;
import hu.bme.aut.afk.thefutureofanonymus.webshop.WebshopApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebshopUserDetailsService implements UserDetailsService {

    Logger logger = LoggerFactory.getLogger(WebshopUserDetailsService.class);
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            logger.warn("User doesn't exist");
            throw new UsernameNotFoundException(username);
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), grantedAuthorities);
    }
}
