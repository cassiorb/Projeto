import java.sql.*;

public class Usuarios {

    public static class Usuario {
        private String email;
        private String senha;
        private String tipo;

        public Usuario(String email, String senha, String tipo) {
            this.email = email;
            this.senha = senha;
            this.tipo = tipo;
        }

        public String getEmail() { return email; }
        public String getSenha() { return senha; }
        public String getTipo() { return tipo; }
    }

    // Valida login consultando o banco
    public static Usuario validarLogin(String email, String senha) {
        String sql = "SELECT email, senha, tipo FROM usuarios WHERE email = ? AND senha = ?";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("tipo")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}