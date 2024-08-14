package formularios;

import clases.conectarMySQL;//Se utiliza para hacer cosas relacionadas a la base de datos MySQL

/**
 *Esta clase se utliza para realizar la comparación y fusión de ambas bases de datos
 * utilizando los métodos de las clases {@link conectarMySQL} y {@link conectarSQLite}
 * @author Emmanuel
 * @version 0.0.1
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
    }

    conectarMySQL MySQL=new conectarMySQL();//Se crea objeto MySQL para hacer cosas relacionadas a la base de datos
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlAccionesDB = new javax.swing.JPanel();
        pnlMysql = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMysql = new javax.swing.JTable();
        btnConectarMysql = new javax.swing.JButton();
        btnDesconectarMysql = new javax.swing.JButton();
        btnMostrarMysql = new javax.swing.JButton();
        btnEditarMysql = new javax.swing.JButton();
        tbnEliminarMysql = new javax.swing.JButton();
        pnlInsertarMysql = new javax.swing.JPanel();
        txtPlataformaMysql = new javax.swing.JTextField();
        lblPlataformaMysql = new javax.swing.JLabel();
        txtJuegoMysql = new javax.swing.JTextField();
        lblJuegoMysql = new javax.swing.JLabel();
        btnInsertarMysql = new javax.swing.JButton();
        pnlActualizarMysql = new javax.swing.JPanel();
        btnActualizarMysql = new javax.swing.JButton();
        txtPlataformaMysqlActualizar = new javax.swing.JTextField();
        lblPlataformaMysqlActualizar = new javax.swing.JLabel();
        txtJuegoMysqlActualizar = new javax.swing.JTextField();
        lblJuegoMysqlActualizar = new javax.swing.JLabel();
        txtIdMysql = new javax.swing.JTextField();
        lblIdMysql = new javax.swing.JLabel();
        pnlSqlite = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSqlite = new javax.swing.JTable();
        btnMostrarSqlite = new javax.swing.JButton();
        btnDesconectarSlite = new javax.swing.JButton();
        btnConectarSqlite = new javax.swing.JButton();
        pnlInsertarSqlite = new javax.swing.JPanel();
        txtPlataformaSqlite = new javax.swing.JTextField();
        lblPlataformaSqlite = new javax.swing.JLabel();
        txtJuegoSqlite = new javax.swing.JTextField();
        lblJuegoSqlite = new javax.swing.JLabel();
        btnInsertarSqlite = new javax.swing.JButton();
        pnlActualizarSqlite = new javax.swing.JPanel();
        btnActualizarSqlite = new javax.swing.JButton();
        txtPlataformaSqliteActualizar = new javax.swing.JTextField();
        lblPlataformaSqliteActualizar = new javax.swing.JLabel();
        txtJuegoSqliteActualizar = new javax.swing.JTextField();
        lblJuegoSqliteActualizar = new javax.swing.JLabel();
        txtIdSqlite = new javax.swing.JTextField();
        lblIdSqlite = new javax.swing.JLabel();
        btnEditarSqlite = new javax.swing.JButton();
        tbnEliminarSqlite = new javax.swing.JButton();
        pnlFusion = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFusion = new javax.swing.JTable();
        btnComparar = new javax.swing.JButton();
        btnFusionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prueba de sincronización MySQL-SQLite");
        setResizable(false);

        pnlMysql.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "MySQL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 18))); // NOI18N

        tblMysql.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Juego", "Plataforma", "Creación", "Actualización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMysql);

        btnConectarMysql.setText("Conectar");
        btnConectarMysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarMysqlActionPerformed(evt);
            }
        });

        btnDesconectarMysql.setText("Desconectar");
        btnDesconectarMysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarMysqlActionPerformed(evt);
            }
        });

        btnMostrarMysql.setText("Mostrar");
        btnMostrarMysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMysqlActionPerformed(evt);
            }
        });

        btnEditarMysql.setText("Editar");

        tbnEliminarMysql.setText("Eliminar");

        pnlInsertarMysql.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 14))); // NOI18N

        lblPlataformaMysql.setText("Plataforma:");

        lblJuegoMysql.setText("Juego:");

        btnInsertarMysql.setText("Insertar");

        javax.swing.GroupLayout pnlInsertarMysqlLayout = new javax.swing.GroupLayout(pnlInsertarMysql);
        pnlInsertarMysql.setLayout(pnlInsertarMysqlLayout);
        pnlInsertarMysqlLayout.setHorizontalGroup(
            pnlInsertarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarMysqlLayout.createSequentialGroup()
                .addComponent(btnInsertarMysql)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarMysqlLayout.createSequentialGroup()
                .addComponent(lblJuegoMysql)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJuegoMysql, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlataformaMysql)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlataformaMysql, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnlInsertarMysqlLayout.setVerticalGroup(
            pnlInsertarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarMysqlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJuegoMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlataformaMysql)
                    .addComponent(txtPlataformaMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJuegoMysql))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertarMysql)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlActualizarMysql.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 14))); // NOI18N

        btnActualizarMysql.setText("Actualizar");

        lblPlataformaMysqlActualizar.setText("Plataforma:");

        lblJuegoMysqlActualizar.setText("Juego:");

        txtIdMysql.setEditable(false);
        txtIdMysql.setEnabled(false);

        lblIdMysql.setText("ID:");

        javax.swing.GroupLayout pnlActualizarMysqlLayout = new javax.swing.GroupLayout(pnlActualizarMysql);
        pnlActualizarMysql.setLayout(pnlActualizarMysqlLayout);
        pnlActualizarMysqlLayout.setHorizontalGroup(
            pnlActualizarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarMysqlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPlataformaMysqlActualizar)
                    .addGroup(pnlActualizarMysqlLayout.createSequentialGroup()
                        .addComponent(lblIdMysql)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdMysql, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlActualizarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActualizarMysqlLayout.createSequentialGroup()
                        .addComponent(lblJuegoMysqlActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJuegoMysqlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlActualizarMysqlLayout.createSequentialGroup()
                        .addComponent(txtPlataformaMysqlActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarMysql)
                        .addGap(25, 25, 25))))
        );
        pnlActualizarMysqlLayout.setVerticalGroup(
            pnlActualizarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarMysqlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdMysql)
                    .addComponent(txtIdMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJuegoMysqlActualizar)
                    .addComponent(txtJuegoMysqlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlActualizarMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarMysql)
                    .addComponent(txtPlataformaMysqlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlataformaMysqlActualizar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMysqlLayout = new javax.swing.GroupLayout(pnlMysql);
        pnlMysql.setLayout(pnlMysqlLayout);
        pnlMysqlLayout.setHorizontalGroup(
            pnlMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMysqlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMysqlLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbnEliminarMysql)
                            .addComponent(btnEditarMysql))
                        .addContainerGap())
                    .addComponent(pnlActualizarMysql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInsertarMysql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMysqlLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnConectarMysql)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDesconectarMysql)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarMysql)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlMysqlLayout.setVerticalGroup(
            pnlMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMysqlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectarMysql)
                    .addComponent(btnDesconectarMysql)
                    .addComponent(btnMostrarMysql))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInsertarMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlActualizarMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMysqlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMysqlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMysqlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnEditarMysql)
                        .addGap(32, 32, 32)
                        .addComponent(tbnEliminarMysql)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSqlite.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "SQLite", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 18))); // NOI18N

        tblSqlite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Juego", "Plataforma", "Creación", "Actualización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSqlite);

        btnMostrarSqlite.setText("Mostrar");

        btnDesconectarSlite.setText("Desconectar");

        btnConectarSqlite.setText("Conectar");

        pnlInsertarSqlite.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Insertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 14))); // NOI18N

        lblPlataformaSqlite.setText("Plataforma:");

        lblJuegoSqlite.setText("Juego:");

        btnInsertarSqlite.setText("Insertar");

        javax.swing.GroupLayout pnlInsertarSqliteLayout = new javax.swing.GroupLayout(pnlInsertarSqlite);
        pnlInsertarSqlite.setLayout(pnlInsertarSqliteLayout);
        pnlInsertarSqliteLayout.setHorizontalGroup(
            pnlInsertarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarSqliteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarSqliteLayout.createSequentialGroup()
                        .addComponent(lblJuegoSqlite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJuegoSqlite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPlataformaSqlite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlataformaSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInsertarSqliteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInsertarSqlite)
                        .addGap(125, 125, 125))))
        );
        pnlInsertarSqliteLayout.setVerticalGroup(
            pnlInsertarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInsertarSqliteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInsertarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJuegoSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlataformaSqlite)
                    .addComponent(txtPlataformaSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJuegoSqlite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsertarSqlite)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlActualizarSqlite.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 14))); // NOI18N

        btnActualizarSqlite.setText("Actualizar");

        lblPlataformaSqliteActualizar.setText("Plataforma:");

        lblJuegoSqliteActualizar.setText("Juego:");

        txtIdSqlite.setEditable(false);
        txtIdSqlite.setEnabled(false);

        lblIdSqlite.setText("ID:");

        javax.swing.GroupLayout pnlActualizarSqliteLayout = new javax.swing.GroupLayout(pnlActualizarSqlite);
        pnlActualizarSqlite.setLayout(pnlActualizarSqliteLayout);
        pnlActualizarSqliteLayout.setHorizontalGroup(
            pnlActualizarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarSqliteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdSqlite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJuegoSqliteActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJuegoSqliteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlActualizarSqliteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPlataformaSqliteActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPlataformaSqliteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarSqlite)
                .addGap(25, 25, 25))
        );
        pnlActualizarSqliteLayout.setVerticalGroup(
            pnlActualizarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarSqliteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdSqlite)
                    .addComponent(txtIdSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJuegoSqliteActualizar)
                    .addComponent(txtJuegoSqliteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlActualizarSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarSqlite)
                    .addComponent(txtPlataformaSqliteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlataformaSqliteActualizar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnEditarSqlite.setText("Editar");

        tbnEliminarSqlite.setText("Eliminar");

        javax.swing.GroupLayout pnlSqliteLayout = new javax.swing.GroupLayout(pnlSqlite);
        pnlSqlite.setLayout(pnlSqliteLayout);
        pnlSqliteLayout.setHorizontalGroup(
            pnlSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSqliteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInsertarSqlite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlActualizarSqlite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSqliteLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbnEliminarSqlite)
                            .addComponent(btnEditarSqlite))))
                .addContainerGap())
            .addGroup(pnlSqliteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnConectarSqlite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesconectarSlite)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarSqlite)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pnlSqliteLayout.setVerticalGroup(
            pnlSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSqliteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectarSqlite)
                    .addComponent(btnDesconectarSlite)
                    .addComponent(btnMostrarSqlite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInsertarSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlActualizarSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlSqliteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSqliteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSqliteLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnEditarSqlite)
                        .addGap(32, 32, 32)
                        .addComponent(tbnEliminarSqlite)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAccionesDBLayout = new javax.swing.GroupLayout(pnlAccionesDB);
        pnlAccionesDB.setLayout(pnlAccionesDBLayout);
        pnlAccionesDBLayout.setHorizontalGroup(
            pnlAccionesDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccionesDBLayout.createSequentialGroup()
                .addComponent(pnlMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAccionesDBLayout.setVerticalGroup(
            pnlAccionesDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccionesDBLayout.createSequentialGroup()
                .addGroup(pnlAccionesDBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSqlite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlFusion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Fusión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Handwriting", 0, 18))); // NOI18N

        tblFusion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Juego", "Plataforma", "Creación", "Actualización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblFusion);

        btnComparar.setText("Comparar");

        btnFusionar.setText("Fusionar");

        javax.swing.GroupLayout pnlFusionLayout = new javax.swing.GroupLayout(pnlFusion);
        pnlFusion.setLayout(pnlFusionLayout);
        pnlFusionLayout.setHorizontalGroup(
            pnlFusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFusionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComparar)
                    .addComponent(btnFusionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFusionLayout.setVerticalGroup(
            pnlFusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFusionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(pnlFusionLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnComparar)
                .addGap(26, 26, 26)
                .addComponent(btnFusionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAccionesDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlFusion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlAccionesDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFusion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Se utiliza para hacer la conexion a la base de datos MySQL mediante un botón
     * @param evt evento que captura el click en el botón
     */
    private void btnConectarMysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarMysqlActionPerformed
        // TODO add your handling code here:
        MySQL.conectar();//Se realiza la conexión a la base de datos MySQL
    }//GEN-LAST:event_btnConectarMysqlActionPerformed

    /**
     * Se utilza para cerrar la conexión a la base de datos MySQL mediante un  botón
     * @param evt evento que captura el click en el botón
     */
    private void btnDesconectarMysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarMysqlActionPerformed
        // TODO add your handling code here:
        MySQL.desconectar();//Se realiza la desconexión de la base de datos MySQL
    }//GEN-LAST:event_btnDesconectarMysqlActionPerformed

    /**
     * Se utilza para hacer que se muestre todos los registros de la base de datos mediante un botón
     * @param evt evento que captura el click en el botón 
     */
    private void btnMostrarMysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMysqlActionPerformed
        // TODO add your handling code here:
        if(MySQL.estaVacio()==true){
            System.out.println("La base de datos MySQL está vacía");
        }else{
            System.out.println("La base de datos MySQL no está vacía");
            MySQL.seleccionar();//Muestra todos los registros de la base de datos MySQL
        }
    }//GEN-LAST:event_btnMostrarMysqlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMysql;
    private javax.swing.JButton btnActualizarSqlite;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnConectarMysql;
    private javax.swing.JButton btnConectarSqlite;
    private javax.swing.JButton btnDesconectarMysql;
    private javax.swing.JButton btnDesconectarSlite;
    private javax.swing.JButton btnEditarMysql;
    private javax.swing.JButton btnEditarSqlite;
    private javax.swing.JButton btnFusionar;
    private javax.swing.JButton btnInsertarMysql;
    private javax.swing.JButton btnInsertarSqlite;
    private javax.swing.JButton btnMostrarMysql;
    private javax.swing.JButton btnMostrarSqlite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIdMysql;
    private javax.swing.JLabel lblIdSqlite;
    private javax.swing.JLabel lblJuegoMysql;
    private javax.swing.JLabel lblJuegoMysqlActualizar;
    private javax.swing.JLabel lblJuegoSqlite;
    private javax.swing.JLabel lblJuegoSqliteActualizar;
    private javax.swing.JLabel lblPlataformaMysql;
    private javax.swing.JLabel lblPlataformaMysqlActualizar;
    private javax.swing.JLabel lblPlataformaSqlite;
    private javax.swing.JLabel lblPlataformaSqliteActualizar;
    private javax.swing.JPanel pnlAccionesDB;
    private javax.swing.JPanel pnlActualizarMysql;
    private javax.swing.JPanel pnlActualizarSqlite;
    private javax.swing.JPanel pnlFusion;
    private javax.swing.JPanel pnlInsertarMysql;
    private javax.swing.JPanel pnlInsertarSqlite;
    private javax.swing.JPanel pnlMysql;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSqlite;
    private javax.swing.JTable tblFusion;
    private javax.swing.JTable tblMysql;
    private javax.swing.JTable tblSqlite;
    private javax.swing.JButton tbnEliminarMysql;
    private javax.swing.JButton tbnEliminarSqlite;
    private javax.swing.JTextField txtIdMysql;
    private javax.swing.JTextField txtIdSqlite;
    private javax.swing.JTextField txtJuegoMysql;
    private javax.swing.JTextField txtJuegoMysqlActualizar;
    private javax.swing.JTextField txtJuegoSqlite;
    private javax.swing.JTextField txtJuegoSqliteActualizar;
    private javax.swing.JTextField txtPlataformaMysql;
    private javax.swing.JTextField txtPlataformaMysqlActualizar;
    private javax.swing.JTextField txtPlataformaSqlite;
    private javax.swing.JTextField txtPlataformaSqliteActualizar;
    // End of variables declaration//GEN-END:variables
}
