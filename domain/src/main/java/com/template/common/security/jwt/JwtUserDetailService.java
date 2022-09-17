package com.template.common.security.jwt;

import com.template.persistence.user.dao.UserRepository;
import com.template.persistence.user.entity.User;
import com.template.persistence.user.entity.UserAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JwtUserDetailService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Account [" + username + "] not found exception"));
    return UserAdapter.makeAdaptor(user);
  }

}
