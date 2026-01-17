package com.achala.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.achala.model.Employee;
import com.achala.util.DBUtil;

public class EmployeeDAO {

    public static void save(Employee e) {

        String sql = "INSERT INTO employee_profile VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, e.getEmpId());
            ps.setString(2, e.getFullName());
            ps.setString(3, e.getGender());
            ps.setString(4, e.getMaritalStatus());
            ps.setString(5, e.getRoleType());
            ps.setString(6, e.getPrimarySkills());
            ps.setString(7, e.getSecondarySkills());
            ps.setString(8, e.getCertifications());
            ps.setInt(9, e.getTotalExp());
            ps.setInt(10, e.getAchalaExp());
            ps.setInt(11, e.getSkillRating());
            ps.setString(12, e.getSkillGaps());
            ps.setString(13, e.getResourcing());
            ps.setString(14, e.getOnCall());
            ps.setString(15, e.getComments());

            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
