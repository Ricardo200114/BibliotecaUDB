package blb.controlador;

import blb.conexionDB.ConexionBD;
import blb.modelo.Materiales;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class MaterialControlador {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private static final Logger log = Logger.getLogger(MaterialControlador.class);

    public void registrar(Materiales libro) {

        String sql = "INSERT INTO materiales(cod_id,nombre_material,no_estante,tipo_material,autor,unidades) VALUES(?,?,?,?,?,?);";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, libro.getCodId());
            pst.setString(2, libro.getNombreMaterial());
            pst.setInt(3, libro.getNoEstante());
            pst.setString(4, libro.getTipoMaterial());
            pst.setString(5, libro.getAutor());
            pst.setInt(6, libro.getUnidades());
            pst.executeUpdate();
            pst.close();

            pst.close();
            con.close();

            log.info("Se ha ingresado un nuevo material a la tabla materiales en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {

            log.error("No se pudo ingresar el material a la tabla materiales en la base de datos..." + e.getCause());

        }

    }

    public Materiales consultarMaterial(String id_m) {

        Materiales libro = null;
        String sql = "SELECT * FROM materiales WHERE cod_id = ? LIMIT 1;";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);
            pst.setString(1, id_m);
            rs = pst.executeQuery();

            if (rs.next()) {

                libro = new Materiales();
                libro.setId(rs.getInt("id"));
                libro.setCodId(rs.getString("cod_id"));
                libro.setNombreMaterial(rs.getString("nombre_material"));
                libro.setNoEstante(rs.getInt("no_estante"));
                libro.setTipoMaterial(rs.getString("tipo_material"));
                libro.setAutor(rs.getString("tipo_material"));
                libro.setUnidades(rs.getInt("unidades"));

            }
            pst.close();
            rs.close();
            con.close();

            log.info("Se ha hecho una consulta a la tabla meteriales en la  base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo consultar la tabla materiales en la base de datos..." + e.getCause());

        }
        return libro;
    }

    public void modificar(Materiales libro) {

        String sql = "UPDATE materiales SET nombre_material=?, no_estante=?, tipo_material=?, unidades=? WHERE cod_id = ?";

        try {

            Class.forName(cn.getDriver());
            con = DriverManager.getConnection(cn.getUrl(), cn.getUser(), cn.getPwd());

            pst = con.prepareStatement(sql);

            pst.setString(1, libro.getNombreMaterial());
            pst.setInt(2, libro.getNoEstante());
            pst.setString(3, libro.getTipoMaterial());
            pst.setInt(4, libro.getUnidades());
            pst.setString(5, libro.getCodId());
            pst.executeUpdate();
            pst.close();

            pst.close();
            con.close();

            log.info("Se ha actualizado la tabla materiales en la base de datos...");

        } catch (SQLException | ClassNotFoundException e) {
            log.error("No se pudo actualizar la tabla materiales en la base de datos..." + e.getCause());

        }
    }

    public DefaultTableModel listarMateriales() {

        DefaultTableModel dtm = new DefaultTableModel();
        String sql = "SELECT cod_id,nombre_material,no_estante,tipo_material,autor,unidades FROM materiales ORDER BY cod_id;";

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

}
