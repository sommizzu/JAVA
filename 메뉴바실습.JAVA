package javaapplication39;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class JMenuEx extends JFrame{
    JMenuEx(){
        this.setTitle("메뉴바 만들기 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu f = new JMenu("File");
        
        f.add(new JMenuItem("New"));
        f.add(new JMenuItem("Open"));
        f.addSeparator();//분리선 삽입
        f.add(new JMenuItem("Save"));
        f.add(new JMenuItem("SaveAs"));
        
        menuBar.add(f);
        this.setJMenuBar(menuBar);
        
        this.setLocationRelativeTo(null);
        this.setSize(300, 200);
        this.setVisible(true);
    }
}
public class JavaApplication39 {
    public static void main(String[] args) {
        new JMenuEx();
    }
}
출처: https://whiteit.tistory.com/entry/자바-소스코드-메뉴바-만들기 [소스코드 저장소:: For Example:티스토리]