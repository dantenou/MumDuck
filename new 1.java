ublic class Test12 extends JFrame {
     
	MyPanel mp = new MyPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Test12 t12 = new Test12(); 
	}
	
	public Test12(){
		mp = new MyPanel();
		this.add(mp);
		
		//实现监听
		this.addKeyListener(mp);
		
		this.setSize(250, 300);
		this.setLocation(300, 120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
 
class MyPanel extends JPanel implements  KeyListener{
	Boll boll = new Boll(10,10);
	
	int x= boll.getX();
	int y= boll.getY();
	
	public void paint(Graphics g){
		super.paint(g);
		
		//画出一个小球
		g.setColor(Color.red);
		g.fillOval( x,y, 20, 20);
	}
 
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP){
			y--;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			y++;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			x--;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			x++;
		}
		this.repaint();
	}
 
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
 
class Boll{
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int x=0;
	public Boll(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	int y=0;
}
