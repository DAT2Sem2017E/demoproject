package data;

import control.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk created on Sep 4, 2017 
 */
public class UserMapper {
    public List<User> getAllUsers() throws SQLException{
        String sql = "SELECT name, password FROM log_in";
        PreparedStatement pstmt = Connector.getConnection().prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<User> users = new ArrayList();
        while(rs.next()){
            String username = rs.getString("name");
            String password = rs.getString("password");
            users.add(new User(username, password));
        }
        return users;
    }
    public boolean register(User user) throws SQLException{
        String sql = "INSERT INTO log_in (name, password) VALUES (?, ?)";
        PreparedStatement pstmt = Connector.getConnection().prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        if(pstmt.executeUpdate()>0)
            return true;
        return false;
    }
    public static void main(String[] args) throws SQLException {
        List<User> users = new UserMapper().getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
