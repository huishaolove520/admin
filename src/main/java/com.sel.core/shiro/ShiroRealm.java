package com.sel.core.shiro;

import com.sel.core.dao.IUserDao;
import com.sel.core.entity.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;
import org.springframework.beans.factory.annotation.Autowired;


public class ShiroRealm implements Realm{

    @Autowired
    private IUserDao userDao;

    @Override
    public String getName() {
        return "shiroRealm";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        User user = userDao.getUserByAccount(username);
        System.out.println(user.toString());
        String mdtPassword = DigestUtils.md5Hex(password);
        System.out.println(mdtPassword);
        if (!mdtPassword.equals(user.getPassword())){
            throw new IncorrectCredentialsException(); //如果密码错误
        }
        return new SimpleAuthenticationInfo(username, password,getName());
    }
}
