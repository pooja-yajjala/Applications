package com.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  
import com.crudbeans.Emp;  
  
public class EmpDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Emp p){  
    String sql="insert into employee(name,salary,designation,phoneno,email) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"','"+p.getPhoneno()+"','"+p.getEmail()+"')";  
    return template.update(sql);  
}  
public int update(Emp p){  
    String sql="update employee set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"',phoneno='"+p.getPhoneno()+"',email='"+p.getEmail()+"' where id="+p.getId()+"";  
    return template.update(sql);  
}  
public int delete(int id){  
    String sql="delete from employee where id="+id+"";  
    return template.update(sql);  
}  
public Emp getEmpById(int id){  
    String sql="select * from employee where id=?";  
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));  
}  
public List<Emp> getEmployees(){  
    return template.query("select * from employee",new RowMapper<Emp>(){  
        public Emp mapRow(ResultSet rs, int row) throws SQLException {  
            Emp e=new Emp();  
            e.setId(rs.getInt(1));  
            e.setName(rs.getString(2));  
            e.setSalary(rs.getFloat(3));  
            e.setDesignation(rs.getString(4));  
            e.setPhoneno(rs.getString(5));
            e.setEmail(rs.getString(6));
            return e;  
        }  
    });  
}  
}  