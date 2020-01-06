package com.deloitte.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.deloitte.bean.User;
import com.deloitte.util.DBUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public String getUserType(User user) {
		Connection conn = DBUtil.getConnection();
		String query = "select password, type from User_details where login =?";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, user.getLogin());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String password = rs.getString(1);
				String type = rs.getString(2);
				if (password.equals(user.getPassword())) {
					return type;
				}
			} else {
				System.out.println("else loop");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void closeConnection() {
		DBUtil.closeConnection();
		
	}

	@Override
	public boolean createUser(User user) {
		Connection conn = DBUtil.getConnection();
		String query = "insert into user_details values(?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, user.getLogin());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getType());
			// ResultSet rs = stmt.executeQuery();
			int rows = stmt.executeUpdate();
			if(rows > 0) {
				System.out.println("Data inserted into table");
				return true;
			}
			else {
				System.out.println("Insert Failed");
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
