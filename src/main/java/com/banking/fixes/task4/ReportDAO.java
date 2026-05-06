package com.banking.fixes.task4;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

public class ReportDAO {

    private DataSource dataSource;

    public List<ReportEntry> fetchMonthlyReport(String accountId,
                                                int month, int year)
            throws SQLException {

        // FIX: Use try-with-resources to ensure Connection and PreparedStatement are closed
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT * FROM report_entries " +
                             "WHERE account_id = ? AND MONTH(entry_date) = ? " +
                             "AND YEAR(entry_date) = ?")) {

            ps.setString(1, accountId);
            ps.setInt(2, month);
            ps.setInt(3, year);

            // FIX: Ensure ResultSet is also closed to prevent connection leak
            try (ResultSet rs = ps.executeQuery()) {

                List<ReportEntry> entries = new ArrayList<>();

                while (rs.next()) {
                    entries.add(mapRow(rs)); // DO NOT MODIFY
                }

                return entries;
            }
        }
    }

    private ReportEntry mapRow(ResultSet rs) throws SQLException {
        return new ReportEntry(); // placeholder
    }
}
