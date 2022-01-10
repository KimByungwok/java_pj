package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Member extends JFrame implements ActionListener, ListSelectionListener{
 JPanel leftPanel, rightPanel;
 // 왼쪽 7개의 패널
 JPanel left1, left2, left3, left4, left5, left6, left7;
 // 9개의 라벨 선언
 JLabel left1lb, left2lb, left3lb, left4lb, left5lb, left6lb, left7lb, rightlb;
 // 4개의 텍스트 필드 선언
 JTextField left1tf, left2tf, left3tf, left4tf;
 JComboBox<String> combo; // 취미를 위한 콤보박스 선언
 JRadioButton man, woman; // 성별을 위한 라디오버튼 선언
 ButtonGroup group; // 라디오버튼 그룹핑을 위한 그룹 선언
 //버튼 4개 선언
 JButton b1,b2,b3,b4; // 입력, 수정, 삭제, 검색 버튼
 //리스트 객체 선언
 JList<String> list; // 데이터베이스 내용을 뿌려주기 위한 리스트 선언
 Vector<String> listdata = new Vector<>(); // 리스트를 위한 벡터 선언

 //콤보박스에 들어갈 데이터 배열
 String [] data = {"등산","여행","캠핑","영화관람","당구","스키","골프"}; // 취미

 // DB 연동을 위한 준비
 String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
 String id = "system";
 String pass = "123456";
 Connection con;
 PreparedStatement pstmt;
 ResultSet rs;


 public Member(){
  // 닫기 버튼을 누르면 메모리에서 해제
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  //모든 객체 생성
  leftPanel = new JPanel(); rightPanel = new JPanel(); // 전체적인 왼쪽과 오른쪽 Panel 생성
  left1 = new JPanel(); // 아이디를 위한 Panel
  left2 = new JPanel(); // 패스워드를 위한 Panel
  left3 = new JPanel(); // 전화번호를 위한 Panel
  left4 = new JPanel(); // 주소를 위한 Panel
  left5 = new JPanel(); // 취미를 위한 Panel
  left6 = new JPanel(); // 성별을 위한 Panel
  left7 = new JPanel(); // 버튼을 위한 Panel

  left1lb = new JLabel("                         회           원           가           입");
  left2lb = new JLabel(" 아    이    디  : "); left3lb = new JLabel(" 패 스 워 드  :  ");
  left4lb = new JLabel(" 전 화 번 호  :  "); left5lb = new JLabel(" 주            소  : ");
  left6lb = new JLabel(" 취    미  :  "); left7lb = new JLabel(" 성    별  :  ");
  rightlb = new JLabel("                               모    든    회    원    보    기 ");

  left1tf = new JTextField(15); // 아이디를 위한 TextFeild
  left2tf = new JTextField(15); // 패스워드를 위한 TextFeild
  left3tf = new JTextField(15); // 전화번호를 위한 TextFeild
  left4tf = new JTextField(15); // 주소를 위한 TextFeild

  combo = new JComboBox<String>(data); // 취미를 위한 ComboBox

  man = new JRadioButton("남"); woman = new JRadioButton("여"); // 성별을 위한 RadioButton
  group = new ButtonGroup(); // RadioButton 그룹핑
  group.add(man);
  group.add(woman);

  b1 = new JButton("입력"); // 버튼 4개 선언
  b2 = new JButton("수정");
  b3 = new JButton("삭제");
  b4 = new JButton("검색");

  list = new JList<String>(listdata); // 데이터베이스로부터 받아온 정보를 뿌려주기 위한 List 선언

  //배치하기
  left1.add(left2lb); // 아이디
  left1.add(left1tf);

  left2.add(left3lb); // 패스워드
  left2.add(left2tf);

  left3.add(left4lb); // 전화번호
  left3.add(left3tf);

  left4.add(left5lb); // 주소
  left4.add(left4tf);

  left5.add(left6lb); // 취미
  left5.add(combo);

  left6.add(left7lb); // 성별
  left6.add(man);
  left6.add(woman);

  left7.add(b1); // 버튼
  left7.add(b2);
  left7.add(b3);
  left7.add(b4);

  // 이벤트 부착
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  list.addListSelectionListener(this); // implements ListSelectionListener를 시켜주고, valueChanged를 오버라이딩 해줌

  // 새로운 레이아웃 생성 후 배치
  leftPanel.setLayout(new GridLayout(8, 1));
  leftPanel.add(left1lb); // 회원가입 라벨
  leftPanel.add(left1); // 아이디
  leftPanel.add(left2); // 패스워드
  leftPanel.add(left3); // 전화번호
  leftPanel.add(left4); // 주소
  leftPanel.add(left5); // 취미
  leftPanel.add(left6); // 성별
  leftPanel.add(left7); // 버튼

  // 새로운 레이아웃 생성 후 배치
  rightPanel.setLayout(new BorderLayout()); // List
  rightPanel.add("North", rightlb);
  rightPanel.add(list);

  // 프레임의 레이아웃 생성 후 배치
  setLayout(new GridLayout(1, 2)); // 전체적인 틀을 Frame에 붙임
  this.add(leftPanel);
  this.add(rightPanel);

  //left
  setSize(700,400);
  setVisible(true);

  con(); // 데이터 베이스에 접근 가능하도록 커넥션을 설정
 }


 public static void main(String[] args) {
  new Member();
 }


 @Override
 public void actionPerformed(ActionEvent arg0) {
  // String data = arg0.getSource(); // 버튼의 객체, 이름을 리턴
  String value = arg0.getActionCommand(); // 버튼의 라벨값을 리턴

  if(value.equals("입력"))
   this.insertMember();

  if(value.equals("수정"))
   this.updateMember();

  if(value.equals("삭제"))
   this.deleteMember();

  if(value.equals("검색"))
   this.getAllMember();
 }


 @Override // 리스트의 이벤트를 위한 메소드
 public void valueChanged(ListSelectionEvent arg0) {
  // 클릭한 데이터를 가져옴
  String value = list.getSelectedValue();
  // 잘게 데이터를 쪼개서 멤버에 넣어줌
  String str [] = value.split(" ");
  left1tf.setText(str[0]);
  left2tf.setText(str[1]);
  left3tf.setText(str[2]);
  left4tf.setText(str[3]);
  combo.setSelectedItem(str[4]); // setSelectedItem() - ComboBox 내용을 가져옴;

  /* for(int i=0 ; i<data.length ; i++){
   if(str[4].equals(data[i]))
    combo.setSelectedIndex(i);
  } */

  if(str[5].equals("남"))
   man.setSelected(true); // setSelected() - RadioButton 내용을 가져옴;
  else
   woman.setSelected(true);
 }


 // 데이터 베이스에 접근 가능하도록 커넥션을 설정
 public void con(){
  try{
   // 어느 데이터베이스를 사용할 것인지를 설정
   Class.forName("oracle.jdbc.driver.OracleDriver"); // 대소문자 구문
   // 실제 데이터 베이스에 접근하기 위한 소스를 작성 == 접속완료되면 커넥션을 리턴
   con = DriverManager.getConnection(url, id, pass);
   System.out.println("오라클에 접속 완료");
  } catch (Exception e){
   e.printStackTrace();
  }
 }


 // 입력 버튼을 누르면 실행되는 메소드
 public void insertMember(){
  // 데이터를 모두 입력 받은 후에 데이터 베이스에 연결하여 데이터를 삽입
  // 리스트에다가 회원 정보를 하나의 스트링으로 만든후에 뿌려줌
  try {
   String str = null;

   // 모든 데이터를 가져오시오
   String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
   // 쿼리를 날리기위한 객체를 선언
   pstmt = con.prepareStatement(sql);
   // ?에 데이터를 입력
   pstmt.setString(1, left1tf.getText()); // ID
   pstmt.setInt(2, Integer.parseInt(left2tf.getText())); // PASS
   pstmt.setString(3, left3tf.getText()); // PHONE
   pstmt.setString(4, left4tf.getText()); // ADDRESS
   pstmt.setString(5, String.valueOf(combo.getSelectedItem())); // HOBBY
   if(man.isSelected()) // GENDER
    str = man.getText();
   else
    str = woman.getText();
   pstmt.setString(6, str);

   // 쿼리실행 = 데이터를 돌려 받을때
   pstmt.executeUpdate();
   // 다 ㎱만?자원을 닫아라
   pstmt.close();

  } catch (Exception e) {
   e.printStackTrace();
  }
  getAllMember(); // 검색 메소드
 }


 // 검색 버튼을 누르면 실행되는 메소드
 public void getAllMember(){
  try{
   listdata.removeAllElements(); // 리스트의 내용을 모두 지워서 초기화시킴
   // 쿼리 준비
   String sql = "select * from member";
   pstmt = con.prepareStatement(sql);
   // 결과를 리턴 받기에 resultset 객체를 선언해서 받음
   rs = pstmt.executeQuery();

   // 반복문을 이용하여 데이터를 가져와서 리스트에 붙임
   while(rs.next()){
    String total = "";
    total += rs.getString(1)+" ";
    total += rs.getInt(2)+" ";
    total += rs.getString(3)+" ";
    total += rs.getString(4)+" ";
    total += rs.getString(5)+" ";
    total += rs.getString(6);

    // 벡터에 부착
    listdata.add(total);
   }
   rs.close();
   pstmt.close();

  } catch (Exception e){
   e.printStackTrace();
  }

  // 백터에 있는 데이터를 리스트에 부착
  list.setListData(listdata);
 }


 // 수정 버튼을 누르면 실행되는 메소드
 // 아이디를 중심으로 전화번호와 주소를 수정
 // insertMember()에서 처럼 update 구문에 물음표(?)를 이용해서 구현 가능
 public void updateMember(){
  try {
   String sql = "update member set phone=" +"'"+left3tf.getText()+"'" +", address=" +"'"+left4tf.getText()+"'" +"where id="+"'"+left1tf.getText()+"'";
   // 쿼리를 날리기위한 객체를 선언
   pstmt = con.prepareStatement(sql);

   // 쿼리실행 = 데이터를 돌려 받을때
   pstmt.executeUpdate();
   // 다 ㎱만?자원을 닫아라
   pstmt.close();

  } catch (Exception e) {
   e.printStackTrace();
  }
  getAllMember(); // 검색 메소드
 }


 // 삭제 버튼을 누르면 실행되는 메소드
 // 아이디를 중심으로 그 아이디에 대한 모든 내용을 삭제
 // insertMember()에서 처럼 delete 구문에 물음표(?)를 이용해서 구현 가능
 public void deleteMember(){
  try {
   String sql = "delete from member where id="+"'"+left1tf.getText()+"'";
   // 쿼리를 날리기위한 객체를 선언
   pstmt = con.prepareStatement(sql);

   // 쿼리실행 = 데이터를 돌려 받을때
   pstmt.executeUpdate();
   // 다 ㎱만?자원을 닫아라
   pstmt.close();

  } catch (Exception e) {
   e.printStackTrace();
  }
  getAllMember(); // 검색 메소드
 }
} 