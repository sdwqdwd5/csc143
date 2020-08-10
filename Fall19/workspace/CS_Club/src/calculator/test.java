package calculator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
public class test {
    
    public static void main(String[] args) {    
        // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(525, 825);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();    
        // 添加面板
        frame.add(panel);
        /* 
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        //JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        //userLabel.setBounds(10,20,80,25);
        //panel.add(userLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(25,25,475,150);
        panel.add(userText);

//        // 输入密码的文本域
//        JLabel passwordLabel = new JLabel("Password:");
//        passwordLabel.setBounds(10,50,80,25);
//        panel.add(passwordLabel);

        /* 
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
//        JPasswordField passwordText = new JPasswordField(20);
//        passwordText.setBounds(100,50,165,25);
//        panel.add(passwordText);

        // 创建登录按钮
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton divide = new JButton("÷");
        JButton multiple = new JButton("X");
        JButton minus = new JButton("-");
        JButton plus = new JButton("+");
        JButton equal = new JButton("=");
        JButton percentage = new JButton("%");
        JButton changesign = new JButton("+/-");
        JButton clear = new JButton("C");
        JButton decimal = new JButton(".");
       
        panel.add(button(one,25,575));
        panel.add(button(two,150,575));
        panel.add(button(three,275,575));
        panel.add(button(four,25,450));
        panel.add(button(five,150,450));
        panel.add(button(six,275,450));
        panel.add(button(seven,25,325));
        panel.add(button(eight,150,325));
        panel.add(button(nine,275,325));
        panel.add(button(divide,400,200));
        panel.add(button(multiple,400,325));
        panel.add(button(minus,400,450));
        panel.add(button(plus,400,575));
        panel.add(button(equal,25,575));
        panel.add(button(percentage,275,200));
        panel.add(button(changesign,150,200));
        panel.add(button(clear,25,200));
        panel.add(button(equal,400,700));
        panel.add(button(decimal,275,700));
        zero.setBounds(25,700,225,100);
        panel.add(zero);
       
        
    }
    public static JButton button(JButton button, int x, int y) {
    	button.setBounds(x,y,100,100);
    	return button;
    }
}