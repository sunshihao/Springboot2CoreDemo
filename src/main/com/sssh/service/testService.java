package com.sssh.service;
 
import com.sssh.entity.bnUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class testService {
 
    @Autowired
    private JdbcTemplate jdbcTemplate;
 
    public List getList(){
    	
        String sql = "select operid as user_id,tel as user_phone,opername as user_name,pass as his_money from cn_user";
        return (List) jdbcTemplate.query(sql, new RowMapper(){
 
            public bnUser mapRow(ResultSet rs, int rowNum) throws SQLException {
                bnUser bnUser = new bnUser();
                bnUser.setUserId(rs.getString("user_id"));
                bnUser.setUserPhone(rs.getString("user_phone"));
                bnUser.setUserName(rs.getString("user_name"));
                bnUser.setHisMoney(rs.getString("his_money"));
                
                return bnUser;
            }
 
        });
    }

}