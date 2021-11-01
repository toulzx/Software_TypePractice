package gameModule.view;

import gameModule.algorithm.DNASequence;
import gameModule.controller.HandleDataList;
import gameModule.model.GameModel;
import gameModule.utils.Read_File;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.List;
import java.util.Random;

class Windowm extends JFrame
{
    static String[] txts = {
            "HadINotSeenTheSun.txt",
            "DownByTheSalleyGarden.txt",
            "HowDoILoveThee.txt",
            "TheRoadNotTaken.txt",
            "TheDaffodils.txt",
            "DoNotGoGentleIntoThatGoodNight.txt",
    };

    String path1;//��һ���ļ�Ŀ¼
    String path2;//�ڶ����ļ�Ŀ¼
    String File1;//��һ���ļ�
    String File2;//�ڶ����ļ�
    int point;//���浱ǰ�����
    GameModel user;

    private static final long serialVersionUID = 1L;
    JPanel myPanel1 = new JPanel();//���1.1
    JPanel myPanel2 =new JPanel();//���2.1
    JPanel myPanel3 =new JPanel();//���3
    JPanel myPanel4 =new JPanel();//���4
    JTextPane text1=new JTextPane();
    JTextPane text2=new JTextPane();

    JButton bt1 = new JButton("���ĵ�");
    JButton btMid = new JButton("���а�");
//    JButton bt2 = new JButton("���ĵ�2");
    JButton bt3 = new JButton("�˶�");

    JPopupMenu jm = new JPopupMenu();//�Ҽ��˵�
    JMenuItem copy = new JMenuItem("����");//�˵���
    JMenuItem path = new JMenuItem("ճ��");
    JMenuItem cut = new JMenuItem("����");
    JMenuItem help = new JMenuItem("����");

    JScrollPane scro1=new JScrollPane(text1);//���ӹ�����
    JScrollPane scro2=new JScrollPane(text2);//���ӹ�����

    JSplitPane jSplitPane =new JSplitPane();//�趨Ϊ��ֲ���
    JSplitPane jSplitPane2 =new JSplitPane();//�趨Ϊ��ֲ���
    JSplitPane jSplitPane3 =new JSplitPane();//�趨Ϊ��ֲ���

    public Windowm(GameModel user)
    {
        this.user = user;

        setVisible(true);
        jm.add(copy);
        jm.add(path);
        jm.add(cut);
        jm.add(help);

        myPanel3.add(bt1);
        myPanel3.add(btMid);
//        myPanel3.add(bt2);
        myPanel4.add(bt3);

        this.setTitle("����ģʽ");
        this.setBounds(100, 100, 600, 500);
        jSplitPane.setContinuousLayout(true);//������ͷ���ػ�ͼ��
        jSplitPane2.setContinuousLayout(true);//������ͷ���ػ�ͼ��
        jSplitPane3.setContinuousLayout(true);//������ͷ���ػ�ͼ��

        jSplitPane2.setOrientation(JSplitPane.VERTICAL_SPLIT);//��ֱ����
        jSplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);//ˮƽ����
        jSplitPane3.setOrientation(JSplitPane.VERTICAL_SPLIT);//��ֱ����

        myPanel1.setBorder(BorderFactory.createLineBorder(Color.green));
        myPanel2.setBorder(BorderFactory.createLineBorder(Color.red));
        myPanel3.setBorder(BorderFactory.createLineBorder(Color.yellow));
        myPanel4.setBorder(BorderFactory.createLineBorder(Color.blue));

        jSplitPane.setLeftComponent(scro1);//���Ҳ������������ �����1
        jSplitPane.setRightComponent(scro2);//���Ҳ������������ �����2

        jSplitPane2.setTopComponent(myPanel3);//���²������������ �����1
        jSplitPane2.setBottomComponent(jSplitPane);//���²������������ �����1

        jSplitPane3.setTopComponent(jSplitPane2);
        jSplitPane3.setBottomComponent(myPanel4);

        jSplitPane.setDividerSize(5);//���÷ָ��ߵĿ���
        jSplitPane2.setDividerSize(5);//���÷ָ��ߵĿ���
        jSplitPane3.setDividerSize(5);//���÷ָ��ߵĿ���
        setContentPane(jSplitPane3);//����Ϊ��ģ��

        // ����ѡ��Ĺؿ���������
        Random random = new Random();
        text1.setEditable(false);
        switch (user.getDifficulty()){
            case 5:
                bt1.setEnabled(false);
                path1 = System.getProperty ("user.dir") + "\\articles\\" + txts[random.nextInt(2)];
                try{
                    new Read_File(path1);
                    File1= Read_File.getFile();
                    SimpleAttributeSet attrset = new SimpleAttributeSet();
                    StyleConstants.setFontSize(attrset,16);//�����ֺ�
                    Document docs=text1.getDocument();
                    docs.insertString(docs.getLength(), File1, attrset);
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
                break;
            case 10:
                bt1.setEnabled(false);
                path1 = System.getProperty ("user.dir") + "\\articles\\" + txts[1*2 + random.nextInt(2)];
                try{
                    new Read_File(path1);
                    File1= Read_File.getFile();
                    SimpleAttributeSet attrset = new SimpleAttributeSet();
                    StyleConstants.setFontSize(attrset,16);//�����ֺ�
                    Document docs=text1.getDocument();
                    docs.insertString(docs.getLength(), File1, attrset);
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
                break;
            case 15:
                bt1.setEnabled(false);
                path1 = System.getProperty ("user.dir") + "\\articles\\" + txts[2*2 + random.nextInt(2)];
                try{
                    new Read_File(path1);
                    File1= Read_File.getFile();
                    SimpleAttributeSet attrset = new SimpleAttributeSet();
                    StyleConstants.setFontSize(attrset,16);//�����ֺ�
                    Document docs=text1.getDocument();
                    docs.insertString(docs.getLength(), File1, attrset);
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
                break;
            case 0:
            default:
                bt1.setEnabled(true);
                break;
        }

        copy.addActionListener(new ActionListener()//���ڼ���
                               {
                                   @Override
                                   public void actionPerformed(ActionEvent e4)//�˵���
                                   {
                                       try{
//                                           text1.copy();
                                           text2.copy();
                                       }catch(Exception e1){
                                       }
                                   }
                               }
        );
        path.addActionListener(new ActionListener()//���ڼ���
                               {
                                   @Override
                                   public void actionPerformed(ActionEvent e4)//�˵���
                                   {
                                       try{
                                           if (point==1) {//�������������ڣ�������point��ȷ��ճ����ĳ������

//                                               text1.paste();
                                           } else {
                                               text2.paste();
                                           }
                                       }catch(Exception e1){
                                       }
                                   }
                               }
        );
        cut.addActionListener(new ActionListener()//���ڼ���
                              {
                                  @Override
                                  public void actionPerformed(ActionEvent e4)//�˵���
                                  {
                                      try{
//                                          text1.cut();
                                          text2.cut();
                                      }catch(Exception e1){
                                      }
                                  }
                              }
        );
        help.addActionListener(new ActionListener()//���ڼ���
                               {
                                   @Override
                                   public void actionPerformed(ActionEvent e4)//�˵���
                                   {
                                       JOptionPane.showMessageDialog(null,"ʹ�÷�����������ߵ���������ı������˶Լ����бȽ�\n��ɫ��ʾƥ��ʧ�ܣ���ɫ��ʾ���࣬��ɫΪ����ƥ���ı�","ʹ��ָ��",JOptionPane.PLAIN_MESSAGE);
                                   }
                               }
        );

//        text1.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getButton() == MouseEvent.BUTTON3) {
//                    jm.show(text1, e.getX(), e.getY()); // �����˵�
//                    point=1;
//                }
//            }
//        });

        text2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    jm.show(text2, e.getX(), e.getY()); // �����˵�
                    point=2;
                }
            }
        });

        jSplitPane.addComponentListener(new ComponentAdapter() {//�϶����ڼ���
            @Override
            public void componentResized(ComponentEvent e) {
                jSplitPane.setDividerLocation(jSplitPane3.getWidth()/2-7);//���õ�һ������
            }
        });
        jSplitPane2.setDividerLocation(50);//�趨�ָ��ߵľ�����ߵ�λ��
        jSplitPane3.addComponentListener(new ComponentAdapter() {//�϶����ڼ���
            @Override
            public void componentResized(ComponentEvent e) {
                jSplitPane3.setDividerLocation(jSplitPane3.getHeight()-50);//���õ������߶�
            }
        });

        bt1.addActionListener(new ActionListener()//���ڼ���
                              {
                                  @Override
                                  public void actionPerformed(ActionEvent e4)//�˵���
                                  {
                                      try{
                                          text1.setText("");
                                          JFileChooser jfc=new JFileChooser();
                                          jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
                                          jfc.showDialog(new JLabel(), "ѡ��");
                                          File file=jfc.getSelectedFile();
                                          path1=file.getAbsolutePath();//��ȡ�ļ����Ե�ַ
                                          new Read_File(path1);
                                          File1= Read_File.getFile();
                                          SimpleAttributeSet attrset = new SimpleAttributeSet();
                                          StyleConstants.setFontSize(attrset,16);//�����ֺ�
                                          Document docs=text1.getDocument();
                                          docs.insertString(docs.getLength(), File1, attrset);
                                      }catch(Exception e1){
                                          e1.printStackTrace();
                                      }
                                  }
                              }
        );
        btMid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                List<GameModel> rankList = HandleDataList.getUserList(); // ��ȡ�����û��������б�
                try {
                    // ��ʾ���а���ͼ
                    new RankListView(rankList, user).init();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
//        bt2.addActionListener(new ActionListener()//���ڼ���
//                              {
//                                  @Override
//                                  public void actionPerformed(ActionEvent e4)//�˵���
//                                  {
//                                      try{
//                                          text2.setText("");
//                                          JFileChooser jfc=new JFileChooser();
//                                          jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
//                                          jfc.showDialog(new JLabel(), "ѡ��");
//                                          File file=jfc.getSelectedFile();
//                                          path2=file.getAbsolutePath();//��ȡ�ļ����Ե�ַ
//                                          new Read_File(path2);
//                                          File2= Read_File.getFile();
//                                          SimpleAttributeSet attrset = new SimpleAttributeSet();
//                                          StyleConstants.setFontSize(attrset,16);//�����ֺ�
//                                          Document docs=text2.getDocument();
//                                          docs.insertString(docs.getLength(), File2, attrset);
//                                      }catch(Exception e1){
//                                          System.out.println("ѡ���ļ�����");
//                                      }
//                                  }
//                              }
//        );
        bt3.addActionListener(new ActionListener()//���ڼ���
                              {
                                  @Override
                                  public void actionPerformed(ActionEvent e4)//�˵���
                                  {
                                      try{
                                          String dnas1;//�㷨����֮����ַ���1
                                          String dnas2;//�㷨����֮����ַ���2
                                          String jtp1;//JTextpane������1
                                          String jtp2;//JTextpane������2
                                          int len=0;	//��������ַ�������

                                          jtp1=text1.getText();//��ȡ�����ı�
                                          jtp2=text2.getText();
                                          text1.setText("");//���֮ǰ����
                                          text2.setText("");
                                          Document docs1=text1.getDocument();
                                          Document docs2=text2.getDocument();
                                          DNASequence dna=new DNASequence(jtp1,jtp2);//ͨ�����췽�����ݲ���
                                          dna.runAnalysis();
                                          dna.traceback();
                                          dnas1=dna.getString1();//��ȡ��������ַ���
                                          dnas2=dna.getString2();
                                          char[] s = dnas1.toCharArray();//�ַ���תChar����
                                          char[] p = dnas2.toCharArray();
                                          len=dnas1.length();
                                          SimpleAttributeSet set2 = new SimpleAttributeSet();//����һ������
                                          StyleConstants.setFontSize(set2,16);//�����ֺ�
                                          int rightCount = 0;
                                          for(int i=0;i<len;i++){
                                              if(s[i]=='-'){
                                                  StyleConstants.setForeground(set2,Color.BLUE);//����������ɫ
                                                  docs2.insertString(docs2.getLength(),String.valueOf(p[i]), set2);
                                              }else if(p[i]=='-'){
                                                  StyleConstants.setForeground(set2,Color.BLUE);//����������ɫ
                                                  docs1.insertString(docs1.getLength(),String.valueOf(s[i]), set2);
                                              }else if(s[i]==p[i]){
                                                  rightCount++;
                                                  StyleConstants.setForeground(set2,Color.black);//����������ɫ
                                                  docs1.insertString(docs1.getLength(),String.valueOf(s[i]), set2);
                                                  docs2.insertString(docs2.getLength(),String.valueOf(p[i]), set2);
                                              }else if(s[i]!=p[i]){
                                                  StyleConstants.setForeground(set2,Color.red);//����������ɫ
                                                  docs1.insertString(docs1.getLength(),String.valueOf(s[i]), set2);
                                                  docs2.insertString(docs2.getLength(),String.valueOf(p[i]), set2);
                                              }else{
                                                  System.out.print("���Ǹ�����ɫ");
                                              }
                                          }

                                          // ��������
                                          user.setTypeCount(len);
                                          user.setRightCount(rightCount);
                                          HandleDataList.saveCurrentUserData(user);
                                          btMid.setText("��ȷ�ʣ�" + user.getNewAccuracy() * 100 + "%");
                                      }catch(Exception e1){
                                          System.out.println("ѡ���ļ�2����");
                                      }
                                  }
                              }
        );
    }
}