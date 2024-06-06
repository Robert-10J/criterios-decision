package criterios.decision.ja;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class uiProbabilidades extends javax.swing.JFrame {
    //List<Double> valores = Arrays.asList( 10.0, 15.0, 20.0 );
    //List<Double> probabilidades = Arrays.asList( 0.3, 0.4, 0.3 );

    List<Double> colValoresEsperados = new ArrayList<Double>();
    List<Double> colVarianzas = new ArrayList<Double>();
    
    public uiProbabilidades() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        aDosValDos = new javax.swing.JTextField();
        prob3 = new javax.swing.JTextField();
        prob4 = new javax.swing.JTextField();
        prob5 = new javax.swing.JTextField();
        prob1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aTresValUno = new javax.swing.JTextField();
        aUnoValUno = new javax.swing.JTextField();
        aDosValUno = new javax.swing.JTextField();
        aCincoValUno = new javax.swing.JTextField();
        aCuatroValUno = new javax.swing.JTextField();
        prob2 = new javax.swing.JTextField();
        aUnoValDos = new javax.swing.JTextField();
        aCuatroValDos = new javax.swing.JTextField();
        aTresValDos = new javax.swing.JTextField();
        aCincoValDos = new javax.swing.JTextField();
        aDosValCinco = new javax.swing.JTextField();
        aTresValTres = new javax.swing.JTextField();
        aUnoValCuatro = new javax.swing.JTextField();
        aCincoValTres = new javax.swing.JTextField();
        aCuatroValTres = new javax.swing.JTextField();
        aUnoValCinco = new javax.swing.JTextField();
        aUnoValTres = new javax.swing.JTextField();
        aDosValCuatro = new javax.swing.JTextField();
        aDosValTres = new javax.swing.JTextField();
        aTresValCinco = new javax.swing.JTextField();
        aTresValCuatro = new javax.swing.JTextField();
        aCuatroValCinco = new javax.swing.JTextField();
        aCuatroValCuatro = new javax.swing.JTextField();
        aCincoValCinco = new javax.swing.JTextField();
        aCincoValCuatro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        calcularValorEsperado = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        veA1 = new javax.swing.JLabel();
        veA3 = new javax.swing.JLabel();
        veA2 = new javax.swing.JLabel();
        veA5 = new javax.swing.JLabel();
        veA4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dispA1 = new javax.swing.JLabel();
        vaA2 = new javax.swing.JLabel();
        vaA4 = new javax.swing.JLabel();
        vaA3 = new javax.swing.JLabel();
        vaA5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        vaA1 = new javax.swing.JLabel();
        dispA2 = new javax.swing.JLabel();
        dispA3 = new javax.swing.JLabel();
        dispA5 = new javax.swing.JLabel();
        dispA4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        vaAcotada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setText("Criterios de Decisión");

        aDosValDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prob3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prob4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prob5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prob1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel1.setText("p1");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel3.setText("p3");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel4.setText("p2");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel5.setText("p4");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel6.setText("p5");

        aTresValUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aUnoValUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aDosValUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCincoValUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCuatroValUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prob2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aUnoValDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCuatroValDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aTresValDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCincoValDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aDosValCinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aTresValTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aUnoValCuatro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCincoValTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCuatroValTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aUnoValCinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aUnoValTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aDosValCuatro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aDosValTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aTresValCinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aTresValCuatro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCuatroValCinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCuatroValCuatro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCincoValCinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aCincoValCuatro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel7.setText("a1");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel8.setText("a2");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel9.setText("a3");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel10.setText("a4");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 12)); // NOI18N
        jLabel11.setText("a5");

        calcularValorEsperado.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        calcularValorEsperado.setText("Calcular ");
        calcularValorEsperado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularValorEsperadoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel12.setText("E[R(ai)]");

        veA1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        veA1.setText("0");

        veA3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        veA3.setText("0");

        veA2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        veA2.setText("0");

        veA5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        veA5.setText("0");

        veA4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        veA4.setText("0");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel13.setText("V");

        dispA1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dispA1.setText("0");

        vaA2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        vaA2.setText("0");

        vaA4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        vaA4.setText("0");

        vaA3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        vaA3.setText("0");

        vaA5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        vaA5.setText("0");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel14.setText("CR");

        vaA1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        vaA1.setText("0");

        dispA2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dispA2.setText("0");

        dispA3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dispA3.setText("0");

        dispA5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dispA5.setText("0");

        dispA4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        dispA4.setText("0");

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel15.setText("Media con varianza acotada:");

        vaAcotada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        vaAcotada.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veA2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veA4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(veA5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vaA1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vaA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vaA3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vaA4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vaA5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dispA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dispA1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dispA3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dispA5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dispA4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aTresValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(prob1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aCuatroValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aUnoValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aDosValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aCincoValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(prob2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prob3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aDosValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aDosValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aUnoValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aUnoValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aCuatroValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aCuatroValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aTresValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aTresValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aCincoValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aCincoValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcularValorEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(prob4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(prob5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(aUnoValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(aUnoValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aDosValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aDosValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aTresValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aTresValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aCuatroValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aCuatroValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(aCincoValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aCincoValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vaAcotada, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prob1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prob3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prob4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prob5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prob2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aUnoValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aUnoValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aUnoValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aUnoValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aUnoValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(veA1)
                    .addComponent(dispA1)
                    .addComponent(vaA1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aDosValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aDosValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aDosValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aDosValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aDosValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(veA2)
                    .addComponent(vaA2)
                    .addComponent(dispA2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTresValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTresValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTresValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTresValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTresValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(veA3)
                    .addComponent(vaA3)
                    .addComponent(dispA3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aCuatroValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCuatroValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCuatroValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCuatroValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCuatroValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(veA4)
                    .addComponent(vaA4)
                    .addComponent(dispA4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aCincoValUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCincoValDos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCincoValTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCincoValCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aCincoValCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(veA5)
                    .addComponent(vaA5)
                    .addComponent(dispA5))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcularValorEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaAcotada))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularValorEsperadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularValorEsperadoActionPerformed
        Double kDispersion = Double.parseDouble( JOptionPane.showInputDialog("Valor de k para la dispersion"));
        Double kVaAcotada = Double.parseDouble( JOptionPane.showInputDialog("Valor de k para la varianza acotada"));
        
        //Probabilidades
        String proba1 = prob1.getText();
        String proba2 = prob2.getText();
        String proba3 = prob3.getText();
        String proba4 = prob4.getText();
        String proba5 = prob5.getText();
        double prb1 = 0;
        double prb2 = 0;
        double prb3 = 0;
        double prb4 = 0;
        double prb5 = 0;
        if( !proba1.isEmpty() ) { prb1 = Double.parseDouble( proba1 ); }
        if( !proba2.isEmpty() ) { prb2 = Double.parseDouble( proba2 ); }
        if( !proba3.isEmpty() ) { prb3 = Double.parseDouble( proba3 ); }
        if( !proba4.isEmpty() ) { prb4 = Double.parseDouble( proba4 ); }
        if( !proba5.isEmpty() ) { prb5 = Double.parseDouble( proba5 ); }
        List<Double> filaPrbs = new ArrayList<Double>();
        Calculos.addElementToArray(prb1, prb2, prb3, prb4, prb5, filaPrbs);
        
        //Calculo VE a1
        String valuea1 = aUnoValUno.getText();
        String valuea2 = aUnoValDos.getText();
        String valuea3 = aUnoValTres.getText();
        String valuea4 = aUnoValCuatro.getText();
        String valuea5 = aUnoValCinco.getText();
        double val1 = 0;
        double val2 = 0;
        double val3 = 0;
        double val4 = 0;
        double val5 = 0;
        if( !valuea1.isEmpty() ){ val1 = Double.parseDouble(valuea1); }
        if( !valuea2.isEmpty() ){ val2 = Double.parseDouble(valuea2); }
        if( !valuea3.isEmpty() ){ val3 = Double.parseDouble(valuea3); }
        if( !valuea4.isEmpty() ){ val4 = Double.parseDouble(valuea4); }
        if( !valuea5.isEmpty() ){ val5 = Double.parseDouble(valuea5); }
        List<Double> filaA1 = new ArrayList<Double>();
        Calculos.addElementToArray(val1, val2, val3, val4, val5, filaA1);
        Double VEa1 = Calculos.calcularVE(filaPrbs, filaA1); // caluculo valor esperado
        colValoresEsperados.add(VEa1);
        Double VAa1 = Calculos.calcularVA(filaA1, filaPrbs,VEa1); // caluculo varianza
        colVarianzas.add(VAa1);
        Double disA1 = Calculos.dispersion(VEa1, kDispersion, VAa1); // calculo de la dispersion
        // Mostrar el resultado en la UI
        String valorEa1 = String.valueOf(VEa1);
        veA1.setText( valorEa1 );
        String valorA1 = String.valueOf(VAa1);
        vaA1.setText(valorA1);
        String valorDisA1 = String.valueOf(disA1);
        dispA1.setText(valorDisA1);
        
        //Calculo VE a2
        String fDos1 = aDosValUno.getText();
        String fDos2 = aDosValDos.getText();
        String fDos3 = aDosValTres.getText();
        String fDos4 = aDosValCuatro.getText();
        String fDos5 = aDosValCinco.getText();
        double fDosVal1 = 0;
        double fDosVal2 = 0;
        double fDosVal3 = 0;
        double fDosVal4 = 0;
        double fDosVal5 = 0;
        if( !fDos1.isEmpty() ) { fDosVal1 = Double.parseDouble(fDos1); }
        if( !fDos2.isEmpty() ) { fDosVal2 = Double.parseDouble(fDos2); }
        if( !fDos3.isEmpty() ) { fDosVal3 = Double.parseDouble(fDos3); }
        if( !fDos4.isEmpty() ) { fDosVal4 = Double.parseDouble(fDos4); }
        if( !fDos5.isEmpty() ) { fDosVal5 = Double.parseDouble(fDos5); }
        List<Double> filaA2 = new ArrayList<Double>();
        Calculos.addElementToArray(fDosVal1, fDosVal2, fDosVal3, fDosVal4, fDosVal5, filaA2);
        Double VEa2 = Calculos.calcularVE(filaPrbs, filaA2);
        colValoresEsperados.add(VEa2);
        Double VAa2 = Calculos.calcularVA(filaA2, filaPrbs, VEa2); // caluculo varianza
        colVarianzas.add(VAa2);
        Double disA2 = Calculos.dispersion(VEa2, kDispersion, VAa2); // calculo de la dispersion
        String valorEa2 = String.valueOf(VEa2);
        veA2.setText(valorEa2);
        String valorA2 = String.valueOf(VAa2);
        vaA2.setText(valorA2);
        String valorDisA2 = String.valueOf(disA2);
        dispA2.setText(valorDisA2);
        
        //Calculo VE a3
        String fTres1 = aTresValUno.getText();
        String fTres2 = aTresValDos.getText();
        String fTres3 = aTresValTres.getText();
        String fTres4 = aTresValCuatro.getText();
        String fTres5 = aTresValCinco.getText();
        double fTresVal1 = 0;
        double fTresVal2 = 0;
        double fTresVal3 = 0;
        double fTresVal4 = 0;
        double fTresVal5 = 0;
        if( !fTres1.isEmpty() ) { fTresVal1 = Double.parseDouble(fTres1); }
        if( !fTres2.isEmpty() ) { fTresVal2 = Double.parseDouble(fTres2); }
        if( !fTres3.isEmpty() ) { fTresVal3 = Double.parseDouble(fTres3); }
        if( !fTres4.isEmpty() ) { fTresVal4 = Double.parseDouble(fTres4); }
        if( !fTres5.isEmpty() ) { fTresVal5 = Double.parseDouble(fTres5); }
        List<Double> filaA3 = new ArrayList<Double>();
        Calculos.addElementToArray(fTresVal1, fTresVal2, fTresVal3, fTresVal4, fTresVal5, filaA3);
        Double VEa3 = Calculos.calcularVE(filaPrbs, filaA3);
        colValoresEsperados.add(VEa3);
        Double VAa3 = Calculos.calcularVA(filaA3, filaPrbs, VEa3); // caluculo varianza
        colVarianzas.add(VAa3);
        Double disA3 = Calculos.dispersion(VEa3, kDispersion, VAa3); // calculo de la dispersion
        String valorEa3 = String.valueOf(VEa3);
        veA3.setText(valorEa3);
        String valorA3 = String.valueOf(VAa3);
        vaA3.setText(valorA3);
        String valorDisA3 = String.valueOf(disA3);
        dispA3.setText(valorDisA3);

        //Calculo VE a4
        String fCuatro1 = aCuatroValUno.getText();
        String fCuatro2 = aCuatroValDos.getText();
        String fCuatro3 = aCuatroValTres.getText();
        String fCuatro4 = aCuatroValCuatro.getText();
        String fCuatro5 = aCuatroValCinco.getText();
        double fCuatroVal1 = 0;
        double fCuatroVal2 = 0;
        double fCuatroVal3 = 0;
        double fCuatroVal4 = 0;
        double fCuatroVal5 = 0;
        if( !fCuatro1.isEmpty() ) { fCuatroVal1 = Double.parseDouble(fCuatro1); }
        if( !fCuatro2.isEmpty() ) { fCuatroVal2 = Double.parseDouble(fCuatro2); }
        if( !fCuatro3.isEmpty() ) { fCuatroVal3 = Double.parseDouble(fCuatro3); }
        if( !fCuatro4.isEmpty() ) { fCuatroVal4 = Double.parseDouble(fCuatro4); }
        if( !fCuatro5.isEmpty() ) { fCuatroVal5 = Double.parseDouble(fCuatro5); }
        List<Double> filaA4 = new ArrayList<Double>();
        Calculos.addElementToArray(fCuatroVal1, fCuatroVal2, fCuatroVal3, fCuatroVal4, fCuatroVal5, filaA4);
        Double VEa4 = Calculos.calcularVE(filaPrbs, filaA4);
        colValoresEsperados.add(VEa4);
        Double VAa4 = Calculos.calcularVA(filaA4, filaPrbs, VEa4); // caluculo varianza
        colVarianzas.add(VAa4);
        Double disA4 = Calculos.dispersion(VEa4, kDispersion, VAa4); // calculo de la dispersion
        String valorEa4 = String.valueOf(VEa4);
        veA4.setText(valorEa4);
        String valorA4 = String.valueOf(VAa4);
        vaA4.setText(valorA4);
        String valorDisA4 = String.valueOf(disA4);
        dispA5.setText(valorDisA4);

        //Calculo VE a5
        String fCinco1 = aCincoValUno.getText();
        String fCinco2 = aCincoValDos.getText();
        String fCinco3 = aCincoValTres.getText();
        String fCinco4 = aCincoValCuatro.getText();
        String fCinco5 = aCincoValCinco.getText();
        double fCincoVal1 = 0;
        double fCincoVal2 = 0;
        double fCincoVal3 = 0;
        double fCincoVal4 = 0;
        double fCincoVal5 = 0;
        if(!fCinco1.isEmpty() ) { fCincoVal1 = Double.parseDouble(fCinco1); }
        if(!fCinco2.isEmpty() ) { fCincoVal2 = Double.parseDouble(fCinco2); }
        if(!fCinco3.isEmpty() ) { fCincoVal3 = Double.parseDouble(fCinco3); }
        if(!fCinco4.isEmpty() ) { fCincoVal4 = Double.parseDouble(fCinco4); }
        if(!fCinco5.isEmpty() ) { fCincoVal5 = Double.parseDouble(fCinco5); }
        List<Double> filaA5 = new ArrayList<Double>();
        Calculos.addElementToArray(fCincoVal1, fCincoVal2, fCincoVal3, fCincoVal4, fCincoVal5, filaA5);
        Double VEa5 = Calculos.calcularVE(filaPrbs, filaA5);
        colValoresEsperados.add(VEa5);
        Double VAa5 = Calculos.calcularVA(filaA5, filaPrbs, VEa5); // caluculo varianza
        colVarianzas.add(VAa5);
        Double disA5 = Calculos.dispersion(VEa5, kDispersion, VAa5); // calculo de la dispersion
        String valorEa5 = String.valueOf(VEa5);
        veA5.setText(valorEa5);
        String valorA5 = String.valueOf(VAa5);
        vaA5.setText(valorA5);
        String valorDisA5 = String.valueOf(disA5);
        dispA5.setText(valorDisA5); 

        String varianzaAcotada = Calculos.vaAcotada(kVaAcotada, colValoresEsperados, colVarianzas);
        vaAcotada.setText(varianzaAcotada);
    }//GEN-LAST:event_calcularValorEsperadoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(uiProbabilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uiProbabilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uiProbabilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uiProbabilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uiProbabilidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aCincoValCinco;
    private javax.swing.JTextField aCincoValCuatro;
    private javax.swing.JTextField aCincoValDos;
    private javax.swing.JTextField aCincoValTres;
    private javax.swing.JTextField aCincoValUno;
    private javax.swing.JTextField aCuatroValCinco;
    private javax.swing.JTextField aCuatroValCuatro;
    private javax.swing.JTextField aCuatroValDos;
    private javax.swing.JTextField aCuatroValTres;
    private javax.swing.JTextField aCuatroValUno;
    private javax.swing.JTextField aDosValCinco;
    private javax.swing.JTextField aDosValCuatro;
    private javax.swing.JTextField aDosValDos;
    private javax.swing.JTextField aDosValTres;
    private javax.swing.JTextField aDosValUno;
    private javax.swing.JTextField aTresValCinco;
    private javax.swing.JTextField aTresValCuatro;
    private javax.swing.JTextField aTresValDos;
    private javax.swing.JTextField aTresValTres;
    private javax.swing.JTextField aTresValUno;
    private javax.swing.JTextField aUnoValCinco;
    private javax.swing.JTextField aUnoValCuatro;
    private javax.swing.JTextField aUnoValDos;
    private javax.swing.JTextField aUnoValTres;
    private javax.swing.JTextField aUnoValUno;
    private javax.swing.JButton calcularValorEsperado;
    private javax.swing.JLabel dispA1;
    private javax.swing.JLabel dispA2;
    private javax.swing.JLabel dispA3;
    private javax.swing.JLabel dispA4;
    private javax.swing.JLabel dispA5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField prob1;
    private javax.swing.JTextField prob2;
    private javax.swing.JTextField prob3;
    private javax.swing.JTextField prob4;
    private javax.swing.JTextField prob5;
    private javax.swing.JLabel vaA1;
    private javax.swing.JLabel vaA2;
    private javax.swing.JLabel vaA3;
    private javax.swing.JLabel vaA4;
    private javax.swing.JLabel vaA5;
    private javax.swing.JLabel vaAcotada;
    private javax.swing.JLabel veA1;
    private javax.swing.JLabel veA2;
    private javax.swing.JLabel veA3;
    private javax.swing.JLabel veA4;
    private javax.swing.JLabel veA5;
    // End of variables declaration//GEN-END:variables
}
