package de.uni.freiburg.iig.telematik.wolfgang.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import de.invation.code.toval.validate.Validate;
import de.uni.freiburg.iig.telematik.wolfgang.editor.Wolfgang;

public abstract class AbstractWolfgangAction extends AbstractAction {

	private static final long serialVersionUID = -536769777534949749L;
	
	protected Wolfgang wolfgang = null;
	
	private ImageIcon icon;

	protected AbstractWolfgangAction(Wolfgang wolfgang) {
		super();
		setWolfgang(wolfgang);
	}

	protected AbstractWolfgangAction(Wolfgang wolfgang, String name) {
		super(name);
		setWolfgang(wolfgang);
	}
	
	protected AbstractWolfgangAction(Wolfgang wolfgang, String name, Icon icon) {
		super(name, icon);
		setWolfgang(wolfgang);
		setIcon(icon);
	}
	
	protected void setIcon(Icon icon) {
		Validate.notNull(icon);
		this.icon = (ImageIcon) icon;
	}
	
	protected ImageIcon getIcon() {
		return icon;
	}
	
	private void setWolfgang(Wolfgang wolfgang) {
		Validate.notNull(wolfgang);
		this.wolfgang = wolfgang;
	}

	protected Wolfgang getWolfgang() {
		return wolfgang;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			doFancyStuff(e);
		} catch(Exception ex){
			JOptionPane.showMessageDialog(wolfgang, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	protected abstract void doFancyStuff(ActionEvent e) throws Exception;
	

}
