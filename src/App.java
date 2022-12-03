import java.util.ArrayList;

public class App extends javax.swing.JFrame {
    private int result = 0;
    private String display = "";
    private int[] containtNumber = new int[15];
    private int countCellNumber = 0;
    private ArrayList<String> containFunction = new ArrayList<String>();
    private int countCellFunctions = 0;
    private int temp = 0;
    private int setNumber;

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Display = new javax.swing.JPanel();
        lblDisplay = new javax.swing.JLabel();
        Function = new javax.swing.JPanel();
        btnPercent = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnNumber4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnNumber1 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDivisor = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnMu = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnGiaiThua = new javax.swing.JButton();
        btnAbs = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DisplayLayout = new javax.swing.GroupLayout(Display);
        Display.setLayout(DisplayLayout);
        DisplayLayout.setHorizontalGroup(
                DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DisplayLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 451,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE)));
        DisplayLayout.setVerticalGroup(
                DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addContainerGap()));

        btnPercent.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnPercent.setText("%");
        btnPercent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPercent.setBorderPainted(false);
        btnPercent.setFocusPainted(false);

        btnNumber0.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber0.setText("0");
        btnNumber0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber0.setBorderPainted(false);
        btnNumber0.setFocusPainted(false);
        btnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber0ActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnDel.setText("Del");
        btnDel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDel.setBorderPainted(false);
        btnDel.setFocusPainted(false);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnEqual.setText("=");
        btnEqual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEqual.setBorderPainted(false);
        btnEqual.setFocusPainted(false);
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnNumber4.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber4.setText("4");
        btnNumber4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber4.setBorderPainted(false);
        btnNumber4.setFocusPainted(false);
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber4ActionPerformed(evt);
            }
        });

        btnNumber5.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber5.setText("5");
        btnNumber5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber5.setBorderPainted(false);
        btnNumber5.setFocusPainted(false);
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber5ActionPerformed(evt);
            }
        });

        btnNumber6.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber6.setText("6");
        btnNumber6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber6.setBorderPainted(false);
        btnNumber6.setFocusPainted(false);
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber6ActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnMinus.setText("-");
        btnMinus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMinus.setBorderPainted(false);
        btnMinus.setFocusPainted(false);
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnNumber1.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber1.setText("1");
        btnNumber1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber1.setBorderPainted(false);
        btnNumber1.setFocusPainted(false);
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });

        btnNumber2.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber2.setText("2");
        btnNumber2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber2.setBorderPainted(false);
        btnNumber2.setFocusPainted(false);
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber2ActionPerformed(evt);
            }
        });

        btnNumber3.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber3.setText("3");
        btnNumber3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber3.setBorderPainted(false);
        btnNumber3.setFocusPainted(false);
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber3ActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnPlus.setText("+");
        btnPlus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlus.setBorderPainted(false);
        btnPlus.setFocusPainted(false);
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnNumber7.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber7.setText("7");
        btnNumber7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber7.setBorderPainted(false);
        btnNumber7.setFocusPainted(false);
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber7ActionPerformed(evt);
            }
        });

        btnNumber8.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber8.setText("8");
        btnNumber8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber8.setBorderPainted(false);
        btnNumber8.setFocusPainted(false);
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber8ActionPerformed(evt);
            }
        });

        btnNumber9.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnNumber9.setText("9");
        btnNumber9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumber9.setBorderPainted(false);
        btnNumber9.setFocusPainted(false);
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber9ActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnMulti.setText("*");
        btnMulti.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMulti.setBorderPainted(false);
        btnMulti.setFocusPainted(false);
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDivisor.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnDivisor.setText("/");
        btnDivisor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDivisor.setBorderPainted(false);
        btnDivisor.setFocusPainted(false);
        btnDivisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisorActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        btnCos.setText("CosX");
        btnCos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCos.setBorderPainted(false);
        btnCos.setFocusPainted(false);

        btnSin.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        btnSin.setText("SinX");
        btnSin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSin.setBorderPainted(false);
        btnSin.setFocusPainted(false);

        btnMu.setFont(new java.awt.Font("Helvetica Neue", 0, 30));
        btnMu.setText("^");
        btnMu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMu.setBorderPainted(false);
        btnMu.setFocusPainted(false);

        btnAC.setFont(new java.awt.Font("Helvetica Neue", 0, 28));
        btnAC.setText("AC");
        btnAC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAC.setBorderPainted(false);
        btnAC.setFocusPainted(false);
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnGiaiThua.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        btnGiaiThua.setText("X!");
        btnGiaiThua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGiaiThua.setBorderPainted(false);
        btnGiaiThua.setFocusPainted(false);
        btnGiaiThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiThuaActionPerformed(evt);
            }
        });

        btnAbs.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        btnAbs.setText("abs");
        btnAbs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbs.setBorderPainted(false);
        btnAbs.setFocusPainted(false);
        btnAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsActionPerformed(evt);
            }
        });

        btnSqrt.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        btnSqrt.setText("sqrt");
        btnSqrt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSqrt.setBorderPainted(false);
        btnSqrt.setFocusPainted(false);
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        btnTan.setText("TanX");
        btnTan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTan.setBorderPainted(false);
        btnTan.setFocusPainted(false);
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FunctionLayout = new javax.swing.GroupLayout(Function);
        Function.setLayout(FunctionLayout);
        FunctionLayout.setHorizontalGroup(
                FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionLayout.createSequentialGroup()
                                .addGroup(FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(FunctionLayout.createSequentialGroup()
                                                .addGroup(FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(FunctionLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(FunctionLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnGiaiThua,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnAbs,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnTan,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(FunctionLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(btnSqrt,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addGroup(FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(FunctionLayout.createSequentialGroup()
                                                                .addComponent(btnNumber7)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnNumber8)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnNumber9)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnMulti))
                                                        .addGroup(FunctionLayout.createSequentialGroup()
                                                                .addComponent(btnNumber1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnNumber2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnNumber3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnPlus))
                                                        .addGroup(FunctionLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        FunctionLayout.createSequentialGroup()
                                                                                .addComponent(btnNumber4)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnNumber5)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnNumber6)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnMinus))
                                                                .addGroup(FunctionLayout.createSequentialGroup()
                                                                        .addComponent(btnPercent)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(btnNumber0)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(btnDel)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(btnEqual)))))
                                        .addGroup(FunctionLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnCos)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSin)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMu)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAC)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDivisor)))
                                .addGap(18, 18, 18)));

        FunctionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[] { btnAC, btnAbs, btnCos, btnDel, btnDivisor, btnEqual, btnGiaiThua, btnMinus,
                        btnMu, btnMulti, btnNumber0, btnNumber1, btnNumber2, btnNumber3, btnNumber4, btnNumber5,
                        btnNumber6, btnNumber7, btnNumber8, btnNumber9, btnPercent, btnPlus, btnSin, btnSqrt, btnTan });

        FunctionLayout.setVerticalGroup(
                FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionLayout.createSequentialGroup()
                                .addContainerGap(86, Short.MAX_VALUE)
                                .addGroup(FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDivisor, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnMu)
                                                        .addComponent(btnAC, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FunctionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionLayout
                                                .createSequentialGroup()
                                                .addGroup(FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnNumber7)
                                                        .addComponent(btnNumber8)
                                                        .addComponent(btnNumber9)
                                                        .addComponent(btnMulti))
                                                .addGap(18, 18, 18)
                                                .addGroup(FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnNumber4)
                                                        .addComponent(btnNumber5)
                                                        .addComponent(btnNumber6)
                                                        .addComponent(btnMinus))
                                                .addGap(18, 18, 18)
                                                .addGroup(FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnNumber1)
                                                        .addComponent(btnNumber2)
                                                        .addComponent(btnNumber3)
                                                        .addComponent(btnPlus))
                                                .addGap(18, 18, 18)
                                                .addGroup(FunctionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnPercent)
                                                        .addComponent(btnNumber0)
                                                        .addComponent(btnDel)
                                                        .addComponent(btnEqual)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionLayout
                                                .createSequentialGroup()
                                                .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnGiaiThua, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)));

        FunctionLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                new java.awt.Component[] { btnAC, btnAbs, btnCos, btnDel, btnDivisor, btnEqual, btnGiaiThua, btnMinus,
                        btnMu, btnMulti, btnNumber0, btnNumber1, btnNumber2, btnNumber3, btnNumber4, btnNumber5,
                        btnNumber6, btnNumber7, btnNumber8, btnNumber9, btnPercent, btnPlus, btnSin, btnSqrt, btnTan });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Function, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(Display, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Function, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        pack();
    }

    // Sort the storeNumberOfCells
    private void sortStoreNumberOfCells(int n) {
        for (int i = n; i < containtNumber.length; i++) {
            containtNumber[i] = containtNumber[i + 1];
        }
    }

    // Sort the storeFunction
    private void sortStoreFunction(int n) {
        // for (int i = n; i < containFunction.length; i++) {
        // containFunction[i] = containFunction[i + 1];
        // }
        containFunction.remove(n);
    }

    // Store number of cells
    private void storeNumberOfCells(int setNumber) {
        containtNumber[countCellNumber] = setNumber;
        countCellNumber++;
        setNumber = 0;
    }

    // Store function
    private void storeFunction(String function) {
        // containFunction[countCellFunctions] = function;
        containFunction.add(function);
        countCellFunctions++;
    }

    // Analysis * and /
    private void analyze() {
        // for (int i = temp; i < containtNumber.length; i++) {
        // if (containFunction[i] == "*" || containFunction[i] == "/") {
        // temp = i;
        // }
        // }
        for (String string : containFunction) {
            if (string == "*" || string == "/") {
                temp = containFunction.indexOf(string);
            }
        }
    }

    // Analysis + and -
    private void analyze2() {
        // for (int i = temp; i < containtNumber.length; i++) {
        // if (containFunction[i] == "+" || containFunction[i] == "-") {
        // temp = i;
        // }
        // }
        for (String string : containFunction) {
            if (string == "+" || string == "-") {
                temp = containFunction.indexOf(string);
            }
        }

    }

    // Solving * and /
    private void solve() {
        while (true) {
            if (temp != 0) {
                switch (containFunction.get(temp)) {
                    case "*":
                        containtNumber[temp] = containtNumber[temp] * containtNumber[temp + 1];
                        sortStoreNumberOfCells(temp);
                        sortStoreFunction(temp);
                        break;
                    case "/":
                        containtNumber[temp] = containtNumber[temp] / containtNumber[temp + 1];
                        sortStoreNumberOfCells(temp);
                        sortStoreFunction(temp);
                        break;
                }
            } else {
                break;
            }
        }
    }

    // Solving + and -
    private void solve2() {
        while (true) {
            if (temp != 0) {
                switch (containFunction.get(temp)) {
                    case "+":
                        sortStoreFunction(temp);
                    case "-":
                        containtNumber[temp] = -containtNumber[temp];
                }
            }
        }
    }

    // ActionEvent Delete
    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {
        result = 0;
        display = "";
        lblDisplay.setText(display);
    }

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {

        display = removeCharAt(display, (display.length() - 1));
        lblDisplay.setText(display);
    }

    // Function
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {
        result += setNumber;
        display = display + "+";
        storeFunction("+");
        lblDisplay.setText(display);

    }

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {
        result -= setNumber;
        display = display + "-";
        storeFunction("-");
        lblDisplay.setText(display);

    }

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {
        result *= setNumber;
        display = display + "*";
        storeFunction("*");
        lblDisplay.setText(display);
        setNumber = 1;

    }

    private void btnDivisorActionPerformed(java.awt.event.ActionEvent evt) {
        result /= setNumber;
        display = display + "/";
        storeFunction("/");
        lblDisplay.setText(display);
        setNumber = 1;

    }

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {
        storeNumberOfCells(setNumber);
        solve();
        solve2();
        for (int i = 0; i < containtNumber.length; i++) {
            result += containtNumber[i];
        }
        lblDisplay.setText(result + "");

    }

    private void btnGiaiThuaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnAbsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // ActionEvent Number
    private void btnNumber3ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 3;
        display = display + "3";
        lblDisplay.setText(display);
    }

    private void btnNumber8ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 8;
        display = display + "8";
        lblDisplay.setText(display);
        System.out.println(setNumber);
    }

    private void btnNumber7ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 7;
        display = display + "7";
        lblDisplay.setText(display);
    }

    private void btnNumber2ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 2;
        display = display + "2";
        lblDisplay.setText(display);

    }

    private void btnNumber4ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 4;
        display = display + "4";
        lblDisplay.setText(display);
    }

    private void btnNumber6ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 6;
        display = display + "6";
        lblDisplay.setText(display);
    }

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 1;
        display = display + "1";
        lblDisplay.setText(display);
        // TODO add your handling code here:
    }

    private void btnNumber5ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 5;
        display = display + "5";
        lblDisplay.setText(display);
        // TODO add your handling code here:
    }

    private void btnNumber0ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 8;
        display = display + "0";
        lblDisplay.setText(display);

        // TODO add your handling code here:
    }

    private void btnNumber9ActionPerformed(java.awt.event.ActionEvent evt) {
        setNumber = setNumber * 10 + 9;
        display = display + "9";
        lblDisplay.setText(display);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JPanel Function;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnAbs;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDivisor;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnGiaiThua;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMu;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNumber0;
    private javax.swing.JButton btnNumber1;
    private javax.swing.JButton btnNumber2;
    private javax.swing.JButton btnNumber3;
    private javax.swing.JButton btnNumber4;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton btnNumber7;
    private javax.swing.JButton btnNumber8;
    private javax.swing.JButton btnNumber9;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTan;
    private javax.swing.JLabel lblDisplay;
    // End of variables declaration//GEN-END:variables
}
