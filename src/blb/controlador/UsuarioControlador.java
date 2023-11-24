package blb.controlador;

import blb.conexionDB.ConexionBD;
import blb.modelo.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class UsuarioControlador {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private static final Logger log = Logger.getLogger(UsuarioControlador.class);

    public void registrarUsuario(Usuarios user) {

        String sql = "INSERT INTO usuarios(id_user,nombres,apellidos,oficio,username,password,recargo_mora) VALUES(?,?,?,?,?,?,?);";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, user.getIdUser());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getApellido());
            pst.setString(4, user.getOficio());
            pst.setString(5, user.getUsername());
            pst.setString(6, user.getPassword());
            pst.setInt(7, user.getRecargo_mora());
            pst.executeUpdate();

            pst.close();
            con.close();

            log.info("Se ha registrado un nuevo usuario en la tabla usuarios en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo registrar usuario a la tabla usuarios en la base de datos..." + e.getCause());

        }
    }

    public Usuarios log_In(String u, String p) {

        Usuarios user = null;
        String sql = "SELECT * FROM usuarios WHERE username=? AND password =?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, u);
            pst.setString(2, p);
            rs = pst.executeQuery();

            if (rs.next()) {
                user = new Usuarios();
                user.setId(rs.getInt("id"));
                user.setIdUser(rs.getString("id_user"));
                user.setNombre(rs.getString("nombres"));
                user.setApellido(rs.getString("apellidos"));
                user.setOficio(rs.getString("oficio"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRecargo_mora(rs.getInt("recargo_mora"));
            }
            rs.close();
            pst.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla usuarios en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo consultar a la tabla usuarios en la base de datos...");
            System.err.print(e.getCause());
        }
        return user;
    }

    public Usuarios verificarUsuario(String id, String nombre) {

        Usuarios user = null;
        String sql = "SELECT * FROM usuarios WHERE id_user=? AND username =?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, nombre);
            rs = pst.executeQuery();

            if (rs.next()) {
                user = new Usuarios();
                user.setId(rs.getInt("id"));
                user.setIdUser(rs.getString("id_user"));
                user.setNombre(rs.getString("nombres"));
                user.setApellido(rs.getString("apellidos"));
                user.setOficio(rs.getString("oficio"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRecargo_mora(rs.getInt("recargo_mora"));
            }
            rs.close();
            pst.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla usuarios en la base de datos para verificar existencia de usuario...");

        } catch (SQLException | ClassNotFoundException e) {
            log.info("No se pudo consultar a la tabla usuarios en la base de datos para verificar existencia de usuario..." + e.getCause());

        }
        return user;
    }

    public DefaultTableModel listarUsuariosMora() {

        DefaultTableModel dtm = new DefaultTableModel();
        String sql = "SELECT id_user,nombres,apellidos,oficio,recargo_mora FROM usuarios WHERE oficio = 'ESTUDIANTE' OR oficio = 'PROFESOR' ORDER BY id_user;";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            ResultSetMetaData rMeta = rs.getMetaData();
            int numeroColumna = rMeta.getColumnCount();

            for (int i = 1; i <= numeroColumna; i++) {
                dtm.addColumn(rMeta.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numeroColumna];
                for (int i = 0; i < numeroColumna; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                dtm.addRow(fila);
            }

            pst.close();
            rs.close();
            con.close();

        } catch (Exception e) {
            System.err.print(e.getCause());
        }
        return dtm;
    }

    public Usuarios consultarPorId(String id_user) {

        Usuarios user = null;
        String sql = "SELECT * FROM usuarios WHERE id_user = ? LIMIT 1;";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, id_user);
            rs = pst.executeQuery();

            while (rs.next()) {
                user = new Usuarios();
                user.setId(rs.getInt("id"));
                user.setIdUser(rs.getString("id_user"));
                user.setNombre(rs.getString("nombres"));
                user.setApellido(rs.getString("apellidos"));
                user.setOficio(rs.getString("oficio"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRecargo_mora(rs.getInt("recargo_mora"));
            }
            rs.close();
            pst.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla usuarios en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo consultar a la tabla usuarios en la base de datos...");
            System.err.print(e.getCause());
        }
        return user;
    }

    public void sancionar(Usuarios user) {

        String sql = "UPDATE usuarios SET recargo_mora = ? WHERE id_user = ?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getRecargo_mora());
            pst.setString(2, user.getIdUser());
            pst.executeUpdate();
            pst.close();
            con.close();

            log.info("Se ha actualizado el campo recargo_mora a la tabla usuarios en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.info("No se pudo actualizar el campo recargo_mora a la tabla usuarios en la base de datos..." + e.getCause());

        }
    }

    public void pagarRecargo(Usuarios user) {

        String sql = "UPDATE usuarios SET recargo_mora = ? WHERE id_user = ?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getRecargo_mora());
            pst.setString(2, user.getIdUser());
            pst.executeUpdate();
            pst.close();
            con.close();

            log.info("Se ha actualizado el campo recargo_mora a la tabla usuarios en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo actualizar el campo recargo_mora a la tabla usuarios en la base de datos..." + e.getCause());

        }
    }

    public void restablecerContraseña(Usuarios user) {

        String sql = "UPDATE usuarios SET password = ? WHERE id_user = ?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, user.getPassword());
            pst.setString(2, user.getIdUser());
            pst.executeUpdate();
            pst.close();
            con.close();

            log.info("Se ha actualizado el campo password a la tabla usuarios en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo actualizar el campo password a la tabla usuarios en la base de datos..." + e.getCause());

        }
    }

}
