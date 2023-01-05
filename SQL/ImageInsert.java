package SQL;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageInsert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/database_name";
        String username = "root";
        String password = "password";

        String imagePath = "C:\\image.jpg";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            String sql = "INSERT INTO images (image) VALUES (?)";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setBinaryStream(1, new FileInputStream(imagePath));

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new image was inserted successfully!");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
