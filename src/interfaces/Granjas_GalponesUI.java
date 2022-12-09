package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import modelo.Departamento;
import modelo.Empresa;
import modelo.Municipio;
import modelo.Granja;
import modelo.Galpon;

/**
 *
 * @author Marlon E. Zambrano Z.
 */
public class Granjas_GalponesUI extends javax.swing.JInternalFrame {

    private Empresa empresa;

    public Granjas_GalponesUI(Empresa empresa) {
        this.empresa = empresa;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipoGranja = new javax.swing.ButtonGroup();
        pnlFondo = new javax.swing.JPanel();
        tqtTitulo = new javax.swing.JLabel();
        pnlGranja = new javax.swing.JPanel();
        tqtDepartamento = new javax.swing.JLabel();
        tqtMunicipio = new javax.swing.JLabel();
        cbxDepartamento = new javax.swing.JComboBox<>();
        cbxMunicipio = new javax.swing.JComboBox<>();
        rbtnGranjaPropia = new javax.swing.JRadioButton();
        rbtnGranjaConvenio = new javax.swing.JRadioButton();
        pnlGalpon = new javax.swing.JPanel();
        tqtIdentificador = new javax.swing.JLabel();
        tqtAvesAdultasAAlojar = new javax.swing.JLabel();
        txfIdentificador = new javax.swing.JTextField();
        txfAvesAdultasAAlojar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGranjas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGalpones = new javax.swing.JTable();
        btnCrearGranja = new javax.swing.JButton();
        btnAgregarGalpon = new javax.swing.JButton();
        btnEliminarGranja = new javax.swing.JButton();
        btnEliminarGalpon = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelarTodo = new javax.swing.JButton();
        tqtCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tqtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tqtTitulo.setText("Gestionar Granjas y Galpones");
        pnlFondo.add(tqtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 890, -1));

        pnlGranja.setBackground(new java.awt.Color(255, 255, 255));
        pnlGranja.setBorder(javax.swing.BorderFactory.createTitledBorder("Granja"));

        tqtDepartamento.setText("Departamento :");

        tqtMunicipio.setText("Municipio :");

        cbxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rbtnGranjaPropia.setText("Propia");

        rbtnGranjaConvenio.setText("Convenio");

        javax.swing.GroupLayout pnlGranjaLayout = new javax.swing.GroupLayout(pnlGranja);
        pnlGranja.setLayout(pnlGranjaLayout);
        pnlGranjaLayout.setHorizontalGroup(
            pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGranjaLayout.createSequentialGroup()
                .addGroup(pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGranjaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rbtnGranjaPropia)
                        .addGap(33, 33, 33)
                        .addComponent(rbtnGranjaConvenio))
                    .addGroup(pnlGranjaLayout.createSequentialGroup()
                        .addGroup(pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGranjaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(tqtMunicipio)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGranjaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tqtDepartamento)
                                .addGap(18, 18, 18)))
                        .addGroup(pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxDepartamento, 0, 245, Short.MAX_VALUE)
                            .addComponent(cbxMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlGranjaLayout.setVerticalGroup(
            pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGranjaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tqtDepartamento)
                    .addComponent(cbxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tqtMunicipio)
                    .addComponent(cbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnGranjaPropia)
                    .addComponent(rbtnGranjaConvenio))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlGranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 390, 140));

        pnlGalpon.setBackground(new java.awt.Color(255, 255, 255));
        pnlGalpon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 228, 229)), "Galpon"));

        tqtIdentificador.setText("Identificador :");

        tqtAvesAdultasAAlojar.setText("Aves adultas ha alojar :");

        txfAvesAdultasAAlojar.setText("jTextField2");

        javax.swing.GroupLayout pnlGalponLayout = new javax.swing.GroupLayout(pnlGalpon);
        pnlGalpon.setLayout(pnlGalponLayout);
        pnlGalponLayout.setHorizontalGroup(
            pnlGalponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGalponLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlGalponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tqtAvesAdultasAAlojar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tqtIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGalponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(txfAvesAdultasAAlojar))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlGalponLayout.setVerticalGroup(
            pnlGalponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGalponLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlGalponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tqtIdentificador)
                    .addComponent(txfIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlGalponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tqtAvesAdultasAAlojar)
                    .addComponent(txfAvesAdultasAAlojar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlGalpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 360, 140));

        tbGranjas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGranjas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbGranjas);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 390, 230));

        tbGalpones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbGalpones);

        pnlFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 360, 230));

        btnCrearGranja.setText("Crear Granja");
        pnlFondo.add(btnCrearGranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, -1));

        btnAgregarGalpon.setText("Agregar");
        pnlFondo.add(btnAgregarGalpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        btnEliminarGranja.setText("Eliminar Granja");
        pnlFondo.add(btnEliminarGranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnEliminarGalpon.setText("Eliminar");
        pnlFondo.add(btnEliminarGalpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        btnGuardar.setText("Guardar");
        pnlFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 390, -1));

        btnCancelarTodo.setText("Cancelar Todo");
        pnlFondo.add(btnCancelarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 360, -1));

        tqtCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tqtCerrar.setText("X");
        pnlFondo.add(tqtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarGalpon;
    private javax.swing.JButton btnCancelarTodo;
    private javax.swing.JButton btnCrearGranja;
    private javax.swing.JButton btnEliminarGalpon;
    private javax.swing.JButton btnEliminarGranja;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup btngTipoGranja;
    private javax.swing.JComboBox<Departamento> cbxDepartamento;
    private javax.swing.JComboBox<Municipio> cbxMunicipio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlGalpon;
    private javax.swing.JPanel pnlGranja;
    private javax.swing.JRadioButton rbtnGranjaConvenio;
    private javax.swing.JRadioButton rbtnGranjaPropia;
    private javax.swing.JTable tbGalpones;
    private javax.swing.JTable tbGranjas;
    private javax.swing.JLabel tqtAvesAdultasAAlojar;
    private javax.swing.JLabel tqtCerrar;
    private javax.swing.JLabel tqtDepartamento;
    private javax.swing.JLabel tqtIdentificador;
    private javax.swing.JLabel tqtMunicipio;
    private javax.swing.JLabel tqtTitulo;
    private javax.swing.JTextField txfAvesAdultasAAlojar;
    private javax.swing.JTextField txfIdentificador;
    // End of variables declaration//GEN-END:variables

    //private class modeloMunicipio implements ComboBoxModel<Municipio> {}
    private class modeloMostrarGranjas extends AbstractTableModel {

        private String[] encabezadosColumna = {"Departamento", "Municipio", "Estado"};

        @Override
        public int getRowCount() {
            return empresa.getGranjas().size();
        }

        @Override
        public int getColumnCount() {
            return encabezadosColumna.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Granja g = empresa.getGranjas().get(rowIndex);
            switch (columnIndex) {
                case 0:
                    g.getMunicipio().getDepartamento();
                case 1:
                    g.getMunicipio();
                case 2:
                    g.getEstadoConvenio();
            }
            return "";
        }

        @Override
        public String getColumnName(int column) {
            return encabezadosColumna[column];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

    }

    private class MostrarGalpones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Granja gSeleccionada = empresa.getGranjas().get(tbGranjas.getSelectedRow());
            tbGalpones.setModel(new AbstractTableModel() {
                private String[] encabezadosColumn = {"Identificador", "Aves adultas alojadas"};

                @Override
                public int getRowCount() {
                    return gSeleccionada.getGalpones().size();
                }

                @Override
                public int getColumnCount() {
                    return encabezadosColumn.length;
                }

                @Override
                public Object getValueAt(int rowIndex, int columnIndex) {
                    Galpon galpon = gSeleccionada.getGalpones().get(rowIndex);
                    switch (columnIndex) {
                        case 0:
                            galpon.getIdentificador();
                        case 1:
                            galpon.getCantidadAvesAlojadas();
                    }
                    return "";
                }

                @Override
                public String getColumnName(int column) {
                    return encabezadosColumn[column];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            });
        }

    }

    private class manejadorConvenio implements ActionListener {
        
    }

    private class manejadorCrearGranja implements ActionListener {

    }

    private class manejadorEliminarGranja implements ActionListener {

    }

    private class manejadorAgregarGalpon implements ActionListener {

    }

    private class manejadorEliminarGalpon implements ActionListener {

    }

    private class manejadorGuardar implements ActionListener {

    }

    private class manejadorCancelarTodo implements ActionListener {

    }

}
