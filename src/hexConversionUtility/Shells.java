package hexConversionUtility;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;

import java.awt.TextArea;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.DateTime;

public class Shells extends Shell {
	private Text text;
	private Table table;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			Shells shell = new Shells(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * 
	 * @param display
	 */
	public Shells(Display display) {
		super(display, SWT.SHELL_TRIM);

		TabFolder tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setBounds(10, 10, 563, 381);

		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("\u8FDB\u5236\u8F6C\u6362");

		Group group = new Group(tabFolder, SWT.NONE);
		group.setText("\u64CD\u4F5C\u9875\u9762");
		tbtmNewItem.setControl(group);

		text = new Text(group, SWT.BORDER);
		text.setBounds(79, 24, 135, 23);

		Label label = new Label(group, SWT.NONE);
		label.setBounds(231, 30, 30, 17);
		label.setText("\u8FDB\u5236");

		Combo combo = new Combo(group, SWT.NONE);
		combo.setFont(SWTResourceManager.getFont("黑体", 11, SWT.NORMAL));
		combo.setItems(new String[] { "2", "8", "10", "16", "" });
		combo.setBounds(269, 24, 88, 25);
		combo.select(0);

		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setBounds(374, 24, 80, 27);
		btnNewButton.setText("\u8F6C\u6362");

		Button btnNewButton_1 = new Button(group, SWT.NONE);
		btnNewButton_1.setBounds(460, 24, 80, 27);
		btnNewButton_1.setText("\u6E05\u96F6");

		table = new Table(group, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 63, 530, 266);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
	

		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setToolTipText("");
		tblclmnNewColumn.setWidth(132);
		tblclmnNewColumn.setText("2\u8FDB\u5236");

		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(133);
		tblclmnNewColumn_1.setText("8\u8FDB\u5236");

		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(132);
		tblclmnNewColumn_2.setText("10\u8FDB\u5236");

		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(127);
		tblclmnNewColumn_3.setText("16\u8FDB\u5236");

		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {});
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		lblNewLabel.setBounds(10, 30, 69, 17);
		lblNewLabel.setText("\u8F93\u5165\u6570\u5B57\uFF1A");

		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("\u7B80\u4ECB");

		Group group_1 = new Group(tabFolder, SWT.NONE);
		group_1.setText("\u7B80\u4ECB");
		tbtmNewItem_1.setControl(group_1);
		
		Label lblNewLabel_2 = new Label(group_1, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("微软雅黑", 10, SWT.NORMAL));
		lblNewLabel_2.setBounds(27, 23, 501, 295);
		lblNewLabel_2.setText("\u4F5C\u8005\uFF1A\u5E9E\u6668\r\n\r\n\u7248\u672C\uFF1A1.0\r\n\r\n\u7B80\u4ECB\uFF1A\u4ECA\u5929\u770B\u5230eclipse\u6709SWT\u63D2\u4EF6\uFF0C\u53EF\u89C6\u5316\u56FE\u5F62\u754C\u9762\u3002\u8BD5\u7740\u505A\u4E86\u4E2A\u7B80\u5355\u768416\u8FDB\u5236\u5185\u7684\u8F6C\r\n\u6362\u5DE5\u5177\uFF0C\u4EE3\u7801\u6BD4\u8F83\u4E71\uFF0C\u56E0\u4E3A\u5BF9swing\u7C7B\u8FD8\u662F\u4E0D\u719F\uFF0C\u4EE5\u524D\u6CA1\u5199\u8FC7\uFF0C\u4E89\u53D6\u4EE5\u540E\u591A\u5199\u5199\u5BA2\u6237\u7AEF\u3002\r\n\r\n\u4E0B\u4E00\u4E2A\u7248\u672C\uFF0C\u5148\u91CD\u6784\u4EE3\u7801\uFF01\uFF01\r\n\r\n");

		btnNewButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {

				String num = text.getText();
				int srcBase = Integer.valueOf(combo.getText());
				String desBase2 = baseNum(num, srcBase, 2);
				String desBase8 = baseNum(num, srcBase, 8);
				String desBase10 = baseNum(num, srcBase, 10);
				String desBase16 = baseNum(num, srcBase, 16);
				String[] output = new String[] { desBase2, desBase8, desBase10, desBase16 };
				tableItem.setText(output);
			}
		});

		btnNewButton_1.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				text.setText("");
				combo.setText("");
				tableItem.setText(new String[]{"","","",""});
				
			}

		});
		
/*		Timer tmr = new Timer();  
	    tmr.scheduleAtFixedRate(new JLabelTimerTask(lblNewLabel_1), new Date(), 1000); */
	     

		createContents();
	}
	
	/*protected class JLabelTimerTask extends TimerTask { 
		
		private Label l;
		public JLabelTimerTask(Label l){
			this.l = l;
		}
        SimpleDateFormat dateFormatter = new SimpleDateFormat(  
        		"yyyy-MM-dd hh:mm:ss");  
        
        @Override
        public void run() {  
            String time = dateFormatter.format(Calendar.getInstance().getTime());  
            l.setText(time);  
        }  
    }  */

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("\u8FDB\u5236\u8F6C\u6362\u5DE5\u5177-by pricker");
		setSize(599, 439);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public static String baseNum(String num, int srcBase, int destBase) {
		if (srcBase == destBase) {
			return num;
		}
		String digths = "0123456789ABCDEF";
		char[] chars = num.toCharArray();
		int len = chars.length;
		if (destBase != 10) {// 目标进制不是十进制 先转化为十进制
			num = baseNum(num, srcBase, 10);
		} else {
			int n = 0;
			for (int i = len - 1; i >= 0; i--) {
				n += digths.indexOf(chars[i]) * Math.pow(srcBase, len - i - 1);
			}
			return n + "";
		}
		return baseString(Integer.valueOf(num), destBase);
	}

	public static String baseString(int num, int base) {
		if (base > 16) {
			throw new RuntimeException("进制数超出范围，base<=16");
		}
		StringBuffer str = new StringBuffer("");
		String digths = "0123456789ABCDEF";
		Stack<Character> s = new Stack<Character>();
		String numStr = String.valueOf(num);
		boolean isMinus = false;// 判断输入的数是不是负数
		if (numStr.charAt(0) == '-') {
			num = Integer.valueOf(numStr.substring(1));
			isMinus = true;
		}
		while (num != 0) {
			s.push(digths.charAt(num % base));
			num /= base;
		}
		if (isMinus)
			str.append("-");
		while (!s.isEmpty()) {
			str.append(s.pop());
		}
		return str.toString();
	}
}
