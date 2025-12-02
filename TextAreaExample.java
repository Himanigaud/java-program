import java.awt.*;
public class TextAreaExample
{
TextAreaExample(){
Frame f=new Frame();
    MenuBar mb=new MenuBar();  
         Menu menu=new Menu("File");   
         MenuItem i1=new MenuItem("New");  
         MenuItem i2=new MenuItem("New Window");  
         MenuItem i3=new MenuItem("Open");  
         MenuItem i4=new MenuItem("Save");  
         MenuItem i5=new MenuItem("Save as");  
TextArea area=new TextArea("Welcome to Notepad ");
area.setBounds(10,30,300,300);
f.add(area);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
 menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         menu.add(i3);  
         menu.add(i4);
         menu.add(i5);
          mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}
public static void main(String args[])
{
new TextAreaExample();
}
}