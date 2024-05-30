package jdbc.config;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSetup {

    public void createTableAndStoredProcedure() throws SQLException {
        String createTableSql = "CREATE TABLE IF NOT EXISTS persons" +
                "(id SERIAL PRIMARY KEY, name VARCHAR(30), age DOUBLE PRECISION)";

        String deleteFunction = "DROP FUNCTION IF EXISTS insert_person(VARCHAR(30), DOUBLE PRECISION)";

        String createFunction = "CREATE OR REPLACE FUNCTION insert_person(name_in VARCHAR(30), age_in DOUBLE PRECISION) " +
                "RETURNS INTEGER AS $$ " +
                "DECLARE " +
                "    inserted_id INTEGER; " +
                "BEGIN " +
                "    INSERT INTO persons(name, age) VALUES (name_in, age_in) RETURNING id INTO inserted_id; " +
                "    RETURN inserted_id; " +
                "END; " +
                "$$ LANGUAGE plpgsql";

        Connection databaseConnection = DatabaseConfiguration.getConnection();
        Statement stmt = databaseConnection.createStatement();

        stmt.execute(createTableSql);
        stmt.execute(deleteFunction);
        stmt.execute(createFunction);
    }
}
