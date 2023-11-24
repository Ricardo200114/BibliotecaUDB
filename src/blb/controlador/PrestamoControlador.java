package blb.controlador;

import blb.conexionDB.ConexionBD;
import blb.modelo.Materiales;
import blb.modelo.Prestamos;
import blb.modelo.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class PrestamoControlador {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private static final Logger log = Logger.getLogger(PrestamoControlador.class);

    public void registrar(Prestamos lending) {

        String sql = "INSERT INTO prestamos(id_user,nombre_user,id_material,nombre_material,f_prestamo) VALUES(?,?,?,?,?);";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, lending.getIdUser());
            pst.setString(2, lending.getNombreUser());
            pst.setString(3, lending.getIdMaterial());
            pst.setString(4, lending.getNombreMaterial());
            pst.setString(5, lending.getF_prestamos());
            pst.executeUpdate();
            pst.close();

            pst.close();
            con.close();

            log.info("Se ha ingresado un nuevo prestamo a la tabla prestamos en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo ingresar el prestamo a la tabla prestamos en la base de datos..." + e.getCause());

        }
    }

    public void modificar(Prestamos lending) {

        String sql = "UPDATE prestamos SET id_user=?, nombre_user=?,id_material=?,nombre_material=?,f_prestamo=?,f_devolucion=? WHERE id=?;";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, lending.getIdUser());
            pst.setString(2, lending.getNombreUser());
            pst.setString(3, lending.getIdMaterial());
            pst.setString(4, lending.getNombreMaterial());
            pst.setString(5, lending.getF_prestamos());
            pst.setString(6, lending.getF_devolucion());
            pst.setInt(7, lending.getId());
            pst.executeUpdate();
            pst.close();

            pst.close();
            con.close();

            log.info("Se ha actualizado la tabla prestamos en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo actualizar la tabla prestamos en la base de datos..." + e.getCause());

        }
    }

    public void modificarPrestamo(Prestamos lending) {

        String sql = "UPDATE prestamos SET f_devolucion=? WHERE id_user=?;";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, lending.getF_devolucion());
            pst.setString(2, lending.getIdUser());
            pst.executeUpdate();
            pst.close();

            pst.close();
            con.close();

            log.info("Se ha actualizado el campo f_devolucion de la tabla prestamos en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo actualizar el campo f_devolucion de la tabla prestamos en la base de datos..." + e.getCause());

        }
    }

    public DefaultTableModel listarPrestamos() {

        DefaultTableModel dtm = new DefaultTableModel();
        String sql = "SELECT id_user,nombre_user,id_material,nombre_material,f_prestamo,f_devolucion FROM prestamos ORDER BY id_user;";

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

    public DefaultTableModel listarPrestamosPorUsuario(String id_user) {

        DefaultTableModel dtm = new DefaultTableModel();
        String sql = "SELECT id_user,nombre_user,id_material,nombre_material,f_prestamo,f_devolucion FROM prestamos WHERE id_user= '" + id_user + "'";

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

    public Prestamos getLending(Usuarios user, Materiales material) {

        Prestamos prestamo = null;
        String sql = "SELECT * FROM prestamos WHERE id_user=? AND id_material=? AND f_devolucion IS NULL ORDER BY id DESC LIMIT 1";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, user.getIdUser());
            pst.setString(2, material.getCodId());

            rs = pst.executeQuery();

            while (rs.next()) {
                prestamo = new Prestamos();
                prestamo.setId(rs.getInt("id"));
                prestamo.setIdUser(rs.getString("id_user"));
                prestamo.setNombreUser(rs.getString("nombre_user"));
                prestamo.setIdMaterial(rs.getString("id_material"));
                prestamo.setNombreMaterial(rs.getString("nombre_material"));
                prestamo.setF_prestamos(rs.getString("f_prestamo"));
                prestamo.setF_devolucion(rs.getString("f_devolucion"));
            }

            pst.close();
            rs.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla prestamos en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo consultar la tabla prestamos en la base de datos..." + e.getCause());

        }
        return prestamo;
    }

    public int cantidadPrestamos(Usuarios user) {

        int cantidadRegistros = 0;
        String sql = "SELECT COUNT(*) FROM prestamos WHERE id_user=? AND f_devolucion IS NULL;";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, user.getIdUser());
            rs = pst.executeQuery();
            if (rs.next()) {
                cantidadRegistros = Integer.parseInt(rs.getString(1));
            }
            rs.close();
            pst.close();
            con.close();

            log.info("Se ha hecho un conteo en la tabla prestamos en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo realizar el conteo a la tabla prestamos en la base de datos...");

        }
        return cantidadRegistros;
    }

}
